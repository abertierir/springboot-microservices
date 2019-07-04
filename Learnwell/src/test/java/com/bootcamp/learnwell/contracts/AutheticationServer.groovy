package com.bootcamp.learnwell.contracts

org.springframework.cloud.contract.spec.Contract.make {
	request {
		method 'GET'
		url '/student/{id}'
		headers { 
			contentType('application/json')
			role('cliente')
		}
	}
	response { 
		status OK() 
		body([ 
			   authenticationStatus  : "AUTHENTICATION_FAILED",
			   "rejection.reason": "Not Found User in our DataBase"
		])
		headers { 
			contentType('application/json')
		}
	}
}