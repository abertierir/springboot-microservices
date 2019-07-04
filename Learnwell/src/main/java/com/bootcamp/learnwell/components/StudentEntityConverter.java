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
		Student student = new Student();    
		student.setUserName(studentDto.getUserName());
		student.setEmail(studentDto.getEmail());
		student.setPassword(studentDto.getPassword());
        return student;
	}

	public StudentDto entityToData(Student findByIdStudent) {
		return null;
	}
	
	//@Autowired
		// private BCryptPasswordEncoder bCryptPasswordEncoder;
		/*
		//Evaluar la posibilidad de implementar un patron de execution
		public void manageSignUpRequest(StudentDto studentDto){
			if (Authenticator.emailExists(studentDto.getEmail())) {
				successfulSignUp=false;
			}else {
				accountRepository.save(dtoToEntity(studentDto));
				successfulSignUp=true;
			}
		}
		
		private Student dtoToEntity(StudentDto studentDto) {
			Student student = new Student();
			BeanUtils.copyProperties(studentDto, student);
			//student.setPassword(bCryptPasswordEncoder.encode(student.getPassword()));
			return student;
		}

		*/

}
