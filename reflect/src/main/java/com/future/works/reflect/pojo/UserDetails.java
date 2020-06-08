package com.future.works.reflect.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Document(collection = "reflect_user_details")
public class UserDetails {
	
	@Id
	private String id;
	private String userName;
	private String password;
	private String role;
	
}
