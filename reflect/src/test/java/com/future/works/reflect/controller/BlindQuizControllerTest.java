package com.future.works.reflect.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.future.works.reflect.service.BlindQuizServiceImpl;

@SpringBootTest
public class BlindQuizControllerTest {

	@Mock
	private BlindQuizServiceImpl quizServiceImpl;
	
	@InjectMocks
	private BlindQuizController blindQuizController;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test	
	public void submitBlindSpotTest() {
		String uniqueId = "uniqueId";
		String selectedList = "selectedList";
		String userId = "userId";
		String expBlindSpotResult = "success";
		Mockito.when(quizServiceImpl.saveBlindSpotQuiz(uniqueId, selectedList, userId)).thenReturn(expBlindSpotResult);
		
		String blindSpotResult = blindQuizController.submitBlindSpot(uniqueId, selectedList, userId);
		assertEquals(expBlindSpotResult, blindSpotResult);
	}	 
	
}
