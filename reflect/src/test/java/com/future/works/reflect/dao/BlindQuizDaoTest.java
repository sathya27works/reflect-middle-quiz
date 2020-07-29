package com.future.works.reflect.dao;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.future.works.reflect.pojo.BlindQuizSave;
import com.future.works.reflect.repo.BlindQuizSaveRepository;

@SpringBootTest
public class BlindQuizDaoTest {

	@Mock
	private BlindQuizSaveRepository blindQuizSaveRepository;
	
	@InjectMocks
	private BlindQuizDaoImpl quizDaoImpl;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test	
	public void submitBlindSpotTest() {
		BlindQuizSave blindQuizSave = new BlindQuizSave();
		quizDaoImpl.saveBlindQuiz(blindQuizSave);
	}	 
	
}
