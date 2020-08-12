package com.future.works.reflect;


import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.future.works.reflect.controller.QuizQueryController;

@SpringBootTest
class CognizantReflectApplicationTests {

	@Autowired
	private QuizQueryController controller;
	
	@Test
	void contextLoads() {
		assertNotNull(controller);
	}

}
