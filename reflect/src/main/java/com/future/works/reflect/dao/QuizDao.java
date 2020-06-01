package com.future.works.reflect.dao;

import java.util.List;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.UserQuizDetails;

public interface QuizDao {

	List<QuizElements> fetchQuizDetails(String quizType); 
	
	void validateQuiz(List<UserQuizDetails> userQuizDetails);
}
