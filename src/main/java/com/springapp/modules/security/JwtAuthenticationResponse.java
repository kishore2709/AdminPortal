package com.springapp.modules.security;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtAuthenticationResponse {
    private String accessToken;
    private final JwtUser user;

 
}