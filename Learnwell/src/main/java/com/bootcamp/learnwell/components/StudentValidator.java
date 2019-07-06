package com.bootcamp.learnwell.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bootcamp.learnwell.repository.IAccountRepository;

@Component
@Qualifier("studentValidator")
public class StudentValidator implements IUserValidator{
	
	
	private IAccountRepository studentRepository;
	
	 public StudentValidator (IAccountRepository studentRepository) {
	        this.studentRepository = studentRepository;
	   }

	@Override
	public boolean emailAlreadyExists(String email){
		return (studentRepository.findByEmail(email)!= null)?true:false;
	}
	
	public boolean verifyTokens() {
		return true;
	}
}
