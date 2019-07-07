package com.bootcamp.learnwell.components;

import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.model.Student;

public interface IEntityConverter {
	
	//REVISAR: Student Dto podría cambiarse por una clase padre o una clase dedicada solo al login
	public Student dataToEntity (StudentDto student);
	public StudentDto entityToData(Student student);
}
