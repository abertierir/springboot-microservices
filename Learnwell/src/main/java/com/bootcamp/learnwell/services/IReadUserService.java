package com.bootcamp.learnwell.services;

import com.bootcamp.learnwell.dto.StudentDto;

public interface IReadUserService {
	StudentDto readStudent(String idStudent);
}
