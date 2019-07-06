package com.bootcamp.learnwell.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.model.Student;

@Component
@Qualifier("StudentValidator")
public class StudentEntityConverter implements IEntityConverter{

	public StudentEntityConverter(){}
	
	public Student dataToEntity(StudentDto studentDto) {
		if(studentDto==null) {return null;}
		Student student = new Student();    
		student.setUserName(studentDto.getUserName());
		student.setEmail(studentDto.getEmail());
		student.setPassword(studentDto.getPassword());
        return student;
	}

	public StudentDto entityToData(Student student) {
		if(student==null) {return null;}
		StudentDto studentDto = new StudentDto();    
		studentDto.setUserName(student.getUserName());
		studentDto.setEmail(student.getEmail());
		studentDto.setPassword(student.getPassword());
        return studentDto;
	}
	
}
