package com.bootcamp.learnwell.quiz.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AuthenticationServiceResponse  {
	
	AuthenticationStatus authenticationStatus;
	
	@JsonProperty("rejection.reason")
	private String rejectionReason;
}
