package com.bootcamp.learnwell.model;

import javax.persistence.Id;

import lombok.Data;

@Data
public class BaseQuestionnaire {
	
	@Id
    public String id;
	
	private String title;
	private String objective;
	private String references;
	private boolean publicState;
	private String state; //Revisar como agregar una colección o datos fijos
	private String topic;
	private String keyWords;
}
