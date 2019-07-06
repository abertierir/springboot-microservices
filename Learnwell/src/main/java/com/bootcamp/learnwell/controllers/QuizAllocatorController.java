package com.bootcamp.learnwell.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.learnwell.model.AuthenticationCheckResult;
import com.bootcamp.learnwell.model.AuthenticationStatus;
import com.bootcamp.learnwell.services.ISearchUserService;

@RestController
@RequestMapping("/student")
public class QuizAllocatorController {
	
	@Autowired
	ISearchUserService searchStudentService;
	
	@PostMapping(path="/{id}/quiz/",  produces = {MediaType.APPLICATION_JSON_VALUE})
	public AuthenticationCheckResult authenticationCheck(@PathVariable("id") String idStudent, @RequestHeader("role") String role) {
		if(role!="client") {
			return new AuthenticationCheckResult(AuthenticationStatus.AUTHENTICATION_FAILED, "It is forbidden to access these information");
		}
		return (searchStudentService.adminSearchById(idStudent)!=null)?
			new AuthenticationCheckResult(AuthenticationStatus.AUTHORIZED_USER, null):
			new AuthenticationCheckResult(AuthenticationStatus.AUTHENTICATION_FAILED, "Not Found User in our DataBase");
	}
	
}
