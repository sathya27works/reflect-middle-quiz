package com.future.works.reflect.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Document(collection = "reflect_quiz_details")
public class QuizElements {

	@Id
	private String quizId;
	private int questionNo;
	private String question;
	private boolean answer;
	private int score;
	private String created_by;
	private String created_date;
	private String updated_by;
	private String updated_date;
	
	
}
