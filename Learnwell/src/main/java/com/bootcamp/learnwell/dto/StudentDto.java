package com.bootcamp.learnwell.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.bootcamp.learnwell.components.ValidEmail;

import lombok.Data;

@Data
public class StudentDto {
	
	@NotNull
    @NotEmpty
    private String userName;
	
	@ValidEmail
    @NotEmpty
    private String email;
	
	@NotNull
    @NotEmpty
    private String password;
}
