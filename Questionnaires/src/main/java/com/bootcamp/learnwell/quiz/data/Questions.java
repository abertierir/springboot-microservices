package com.bootcamp.learnwell.quiz.data;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@AllArgsConstructor
@Data
public class Questions {
	String question;
	String answer;
}
