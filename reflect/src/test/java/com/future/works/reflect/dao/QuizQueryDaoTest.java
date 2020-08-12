package com.future.works.reflect.dao;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.future.works.reflect.repo.QuizDetailsRepository;
import com.future.works.reflect.repo.QuizResultDetailsRepository;

@SpringBootTest
public class QuizQueryDaoTest {

	@Mock
	private QuizDetailsRepository quizDetailsRepository;
	@Mock
	private QuizResultDetailsRepository quizResultDetailsRepository;
	
	@InjectMocks
	private QuizQueryDaoImpl quizDaoImpl;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test	
	public void fetchQuizDetailsTest() {
		quizDaoImpl.fetchQuizDetails("curiosity");
	}	 
	
	@Test	
	public void fetchResultMessageTest() {
		quizDaoImpl.fetchResultMessage("curiosity");
	}	 
}
