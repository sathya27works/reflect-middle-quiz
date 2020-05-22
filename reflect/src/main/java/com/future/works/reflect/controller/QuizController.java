package com.future.works.reflect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/quiz/curiosity")
	  List<QuizElements> fetchCuriosityDetails() {
	    return quizServiceImpl.fetchCuriosityDetails("Curiosity");
	  }
	
	@GetMapping("/userDetails")
	  List<UserDetails> getUserDetails() {
		UserDetails usrD = new UserDetails();
		usrD.setUserName("aa");
		usrD.setPassword("12");
		usrD.setRole("ADMIN");
		userDetailsRepo.insert(usrD);
	    return userDetailsRepo.findAll();
	  }
	
		/*
		 * @PostMapping("/quiz/curiosity") List<QuizElementsVO> newEmployee(@RequestBody
		 * QuizElementsVO newEmployee) { return repository.save(newEmployee); }
		 */
}
