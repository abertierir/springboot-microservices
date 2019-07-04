package com.bootcamp.learnwell.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bootcamp.learnwell.dto.StudentDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SignUpServiceTest {
	
	@Autowired
	SignUpService signUpService;
	  
	@Test
	public void a_new_user_is_trying_to_sign_up() {
		//given
		StudentDto studentDto = new StudentDto();
		studentDto.setUserName("Pablito");
		studentDto.setEmail("Pablito@gmail.com");
		studentDto.setPassword("sdfasdf");
		//when-then
		assertTrue(signUpService.processNewUser(studentDto));
	}

	@Test
	public void a_registered_user_is_trying_to_sign_up_again() {
		//given
		StudentDto studentDto = new StudentDto();
		studentDto.setUserName("Pablito");
		studentDto.setEmail("Pablito@gmail.com");
		studentDto.setPassword("sdfasdf");
		//when-then
		assertFalse(signUpService.processNewUser(studentDto));
	}

}
