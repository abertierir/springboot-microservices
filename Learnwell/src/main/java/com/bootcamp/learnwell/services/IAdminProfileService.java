package com.bootcamp.learnwell.services;

import com.bootcamp.learnwell.dto.StudentDto;

public interface IAdminProfileService {
	void editUserProfile(StudentDto studentDto, String studentId);
	void deleteUserProfile(String studentId);
}
