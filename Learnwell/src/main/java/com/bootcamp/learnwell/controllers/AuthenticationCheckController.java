package com.bootcamp.learnwell.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.learnwell.model.AuthenticationCheckResult;
import com.bootcamp.learnwell.model.AuthenticationStatus;
import com.bootcamp.learnwell.services.ReadStudentService;

@RestController
@RequestMapping("/student")
public class AuthenticationCheckController {
	
	@Autowired
	ReadStudentService readStudentService;
	
	@GetMapping(path="/{id}",  produces = {MediaType.APPLICATION_JSON_VALUE})
	public AuthenticationCheckResult authenticationCheck(@PathVariable("id") String idStudent, @RequestHeader("role") String role) {
		if(role!="client") {
			return new AuthenticationCheckResult(AuthenticationStatus.AUTHENTICATION_FAILED, "It is forbidden to access these information");
		}
		return (readStudentService.readStudent(idStudent)!=null)?
			new AuthenticationCheckResult(AuthenticationStatus.AUTHORIZED_USER, null):
			new AuthenticationCheckResult(AuthenticationStatus.AUTHENTICATION_FAILED, "Not Found User in our DataBase");
	}
}
