package com.future.works.reflect.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.dao.QuizQueryDaoImpl;
import com.future.works.reflect.dao.QuizUpdateDaoImpl;
import com.future.works.reflect.pojo.QuizElements;

import reactor.core.publisher.Flux;

@Component
public class QuizServiceImpl implements QuizQueryService{

	private static final Logger logger = LoggerFactory.getLogger(QuizServiceImpl.class);
	
	@Autowired
	private QuizQueryDaoImpl quizDaoImpl;
	
	@Autowired
	private QuizUpdateDaoImpl quizUpdateDaoImpl;
	
	@Override
	public Flux<QuizElements> fetchQuizDetails(String quizType) {
		logger.info("fetchCuriosityDetails for {}",quizType);
		return quizDaoImpl.fetchQuizDetails(quizType);
	}

	@Override
	public String updateQuizDetails(List<QuizElements> quizElements) {
		quizUpdateDaoImpl.updateQuizEntries(quizElements);
		return "SUCCESS";
	}
	
	
}
