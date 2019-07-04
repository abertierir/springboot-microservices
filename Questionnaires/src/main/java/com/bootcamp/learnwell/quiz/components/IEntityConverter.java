package com.bootcamp.learnwell.quiz.components;

import com.bootcamp.learnwell.quiz.data.Quiz;
import com.bootcamp.learnwell.quiz.dto.QuizDto;

public interface IEntityConverter {

	Quiz dataToEntity(QuizDto quizDto);

	QuizDto entityToData(Quiz quiz, String idQuiz);

}
