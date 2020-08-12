package com.future.works.reflect.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.future.works.reflect.dao.QuizQueryDaoImpl;
import com.future.works.reflect.dao.QuizUpdateDaoImpl;
import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.QuizResultDetails;

@SpringBootTest
public class QuizServiceTest {

	@Mock
	private QuizQueryDaoImpl quizDaoImpl;

	@Mock
	private QuizUpdateDaoImpl quizUpdateDaoImpl;
	
	@InjectMocks
	private QuizServiceImpl quizServiceImpl;
	
	List<QuizElements> quizElements = new ArrayList<>();
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
		
		QuizElements quizElement = new QuizElements();
		quizElement.setAnswer(true);
		quizElement.setUserAnswer(true);
		quizElement.setScore(1);
		quizElements.add(quizElement);
		QuizElements quizElement1 = new QuizElements();
		quizElement1.setAnswer(true);
		quizElement1.setUserAnswer(false);
		quizElement1.setScore(2);
		quizElement1.setQuizType("curiosity");
		quizElement1.setQuizId("quizId1");
		quizElement1.setQuestion("question");
		quizElement1.setQuestionNo(2);
		quizElements.add(quizElement1);
	}
	
	@Test	
	public void fetchCuriosityDetailsTest() {
		String quizType = "curiosity";
		quizServiceImpl.fetchCuriosityDetails(quizType);
	}	 
	
	@Test	
	public void validateCuriosityDetailsEmptyTest() {
		List<QuizElements> quizElements = new ArrayList<>();
		quizServiceImpl.validateCuriosityDetails(quizElements);
	}
	
	@Test	
	public void validateCuriosityDetailsTest() {
		String quizType = "curiosity";
		
		List<QuizResultDetails> fluxQuizResultDetails = new ArrayList<>();
		QuizResultDetails quizDetails = new QuizResultDetails();
		quizDetails.setQuizType("curiosity");
		List<Integer> score = new ArrayList<>();
		quizDetails.setScore(score);
		fluxQuizResultDetails.add(quizDetails);
		Mockito.when(quizDaoImpl.fetchResultMessage(quizType)).thenReturn(fluxQuizResultDetails);
		quizServiceImpl.validateCuriosityDetails(quizElements);
	}
	
	@Test	
	public void validateCuriosityDetailsScoreTest() {
		String quizType = "curiosity";
		
		List<QuizResultDetails> fluxQuizResultDetails = new ArrayList<>();
		QuizResultDetails quizDetails = new QuizResultDetails();
		quizDetails.setQuizType("curiosity");
		List<Integer> score = Arrays.asList(1,2,3);
		quizDetails.setScore(score);
		quizDetails.setQuizResultId("quizResultId");
		quizDetails.setResultMessage("resultMessage");
		fluxQuizResultDetails.add(quizDetails);
		Mockito.when(quizDaoImpl.fetchResultMessage(quizType)).thenReturn(fluxQuizResultDetails);
		quizServiceImpl.validateCuriosityDetails(quizElements);
	}
}
