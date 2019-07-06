package com.bootcamp.learnwell.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.learnwell.components.StudentEntityConverter;
import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.repository.IAccountRepository;

@Service
public class SearchUserService implements ISearchUserService{
	
	
	private IAccountRepository studentRepository;
	
	 public SearchUserService (IAccountRepository studentRepository) {
	        this.studentRepository = studentRepository;
	   }
	
	@Autowired
	private StudentEntityConverter entityConverter;
	
	@Override
	public StudentDto adminSearchById(String studentId) {
		return entityConverter.entityToData(studentRepository.findByStudentId(studentId));
	}

	@Override
	public StudentDto SearchByUserName(String userName) {
		return entityConverter.entityToData(studentRepository.findByUserName(userName));
	}
	
}
