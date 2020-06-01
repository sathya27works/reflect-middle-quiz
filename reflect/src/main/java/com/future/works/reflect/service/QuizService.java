package com.future.works.reflect.service;

import java.util.List;

import com.future.works.reflect.pojo.QuizElements;

public interface QuizService {

	List<QuizElements> fetchCuriosityDetails(String quizType);

	String validateCuriosityDetails(List<QuizElements> quizElements); 
}
