package com.bootcamp.learnwell.quiz.service;

import org.assertj.core.api.BDDAssertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerRule;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.learnwell.quiz.data.AuthenticationServiceResponse;
import com.bootcamp.learnwell.quiz.data.AuthenticationStatus;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuizServiceTest {
	
	@Rule
	public StubRunnerRule stubRunnerRule = new StubRunnerRule()
		.downloadStub("com.bootcamp.learnwell.quiz", "quiz", "0.0.1-SNAPSHOT", "stubs")
		.withPort(8100)
		.stubsMode(StubRunnerProperties.StubsMode.LOCAL);
	
	@Autowired
	IQuizService quizService;
	
	@Test
	public void get_student_authentication_from_quiz_service() {
		// given:
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		httpHeader.add("role", "client");
		
		// when:
		ResponseEntity<AuthenticationServiceResponse> response= restTemplate.exchange("http://localhost:8100/student/1", 
				HttpMethod.GET, new HttpEntity<>(httpHeader), AuthenticationServiceResponse.class);
		
		// then:
		BDDAssertions.then(response.getBody().getRejectionReason()).isEqualTo("Not Found User in our DataBase");
		BDDAssertions.then(response.getBody().getAuthenticationStatus()).isEqualTo(AuthenticationStatus.AUTHENTICATION_FAILED);
		BDDAssertions.then(response.getStatusCodeValue()).isEqualTo(400);
	}

}
