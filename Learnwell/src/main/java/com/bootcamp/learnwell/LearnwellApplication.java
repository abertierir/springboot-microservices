package com.bootcamp.learnwell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication
@EnableAutoConfiguration
@EnableSpringConfigured
@ComponentScan
public class LearnwellApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnwellApplication.class, args);
	}

}
