package com.dailycodework.sbemailverificationdemo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
	    private String token;
	    private String username;
	    private String role;
	    private Long id;
	    private String nombre;
    
}
