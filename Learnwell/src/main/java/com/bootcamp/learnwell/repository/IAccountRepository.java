package com.bootcamp.learnwell.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bootcamp.learnwell.model.Student;

@Repository
@Component
@Qualifier("studentRepository")
public interface IAccountRepository extends JpaRepository<Student, String>{

	public Student findByIdStudent(String idStudent);
	public Student findByUserName(String userName);
	public Student findByEmail(String email);

}
