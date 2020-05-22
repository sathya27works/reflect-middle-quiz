package com.future.works.reflect.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.future.works.reflect.pojo.UserDetails;
public interface UserDetailsRepository extends MongoRepository<UserDetails, String> {

}
