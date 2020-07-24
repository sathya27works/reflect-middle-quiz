package com.future.works.reflect.service;

import java.util.List;

import com.future.works.reflect.pojo.QuizElements;

import reactor.core.publisher.Flux;

public interface QuizQueryService {

	Flux<QuizElements> fetchQuizDetails(String quizType);

	String updateQuizDetails(List<QuizElements> quizElements); 
	
}
