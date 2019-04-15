package com.springapp.modules.security.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.confidential.AdminPortal.payload.LoginRequest;
import com.springapp.modules.security.JwtAuthenticationResponse;
import com.springapp.modules.security.JwtTokenUtil;
import com.springapp.modules.security.JwtUser;
import com.springapp.modules.security.repository.RoleRepository;
import com.springapp.modules.security.repository.UserRepository;
import com.springapp.modules.security.service.MyUserDetailsService;
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

	
}
