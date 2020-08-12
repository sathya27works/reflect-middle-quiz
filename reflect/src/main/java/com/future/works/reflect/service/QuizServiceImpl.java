package com.future.works.reflect.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.dao.QuizQueryDaoImpl;
import com.future.works.reflect.dao.QuizUpdateDaoImpl;
import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.pojo.QuizResultDetails;
import com.future.works.reflect.pojo.UserQuizDetails;

import reactor.core.publisher.Flux;

@Component
public class QuizServiceImpl implements QuizQueryService{

	private static final Logger logger = LoggerFactory.getLogger(QuizServiceImpl.class);
	
	@Autowired
	private QuizQueryDaoImpl quizDaoImpl;

	@Autowired
	private QuizUpdateDaoImpl quizUpdateDaoImpl;
	
	@Override
	public Flux<QuizElements> fetchCuriosityDetails(String quizType) {
		logger.info("fetchCuriosityDetails for {}",quizType);
		return quizDaoImpl.fetchQuizDetails(quizType);
	}

	@Override
	public String validateCuriosityDetails(List<QuizElements> quizElements) {
	  /** logic to arrive score for each entries and save to user quiz details table */
		List<UserQuizDetails> userQuizDetails = new ArrayList<>();
		Integer sumScore = 0;
		String quizType = "";
		for(QuizElements quizElement: quizElements) {
			UserQuizDetails userQuizDetail = new UserQuizDetails();
			userQuizDetail.setQuestion(quizElement.getQuestion());
			userQuizDetail.setSelectedAnswer(quizElement.isAnswer());
			Integer userScore = 0;
			if(quizElement.isAnswer()==quizElement.isUserAnswer()) {
				userScore = quizElement.getScore();
				sumScore += userScore;
			}
			userQuizDetail.setUserScore(userScore);
			userQuizDetails.add(userQuizDetail);
			quizType = quizElement.getQuizType();
		}
		logger.info("validateCuriosityDetails for {}",quizType);
		final Integer sumScoreFinal = sumScore;
		quizUpdateDaoImpl.updateQuizEntries(userQuizDetails);
		
		return invokeElementMapper(quizType,sumScoreFinal);
	}
	
	
	private String invokeElementMapper(String quizType, Integer sumScoreFinal) {
		List<QuizResultDetails> fluxQuizResultDetails = quizDaoImpl.fetchResultMessage(quizType);
		StringBuilder resultDisplayMessage = new StringBuilder();
		resultDisplayMessage.append("\"");
		fluxQuizResultDetails.stream().filter(resultMessage ->resultMessage.getScore().contains(sumScoreFinal)).forEach(resultMessage-> 
            		 resultDisplayMessage.append(resultMessage.getResultMessage())
		);
		
		resultDisplayMessage.append("\"");
		return resultDisplayMessage.toString();
	}
	
	
}
