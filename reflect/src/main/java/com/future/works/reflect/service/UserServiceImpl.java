package com.future.works.reflect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.dao.UserDaoImpl;
import com.future.works.reflect.pojo.UserDetails;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDaoImpl userDaoImpl;

	@Override
	public UserDetails getUserDetails() {
		return userDaoImpl.getUserDetails();
	}
	
}
