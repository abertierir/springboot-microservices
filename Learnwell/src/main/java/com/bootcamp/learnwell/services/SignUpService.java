package com.bootcamp.learnwell.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.bootcamp.learnwell.components.IEntityConverter;
import com.bootcamp.learnwell.components.IUserValidator;
import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.repository.IAccountRepository;

@Service
@Configurable
public class SignUpService implements ISignUpService{
	
	@Autowired
	private IUserValidator studentValidator;

	@Autowired
	private IEntityConverter studentEntityConverter;
	
	@Autowired
	private IAccountRepository studentRepository;
	
	@Override
	public boolean processNewUser(StudentDto studentDto) {
		return studentValidator.emailAlreadyExists(studentDto.getEmail())? false:
			(studentRepository.save(studentEntityConverter.dataToEntity(studentDto))!=null)?true:false;
	}

}
