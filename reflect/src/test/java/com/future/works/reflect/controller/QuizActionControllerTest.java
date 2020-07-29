package com.future.works.reflect.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.service.QuizServiceImpl;

@SpringBootTest
public class QuizActionControllerTest {

	@Mock
	private QuizServiceImpl quizServiceImpl;
	
	@InjectMocks
	private QuizActionController quizActionController;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test	
	public void submitBlindSpotTest() {
		List<QuizElements> quizElements = new ArrayList<>();
		String expQuizResult = "success";
		Mockito.when(quizServiceImpl.validateCuriosityDetails(quizElements)).thenReturn(expQuizResult);
		
		String quizResult = quizActionController.validateQuiz(quizElements);
		assertEquals(expQuizResult, quizResult);
	}	 
	
}
