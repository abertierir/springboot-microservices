package com.bootcamp.learnwell.services;



import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertThat;

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
		assertThat(signUpService.processNewUser(studentDto),any(String.class));
	}

	@Test
	public void a_registered_user_is_trying_to_sign_up_again() {
		//given
		StudentDto studentDto = new StudentDto();
		studentDto.setUserName("Pablito");
		studentDto.setEmail("Pablito@gmail.com");
		studentDto.setPassword("sdfasdf");
		//when-then
		assertThat(signUpService.processNewUser(studentDto),null);
	}

}
