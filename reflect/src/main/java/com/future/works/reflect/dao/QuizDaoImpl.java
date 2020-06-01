package com.future.works.reflect.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.UserQuizDetails;
import com.future.works.reflect.repo.QuizDetailsRepository;
import com.future.works.reflect.repo.UserQuizDetailsRepository;

@Component
public class QuizDaoImpl implements QuizDao{

	@Autowired
	private QuizDetailsRepository quizDetailsRepository;
	
	@Autowired
	private UserQuizDetailsRepository userQuizDetailsRepository;
	
	@Override
	public List<QuizElements> fetchQuizDetails(String quizType) {
		return quizDetailsRepository.findAll();
	}
	
	@Override
	public void validateQuiz(List<UserQuizDetails> userQuizDetails) {
		userQuizDetailsRepository.saveAll(userQuizDetails);
	}
	
//	@Override
	/*
	 * public List<QuizElements> fetchQuizDetailsStatic(String quizType) { //to do
	 * based on quiztype results should be returned List<QuizElements> quizElements
	 * = new ArrayList<>(); QuizElements quiz1 = new QuizElements();
	 * quiz1.setQuizId("curiosity1"); quiz1.
	 * setQuestion("A Need for Cognition is a scientific measure of intellectual curiosity. Take the quiz by answering true or false and PLACING JUST THE LETTER Y in the column you agree with"
	 * ); quizElements.add(quiz1);
	 * 
	 * QuizElements quiz2 = new QuizElements(); quiz2.setQuizId("curiosity2");
	 * quiz2.setQuestion("I would prefer complex to simple problems.");
	 * quiz2.setConfigAnswer(true); quizElements.add(quiz2);
	 * 
	 * QuizElements quiz3 = new QuizElements(); quiz3.setQuizId("curiosity3");
	 * quiz3.
	 * setQuestion("I like to have the responsibility of handling a situation that requires a lot of thinking."
	 * ); quiz3.setConfigAnswer(false); quizElements.add(quiz3);
	 * 
	 * QuizElements quiz4 = new QuizElements(); quiz4.setQuizId("curiosity4");
	 * quiz4.
	 * setQuestion("I usually end up deliberating about issues even when they do not affect me personally."
	 * ); quiz4.setConfigAnswer(true); quizElements.add(quiz4);
	 * 
	 * QuizElements quiz5 = new QuizElements(); quiz5.setQuizId("curiosity5");
	 * quiz5.
	 * setQuestion("I find satisfaction in deliberating hard and for long hours.");
	 * quiz5.setConfigAnswer(false); quizElements.add(quiz5);
	 * 
	 * 
	 * 
	 * return quizElements; }
	 */
	
}
