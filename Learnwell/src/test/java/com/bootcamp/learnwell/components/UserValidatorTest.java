package com.bootcamp.learnwell.components;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.model.Student;
import com.bootcamp.learnwell.repository.IAccountRepository;

public class UserValidatorTest {
	/* 
	IAccountRepository accountRepository=Mockito.mock(IAccountRepository.class);
	
	UserValidator userValidator = new UserValidator(accountRepository);
	
	@Test
	public void verify_an_email_exists() {
				
		when(accountRepository.findByEmail("andrea.bertieri@gmail.com")).thenReturn(new Student());
		assertTrue(userValidator.emailAlreadyExists("andrea.bertieri@gmail.com"));
	}
	
	@Test
	public void registered_email_already() {
				
		NoReturn().when(accountRepository.findByEmail("andreita_B912@gmail.com")).thenReturn();
		assertFalse(userValidator.emailAlreadyExists("andrea.bertieri@gmail.com"));
	}*/

}
