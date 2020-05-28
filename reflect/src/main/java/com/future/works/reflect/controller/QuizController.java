package com.future.works.reflect.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.UserDetails;
import com.future.works.reflect.repo.UserDetailsRepository;
import com.future.works.reflect.service.QuizServiceImpl;

@RestController
public class QuizController {

	@Autowired
	private QuizServiceImpl quizServiceImpl;
	@Autowired
	private UserDetailsRepository userDetailsRepo;

	@CrossOrigin(maxAge = 3600)
	@GetMapping("/quiz/curiosity")
	List<QuizElements> fetchCuriosityDetails() {
		return quizServiceImpl.fetchCuriosityDetails("Curiosity");
	}

	@CrossOrigin(maxAge = 3600)
	@RequestMapping(method = RequestMethod.GET, value = "/userDetails")
	List<UserDetails> getUserDetails() {
		return userDetailsRepo.findAll();
	}

	@ExceptionHandler
	void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value());

	}

	/*
	 * @PostMapping("/quiz/curiosity") List<QuizElementsVO> newEmployee(@RequestBody
	 * QuizElementsVO newEmployee) { return repository.save(newEmployee); }
	 */
}
