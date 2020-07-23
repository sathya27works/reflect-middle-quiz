package com.future.works.reflect.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.future.works.reflect.service.BlindQuizServiceImpl;

@RestController
@CrossOrigin(maxAge = 3600)
public class BlindQuizController {

	private static final Logger logger = LoggerFactory.getLogger(BlindQuizController.class);
	@Autowired
	private BlindQuizServiceImpl quizServiceImpl;
	
	
	@GetMapping("/submitBlindSpot/{uniqueId}/{selectedList}/{userId}")
	public String submitBlindSpot(@PathVariable("uniqueId") String uniqueId, @PathVariable("selectedList") String selectedList, @PathVariable("userId") String userId) {
		logger.info("submitBlindSpot details received uniqueId{}, selectedList{}, userId{}",uniqueId, selectedList, userId);
		return quizServiceImpl.saveBlindSpotQuiz(uniqueId, selectedList, userId);
	}	 
	
}
