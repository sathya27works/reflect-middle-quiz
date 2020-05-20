package com.future.works.reflect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.dao.QuizDaoImpl;
import com.future.works.reflect.pojo.QuizElements;

@Component
public class QuizServiceImpl {
	
	@Autowired
	private QuizDaoImpl quizDaoImpl;

	public List<QuizElements> fetchCuriosityDetails(String quizType) {
		return quizDaoImpl.fetchQuizDetails(quizType);
	}
}
