package com.bootcamp.learnwell.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.model.Student;
import com.bootcamp.learnwell.repository.IAccountRepository;

@Service
public class AdminProfileService implements IAdminProfileService{
	
	
	private IAccountRepository studentRepository;
	
	 public AdminProfileService  (IAccountRepository studentRepository) {
	        this.studentRepository = studentRepository;
	   }
	
	@Override
	public void editUserProfile(StudentDto studentDto, String studentId) {
		Student studentDB = studentRepository.findByStudentId(studentId);
		studentDB.setEmail(studentDto.getEmail());
		studentRepository.save(studentDB);
	}

	@Override
	public void deleteUserProfile(String studentId) {
		studentRepository.delete(studentRepository.findByStudentId(studentId));
	}
	

}
