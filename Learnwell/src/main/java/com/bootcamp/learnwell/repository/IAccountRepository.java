package com.bootcamp.learnwell.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.learnwell.model.Student;

public interface IAccountRepository extends JpaRepository<Student, String>{

	public Student findByUserName(String userName);
	public Student findByEmail(String email);
	public Student findByStudentId(String studentId);

}
