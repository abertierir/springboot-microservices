package com.bootcamp.learnwell.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.learnwell.components.StudentEntityConverter;
import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.repository.IAccountRepository;

@Service
public class ReadStudentService implements IReadUserService{

	@Autowired
	IAccountRepository accountRepository;
	
	@Autowired 
	StudentEntityConverter studentEntityConverter;
	
	@Override
	public StudentDto readStudent(String idStudent) {
		StudentDto studentDto= studentEntityConverter.entityToData(
				accountRepository.findByIdStudent(idStudent));
		return studentDto;
	}

}
