package com.bootcamp.learnwell.components;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.model.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentEntityConverterTest {

	@Autowired
	IEntityConverter entityConverter;
	
	@Test
	public void data_to_student() {
			//given
			StudentDto studentDto = new StudentDto();
			//when-then
			assertThat(entityConverter.dataToEntity(studentDto),any(Student.class));
	}
	
	@Test
	public void student_to_data() {
			//given
			Student student = new Student();
			//when-then
			assertThat(entityConverter.entityToData(student),any(StudentDto.class));
	}

}
