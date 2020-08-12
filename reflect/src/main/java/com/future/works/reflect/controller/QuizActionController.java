package com.future.works.reflect.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.service.QuizServiceImpl;

@RestController
@CrossOrigin(maxAge = 3600)
public class QuizActionController {

	private static final Logger logger = LoggerFactory.getLogger(QuizActionController.class);
	@Autowired
	private QuizServiceImpl quizServiceImpl;
	
	@PostMapping("/submitQuiz")
	@ResponseBody
	public String validateQuiz(@RequestBody List<QuizElements> quizElements) {
		logger.info("validateQuiz for quizElements {}",quizElements.toString());
		return quizServiceImpl.validateCuriosityDetails(quizElements);
	}
	
}
