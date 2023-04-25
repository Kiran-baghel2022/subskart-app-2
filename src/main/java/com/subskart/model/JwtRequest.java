package com.subskart.model;

import lombok.Data;

@Data
public class JwtRequest {
    private String usernameOrEmail;
    private String password;
}
