package com.future.works.reflect.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExceptionControllerTest {

	@InjectMocks
	private ExceptionController exceptionController;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test	
	public void exceptionTest() {
		Exception exp = new Exception();
		exceptionController.handleIllegalArgumentException(exp,null);
	}	 
	
}
