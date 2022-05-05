package com.currency.exchange.Auth;

import org.springframework.security.core.userdetails.UserDetails;

public class TokenRequest {

    private String name;
    private String password;

    public TokenRequest() {
    }

    public TokenRequest(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
