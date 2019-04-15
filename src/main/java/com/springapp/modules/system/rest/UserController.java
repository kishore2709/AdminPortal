package com.springapp.modules.system.rest;

import java.net.URI;
import java.util.Collections;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.confidential.AdminPortal.payload.response.ApiResponse;
import com.springapp.aop.log.Log;
import com.springapp.exception.AppException;
import com.springapp.exception.BadRequestException;
import com.springapp.modules.security.AuthoritiesConstants;
import com.springapp.modules.security.repository.RoleRepository;
import com.springapp.modules.security.repository.UserRepository;
import com.springapp.modules.system.domain.Role;
import com.springapp.modules.system.domain.User;
import com.springapp.modules.system.service.UserService;
import com.springapp.utils.EncryptUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;

	private static final String ENTITY_NAME = "user";

	@Log("New users")
	@PostMapping(value = "/signup")
	@PreAuthorize("hasAnyRole('ADMIN','USER_ALL','USER_CREATE')")
	public ResponseEntity create(@Validated @RequestBody User resources) {
		if (resources.getId() != null) {
			throw new BadRequestException("A new " + ENTITY_NAME + " cannot already have an ID");
		}
		return new ResponseEntity(userService.create(resources), HttpStatus.CREATED);
	}

	@SuppressWarnings("unchecked")
	@PostMapping("/signup") public ResponseEntity<?> registerUser(@Valid @RequestBody User signUpRequest) { 
		if(userRepository.existsByUsername(signUpRequest.getUsername())) { 
			return new ResponseEntity(new ApiResponse(false, "Username is already taken!"),HttpStatus.BAD_REQUEST); 
			}
	  
	  if (userRepository.existsByEmail(signUpRequest.getEmail())) { return new
	  ResponseEntity(new ApiResponse(false, "Email Address already in use!"),
	  HttpStatus.BAD_REQUEST); }
	  
	  // Creating user's account 
	  User user = new User();
	  
	  user.setPassword(EncryptUtils.encryptPassword(user.getPassword()));
	  
	  Role userRole = roleRepository.findByName(AuthoritiesConstants.USER) .orElseThrow(() ->
	  new AppException("User Role not set."));
	  
	  user.setRoles(Collections.singleton(userRole));
	  
	  User result = userRepository.save(user);
	  
	  URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path(
	  "/api/users/{username}") .buildAndExpand(result.getUsername()).toUri();
	  System.out.println("User registered successfully"); return
	  ResponseEntity.created(location).body(new ApiResponse(true,
	  "User registered successfully")); 
	  }

}
