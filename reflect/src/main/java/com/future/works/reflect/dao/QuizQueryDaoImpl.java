package com.future.works.reflect.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.QuizResultDetails;
import com.future.works.reflect.repo.QuizDetailsRepository;
import com.future.works.reflect.repo.QuizResultDetailsRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired} )
public class QuizQueryDaoImpl implements QuizQueryDao{

	private final QuizDetailsRepository quizDetailsRepository;
	private final QuizResultDetailsRepository quizResultDetailsRepository;
	
	@Override
	public Flux<QuizElements> fetchQuizDetails(String quizType) {
		ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAny()
				.withMatcher("quizType", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
		QuizElements quizElements = new QuizElements();
		quizElements.setQuizType(quizType);
		Example<QuizElements> example = Example.of(quizElements, customExampleMatcher);
		
		return quizDetailsRepository.findAll(example);
		
	}
	
	@Override
	public List<QuizResultDetails> fetchResultMessage(String quizType) {
		ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAny()
				.withMatcher("quizType", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
		QuizResultDetails quizResultDetails = new QuizResultDetails();
		quizResultDetails.setQuizType(quizType);
		Example<QuizResultDetails> example = Example.of(quizResultDetails, customExampleMatcher);
		
		return quizResultDetailsRepository.findAll(example);
	}
		
}
