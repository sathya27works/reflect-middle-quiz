package com.future.works.reflect.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.repo.QuizDetailsRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired} )
public class QuizQueryDaoImpl implements QuizQueryDao{

	private final QuizDetailsRepository quizDetailsRepository;
	
	@Override
	public Flux<QuizElements> fetchQuizDetails(String quizType) {
		ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAny()
				.withMatcher("quizType", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
		QuizElements quizElements = new QuizElements();
		quizElements.setQuizType(quizType);
		Example<QuizElements> example = Example.of(quizElements, customExampleMatcher);
		
		return quizDetailsRepository.findAll(example);
		
	}
	
		
}
