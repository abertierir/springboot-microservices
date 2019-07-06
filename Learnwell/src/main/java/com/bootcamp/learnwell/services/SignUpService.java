package com.bootcamp.learnwell.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.learnwell.components.IEntityConverter;
import com.bootcamp.learnwell.components.IUserValidator;
import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.model.Student;
import com.bootcamp.learnwell.repository.IAccountRepository;

@Service
public class SignUpService implements ISignUpService{
	
	@Autowired
	private IUserValidator studentValidator;

	@Autowired
	private IEntityConverter studentEntityConverter;
	
	
	private IAccountRepository studentRepository;

    public SignUpService (IAccountRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
	
	@Override
	public String processNewUser(StudentDto studentDto) {
		//if(studentValidator.emailAlreadyExists(studentDto.getEmail())) {return null;}
		Student student=studentEntityConverter.dataToEntity(studentDto);
		return (studentRepository.save(student)!=null)?student.getStudentId():"not save the user";
	}

}
