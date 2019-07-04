package com.bootcamp.learnwell.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String idStudent;
	
	@Column(nullable = false)
	private String userName;
	
	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String email;

	@OneToMany(mappedBy="student")
	private Set<QuestionnairesId> questionnaires;
	
}
