package com.future.works.reflect.dao;

import java.util.List;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.QuizResultDetails;

import reactor.core.publisher.Flux;

public interface QuizQueryDao {

	Flux<QuizElements> fetchQuizDetails(String quizType); 
	
	List<QuizResultDetails> fetchResultMessage(String quizType);

}
