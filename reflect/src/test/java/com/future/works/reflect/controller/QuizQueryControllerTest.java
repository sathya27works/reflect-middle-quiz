package com.future.works.reflect.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.future.works.reflect.service.QuizServiceImpl;

@SpringBootTest
public class QuizQueryControllerTest {

	@Mock
	private QuizServiceImpl quizServiceImpl;
	
	@InjectMocks
	private QuizQueryController quizQueryController;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test	
	public void fetchQuizDetailsTest() throws Exception {
		String quizType = "curiosity";
		quizQueryController.fetchCuriosityDetails(quizType);
	}	 
	
	@Test(expected=Exception.class)
	public void invalidQuizTypeTest() throws Exception {
		String quizType = "curiosity*%";
		quizQueryController.fetchCuriosityDetails(quizType);
	}	
	
}
