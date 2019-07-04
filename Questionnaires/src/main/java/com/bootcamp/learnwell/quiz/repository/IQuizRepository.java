package com.bootcamp.learnwell.quiz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.learnwell.quiz.data.Quiz;

@Repository
public interface IQuizRepository extends MongoRepository<Quiz,String>{

}
