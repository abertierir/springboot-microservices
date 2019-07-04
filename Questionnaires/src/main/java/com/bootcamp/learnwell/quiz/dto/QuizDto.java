package com.bootcamp.learnwell.quiz.dto;

import java.util.List;

import com.bootcamp.learnwell.quiz.data.Questions;

import lombok.Data;

@Data
public class QuizDto {
	
	private String title;
	
	private String objective;
	
	private List<Questions> questions;

}
