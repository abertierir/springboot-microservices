package com.bootcamp.learnwell.quiz.service;

import com.bootcamp.learnwell.quiz.data.QuizAppResult;
import com.bootcamp.learnwell.quiz.dto.QuizDto;

public interface IQuizService {
	QuizAppResult createQuiz(String studentId,QuizDto quizDto);
}
