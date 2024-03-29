package com.bootcamp.learnwell.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.learnwell.dto.StudentDto;
import com.bootcamp.learnwell.services.ISignUpService;

@RestController
@RequestMapping("/student")
public class SignUpController {
	
	@Autowired
	ISignUpService signUpService;
	
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity <String> createNewStudent(@RequestBody @Valid StudentDto studentDto) {
		String idStudent =signUpService.registerNewUser(studentDto);
		return idStudent!=null? 
				new ResponseEntity<String>(HttpStatus.CREATED):
					new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
}
