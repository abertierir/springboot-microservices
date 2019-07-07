package com.bootcamp.learnwell.services;



import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bootcamp.learnwell.dto.StudentDto;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class SignUpServiceTest {
	
	@Autowired
	SignUpService signUpService;

	@Test
	public void a_new_user_is_trying_to_sign_up() {
			//given
			StudentDto studentDto = new StudentDto();
			studentDto.setUserName("Pepe8");
			studentDto.setEmail("Pepe8@gmail.com");
			studentDto.setPassword("sdfasdf");
			//when-then
			assertThat(signUpService.registerNewUser(studentDto),any(String.class));
	}
	
	@Test
	public void a_registered_user_is_trying_to_sign_up_again() {
		//given
		StudentDto studentDto = new StudentDto();
		studentDto.setUserName("Pepe8");
		studentDto.setEmail("Pepe8@gmail.com");
		studentDto.setPassword("sdfasdf");
		//when-then
		assertNull(signUpService.registerNewUser(studentDto));
	}

}
