package com.future.works.reflect.dao;

import java.util.List;

import com.future.works.reflect.pojo.QuizElements;

public interface QuizDao {

	List<QuizElements> fetchQuizDetails(String quizType); 
}
