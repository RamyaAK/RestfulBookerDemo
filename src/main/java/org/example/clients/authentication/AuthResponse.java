package org.example.clients.authentication;

import org.example.clients.BaseResponse;



public class AuthResponse extends BaseResponse {
    public String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
