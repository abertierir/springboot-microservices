package com.bootcamp.learnwell.services;

import com.bootcamp.learnwell.dto.StudentDto;

public interface ISignUpService {
	String registerNewUser(StudentDto studentDto);
}
