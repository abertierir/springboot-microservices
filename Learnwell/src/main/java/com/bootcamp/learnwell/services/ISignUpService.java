package com.bootcamp.learnwell.services;

import com.bootcamp.learnwell.dto.StudentDto;

public interface ISignUpService {
	boolean processNewUser(StudentDto studentDto);
}
