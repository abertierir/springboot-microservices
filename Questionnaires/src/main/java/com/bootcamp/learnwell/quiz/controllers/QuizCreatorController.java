package com.bootcamp.learnwell.quiz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.learnwell.quiz.data.QuizAppResult;
import com.bootcamp.learnwell.quiz.dto.QuizDto;
import com.bootcamp.learnwell.quiz.service.IQuizService;

@RestController
@RequestMapping("/student/{id}/questionnaire")
public class QuizCreatorController {
	 
	@Autowired
	IQuizService quizService;
	
	@PostMapping(path="/", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<QuizAppResult> createQuiz(@PathVariable("id") String idStudent, 
			@RequestBody QuizDto quiz ) {
		QuizAppResult quizCreatorResponse = quizService.createQuiz(idStudent,quiz);
		HttpStatus httpStatus = (quizCreatorResponse.getQuizDto()!=null)?
		HttpStatus.CREATED:HttpStatus.FORBIDDEN;
		return new ResponseEntity<QuizAppResult>(quizCreatorResponse,httpStatus);
	}
	
}
