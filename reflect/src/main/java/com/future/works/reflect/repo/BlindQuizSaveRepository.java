package com.future.works.reflect.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.future.works.reflect.pojo.BlindQuizSave;
public interface BlindQuizSaveRepository extends MongoRepository<BlindQuizSave, String> {

}
