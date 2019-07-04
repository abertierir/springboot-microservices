package com.bootcamp.learnwell.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.learnwell.quiz.components.IEntityConverter;
import com.bootcamp.learnwell.quiz.data.AuthenticationServiceResponse;
import com.bootcamp.learnwell.quiz.data.AuthenticationStatus;
import com.bootcamp.learnwell.quiz.data.Quiz;
import com.bootcamp.learnwell.quiz.data.QuizAppResult;
import com.bootcamp.learnwell.quiz.dto.QuizDto;
import com.bootcamp.learnwell.quiz.repository.IQuizRepository;

@Service
public class QuizService implements IQuizService{
	
	@Autowired 
	IAuthenticationServiceBridge authenticationServiceBridge;
	
	@Autowired
	private IEntityConverter quizEntityConverter;
	
	@Autowired
	private IQuizRepository quizRepository;
	
	@Override
	public QuizAppResult createQuiz(String studentId, QuizDto quizDto) {
		AuthenticationServiceResponse response = authenticationServiceBridge.sendRequestToAuthenticationService(studentId);
		if(response.getAuthenticationStatus()==AuthenticationStatus.AUTHORIZED_USER) {
			return new QuizAppResult(saveQuiz(quizDto, studentId), response.getAuthenticationStatus(), response.getRejectionReason());
		}else {
			return new QuizAppResult(null, response.getAuthenticationStatus(), response.getRejectionReason());
		}
	}
	
	private QuizDto saveQuiz(QuizDto quizDto, String studentId) {
		Quiz quiz= quizRepository.save(quizEntityConverter.dataToEntity(quizDto));
		String id=authenticationServiceBridge.sendRequestToSaveQuiz(quiz.getIdQuiz(),studentId);
		return quizEntityConverter.entityToData(quiz, id);
	}

}
