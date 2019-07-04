package com.bootcamp.learnwell.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Questionnaires")
public class QuestionnairesId {
	
	@Id
	private String id;
	
	@ManyToOne
	@JoinColumn(name="idStudent")
	private Student student;

}
