package com.future.works.reflect.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.BlindQuizSave;
import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.UserQuizDetails;
import com.future.works.reflect.repo.BlindQuizSaveRepository;
import com.future.works.reflect.repo.QuizDetailsRepository;
import com.future.works.reflect.repo.UserQuizDetailsRepository;

@Component
public class QuizDaoImpl implements QuizDao{

	@Autowired
	private QuizDetailsRepository quizDetailsRepository;
	
	@Autowired
	private UserQuizDetailsRepository userQuizDetailsRepository;
	@Autowired
	private BlindQuizSaveRepository blindQuizSaveRepository;
	
	@Override
	public List<QuizElements> fetchQuizDetails(String quizType) {
		ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAny()
				.withMatcher("quizType", ExampleMatcher.GenericPropertyMatchers.contains().ignoreCase());
		QuizElements quizElements = new QuizElements();
		quizElements.setQuizType(quizType);
		Example<QuizElements> example = Example.of(quizElements, customExampleMatcher);
		
		return quizDetailsRepository.findAll(example);
		
	}
	
	@Override
	public void updateQuizEntries(List<UserQuizDetails> userQuizDetails) {
		userQuizDetailsRepository.saveAll(userQuizDetails);
	}
	
	@Override
	public void fetchResultMessage(Integer score) {
//		userQuizDetailsRepository.saveAll(userQuizDetails);
	}

	@Override
	public void saveBlindQuiz(BlindQuizSave blindQuizSave) {
		blindQuizSaveRepository.save(blindQuizSave);
		
	}
	
}
