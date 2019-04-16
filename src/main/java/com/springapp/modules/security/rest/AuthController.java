package com.springapp.modules.security.rest;

import java.net.URI;
import java.util.Collections;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.confidential.AdminPortal.payload.LoginRequest;
import com.confidential.AdminPortal.payload.SignUpRequest;
import com.confidential.AdminPortal.payload.response.ApiResponse;
import com.springapp.exception.AppException;
import com.springapp.modules.security.AuthoritiesConstants;
import com.springapp.modules.security.JwtAuthenticationResponse;
import com.springapp.modules.security.JwtTokenUtil;
import com.springapp.modules.security.JwtUser;
import com.springapp.modules.security.repository.RoleRepository;
import com.springapp.modules.security.repository.UserRepository;
import com.springapp.modules.security.service.MyUserDetailsService;
import com.springapp.modules.system.domain.Role;
import com.springapp.modules.system.domain.User;
import com.springapp.utils.EncryptUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/auth")
public class AuthController<Auth> {
	
	@Autowired
    private MyUserDetailsService userDetailsService;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	JwtTokenUtil tokenProvider;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
		final JwtUser jwtUser = (JwtUser) userDetailsService.loadUserByUsername(loginRequest.getUsernameOrEmail());
		log.debug(" login pwd "+loginRequest.getPassword());
		log.debug("jwt pwd "+jwtUser.getPassword()+" login pwd "+EncryptUtils.encryptPassword(loginRequest.getPassword()));
        if(!jwtUser.getPassword().equals(EncryptUtils.encryptPassword(loginRequest.getPassword()))){
            throw new AccountExpiredException("wrong password2");
        }

        if(!jwtUser.isEnabled()){//it is not validated now
            throw new AccountExpiredException("The account has been disabled, please contact the administrator");
        }

        final String token = tokenProvider.generateToken(jwtUser);
		return ResponseEntity.ok(new JwtAuthenticationResponse(token, jwtUser));
	}

	@SuppressWarnings("unchecked")
	@PostMapping("/signup") public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpUser) { 
		log.debug(" registerUser ");
		System.out.println(" registerUser ");
		/*
		 * if(userRepository.existsByUsername(signUpUser.getUsername())) { return new
		 * ResponseEntity(new ApiResponse(false,
		 * "Username is already taken!"),HttpStatus.BAD_REQUEST); }
		 * 
		 * if (userRepository.existsByEmail(signUpUser.getEmail())) { return new
		 * ResponseEntity(new ApiResponse(false,
		 * "Email Address already in use!"),HttpStatus.BAD_REQUEST); }
		 */
		User u = new User();
		
		u.setUsername(signUpUser.getUsername());
		u.setEmail(signUpUser.getEmail());
		u.setPhone("1234567890");
		u.setEnabled(false);
	  u.setPassword(EncryptUtils.encryptPassword(signUpUser.getPassword()));
	  
	  Role userRole = roleRepository.findByName(AuthoritiesConstants.NORMAL_USER) .orElseThrow(() ->
	  new AppException("User Role not set."));
	  
	  u.setRoles(Collections.singleton(userRole));
	  
	  User result = userRepository.save(u);
	  
	  URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path(
	  "/api/users/{username}") .buildAndExpand(result.getUsername()).toUri();
	  System.out.println("User registered successfully"); return
	  ResponseEntity.created(location).body(new ApiResponse(true,
	  "User registered successfully")); 
	  }

}
