package com.confidential.AdminPortal.payload;

import javax.validation.constraints.NotBlank;

public class Auth {
	 
	 private LoginRequest auth;

	public LoginRequest getAuth() {
		return auth;
	}

	public void setAuth(LoginRequest auth) {
		this.auth = auth;
	}
	 
}