package com.future.works.reflect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.dao.QuizDaoImpl;
import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.UserQuizDetails;

@Component
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizDaoImpl quizDaoImpl;

	@Override
	public List<QuizElements> fetchCuriosityDetails(String quizType) {
		return quizDaoImpl.fetchQuizDetails(quizType);
	}

	@Override
	public String validateCuriosityDetails(List<QuizElements> quizElements) {
	  /** logic to arrive score for each entries and save to user quiz details table */
		List<UserQuizDetails> userQuizDetails = new ArrayList<>();
		for(QuizElements quizElement: quizElements) {
			UserQuizDetails userQuizDetail = new UserQuizDetails();
			userQuizDetail.setQuestion(quizElement.getQuestion());
			userQuizDetail.setSelectedAnswer(quizElement.isAnswer());
			Integer userScore = 0;
			if(quizElement.isAnswer()==quizElement.isUserAnswer()) {
				userScore = quizElement.getScore();
			}
			userQuizDetail.setUserScore(userScore);
			userQuizDetails.add(userQuizDetail);
			
		}
		quizDaoImpl.validateQuiz(userQuizDetails);
		return "Success";
	}
}
