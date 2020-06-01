package com.future.works.reflect.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.future.works.reflect.pojo.UserQuizDetails;
public interface UserQuizDetailsRepository extends MongoRepository<UserQuizDetails, String> {

}
