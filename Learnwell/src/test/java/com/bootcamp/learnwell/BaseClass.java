package com.bootcamp.learnwell;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.bootcamp.learnwell.controllers.AuthenticationCheckController;
import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.services.ReadStudentService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LearnwellApplication.class)
public class BaseClass {
	
	@Autowired
	private AuthenticationCheckController authenticationEndpoint;

	@MockBean
	private ReadStudentService readStudentService;

	@Before public void setup() {
		RestAssuredMockMvc.standaloneSetup(authenticationEndpoint);

		Mockito.when(readStudentService.readStudent("1"))
				.thenReturn(new StudentDto());
}
}
