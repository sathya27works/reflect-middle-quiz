package com.future.works.reflect.dao;

import com.future.works.reflect.pojo.QuizElements;

import reactor.core.publisher.Flux;

public interface QuizQueryDao {

	Flux<QuizElements> fetchQuizDetails(String quizType); 
	

}
