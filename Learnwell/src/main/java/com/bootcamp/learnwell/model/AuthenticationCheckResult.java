package com.bootcamp.learnwell.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationCheckResult {
	
	AuthenticationStatus authenticationStatus;
	
	@JsonProperty("rejection.reason")
	private String rejectionReason;
}
