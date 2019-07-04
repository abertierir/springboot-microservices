package com.bootcamp.learnwell.quiz.components;

import org.springframework.stereotype.Component;

import com.bootcamp.learnwell.quiz.data.Quiz;
import com.bootcamp.learnwell.quiz.dto.QuizDto;

@Component
public class EntityConverter implements IEntityConverter {

	@Override
	public Quiz dataToEntity(QuizDto quizDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuizDto entityToData(Quiz quiz, String idQuiz) {
		// TODO Auto-generated method stub
		return null;
	}

}
