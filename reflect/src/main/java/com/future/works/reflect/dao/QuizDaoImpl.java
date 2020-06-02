package com.future.works.reflect.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.UserQuizDetails;
import com.future.works.reflect.repo.QuizDetailsRepository;
import com.future.works.reflect.repo.UserQuizDetailsRepository;

@Component
public class QuizDaoImpl implements QuizDao{

	@Autowired
	private QuizDetailsRepository quizDetailsRepository;
	
	@Autowired
	private UserQuizDetailsRepository userQuizDetailsRepository;
	
	@Override
	public List<QuizElements> fetchQuizDetails(String quizType) {
		return quizDetailsRepository.findAll();
	}
	
	@Override
	public void updateQuizEntries(List<UserQuizDetails> userQuizDetails) {
		userQuizDetailsRepository.saveAll(userQuizDetails);
	}
	
	@Override
	public void fetchResultMessage(Integer score) {
//		userQuizDetailsRepository.saveAll(userQuizDetails);
	}
}
