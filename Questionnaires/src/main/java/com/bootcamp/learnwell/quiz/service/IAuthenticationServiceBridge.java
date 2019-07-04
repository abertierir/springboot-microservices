package com.bootcamp.learnwell.quiz.service;

import com.bootcamp.learnwell.quiz.data.AuthenticationServiceResponse;

public interface IAuthenticationServiceBridge {
	
	AuthenticationServiceResponse sendRequestToAuthenticationService(String studentId);

	String sendRequestToSaveQuiz(String idQuiz, String studentId);
	
}
