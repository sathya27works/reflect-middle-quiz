package com.future.works.reflect.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.future.works.reflect.dao.BlindQuizDaoImpl;

@SpringBootTest
public class BlindQuizServiceTest {

	@Mock
	private BlindQuizDaoImpl quizDaoImpl;
	
	@InjectMocks
	private BlindQuizServiceImpl quizServiceImpl;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test	
	public void submitBlindSpotTest() {
		String uniqueId = "uniqueId";
		String selectedList = "selectedList";
		String userId = "userId";
		String expBlindSpotResult = "SUCCESS";
		
		String blindSpotResult = quizServiceImpl.saveBlindSpotQuiz(uniqueId, selectedList, userId);
		assertEquals(expBlindSpotResult, blindSpotResult);
	}	 
	
}
