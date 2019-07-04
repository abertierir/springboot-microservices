package com.bootcamp.learnwell.quiz.data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Quiz {
	
	@Id
	private String idQuiz;
	
	private String title;
	
	private String objective;
	
	private Privacy privacyStatus;
	
	private List<Questions> questions;
	
	private int days;
	
	private int weeks;
	
	private int months;
}
