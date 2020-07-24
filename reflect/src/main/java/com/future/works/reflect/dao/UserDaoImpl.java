package com.future.works.reflect.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.future.works.reflect.pojo.UserDetails;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired} )
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private DynamoDBMapper dynamoDBMapper;
	
	public UserDaoImpl(DynamoDBMapper dynamoDBMapper) {
		this.dynamoDBMapper=dynamoDBMapper;
	}

	@Override
	public UserDetails getUserDetails() {
		return dynamoDBMapper.load(UserDetails.class, "1");
	}
	
}
