package com.springapp.modules.system.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.aop.log.Log;
import com.springapp.exception.BadRequestException;
import com.springapp.modules.security.repository.RoleRepository;
import com.springapp.modules.security.repository.UserRepository;
import com.springapp.modules.system.domain.User;
import com.springapp.modules.system.service.UserService;

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

	
}
