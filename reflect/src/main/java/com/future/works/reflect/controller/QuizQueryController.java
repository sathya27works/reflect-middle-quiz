package com.future.works.reflect.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.service.QuizServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import reactor.core.publisher.Flux;

@RestController
@CrossOrigin(maxAge = 3600)
public class QuizQueryController {

	private static final Logger logger = LoggerFactory.getLogger(QuizQueryController.class);
	@Autowired
	private QuizServiceImpl quizServiceImpl;
	
	@GetMapping("/quiz/{quizType}")
	@ResponseBody
	@HystrixCommand(fallbackMethod = "fetchCuriosityDetailsFallback")
	public Flux<QuizElements> fetchCuriosityDetails(@PathVariable String quizType) {
		logger.info("fetchCuriosityDetails quizType {}",quizType);
		return quizServiceImpl.fetchCuriosityDetails(quizType);
	}

	@SuppressWarnings("unused")
	private Flux<QuizElements> fetchCuriosityDetailsFallback(@PathVariable String quizType) {
		logger.debug("fallback method invoked due to circuit breaker OPEN");
		return null;
	}

}
