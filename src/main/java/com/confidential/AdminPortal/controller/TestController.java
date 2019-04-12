package com.confidential.AdminPortal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestController {

//	@PreAuthorize("hasRole('ADMIN')")
//	@PreAuthorize("hasRole('ADMIN')")
	@PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(path = "/protected/hello", method = RequestMethod.GET)
	public Map<String, String> sayHello() {
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "This is a secret message for admin");

		return map;
	}
	
	private HttpHeaders getNoCacheHeaders() {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Cache-Control", "no-cache");
		return responseHeaders;
	}
}
