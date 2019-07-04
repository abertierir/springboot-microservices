package com.bootcamp.learnwell.quiz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.bootcamp.learnwell.quiz.repository.IQuizRepository;

@EnableMongoRepositories(basePackageClasses = IQuizRepository.class)
@Configuration
public class MongoDBConfig {
	
}
