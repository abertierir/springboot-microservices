package com.bootcamp.learnwell.services;

import com.bootcamp.learnwell.dto.StudentDto;

public interface ISearchUserService {
	StudentDto adminSearchById (String studentId);
	StudentDto SearchByUserName(String userName);
}
