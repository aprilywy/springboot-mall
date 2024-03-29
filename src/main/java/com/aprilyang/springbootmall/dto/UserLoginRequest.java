package com.aprilyang.springbootmall.dto;

import javax.validation.constraints.NotBlank;

public class UserLoginRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public UserLoginRequest() {
	
	}

	public UserLoginRequest(@NotBlank String username, @NotBlank String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
