package com.bootcamp.learnwell.quiz.data;

import com.bootcamp.learnwell.quiz.dto.QuizDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuizAppResult {
	
	private QuizDto quizDto;
	
	private AuthenticationStatus authenticationStatus;

	private String rejectionReason;

}
