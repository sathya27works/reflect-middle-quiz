package com.future.works.reflect.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.future.works.reflect.pojo.QuizElements;
public interface QuizDetailsRepository extends MongoRepository<QuizElements, String> {

}
