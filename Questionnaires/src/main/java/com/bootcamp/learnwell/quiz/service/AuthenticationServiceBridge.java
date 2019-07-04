package com.bootcamp.learnwell.quiz.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.learnwell.quiz.data.AuthenticationServiceResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

@Service
public class AuthenticationServiceBridge implements IAuthenticationServiceBridge  {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	private int port=8081;
	
	@Override
	public AuthenticationServiceResponse sendRequestToAuthenticationService(String studentId) {
		ResponseEntity<AuthenticationServiceResponse> response= restTemplate.exchange("http://localhost:"+ port +"/student/"+studentId, 
				HttpMethod.GET, new HttpEntity<>(setHeader()), AuthenticationServiceResponse.class);
		return response.getBody();
	}

	@Override
	public String sendRequestToSaveQuiz(String idQuiz, @JsonProperty("student.id") String studentId) {
		ResponseEntity<String> response= restTemplate.exchange("http://localhost:"+ port +"/student/"+studentId+"/quiz/", 
				HttpMethod.POST, new HttpEntity<>(studentId, setHeader()), String.class);
		return response.getBody();
	}
	
	private HttpHeaders setHeader() {
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		httpHeader.add("role", "client");
		return httpHeader;
	}
	
}
