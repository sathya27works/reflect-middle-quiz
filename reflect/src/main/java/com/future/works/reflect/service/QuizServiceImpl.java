package com.future.works.reflect.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.dao.QuizDaoImpl;
import com.future.works.reflect.pojo.BlindQuizSave;
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
		Integer sumScore = 0;
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
			
		}
		quizDaoImpl.updateQuizEntries(userQuizDetails);
		quizDaoImpl.fetchResultMessage(sumScore);
		return "\" spring used \"";
	}

	@Override
	public String saveBlindSpotQuiz(String uniqueId, String selectedList, String userId) {
		BlindQuizSave save = new BlindQuizSave();
		save.setSelectedList(selectedList);
		save.setUniqueId(uniqueId);
		save.setUserId(userId);
		quizDaoImpl.saveBlindQuiz(save);
		return "SUCCESS";
	}
	
	@Override
	public List<QuizElements> getgrowthMindsetQueryDetails(String quizType) {
		return quizDaoImpl.getgrowthMindsetQueryDetails(quizType);
	}
	
	@Override
	public String validateGrowthMindsetAnswer(List<QuizElements> quizElements) {
	  /** logic to arrive score for each entries and save to user quiz details table */
		List<UserQuizDetails> userQuizDetails = new ArrayList<>();
		Integer sumScore = 0;
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
			
		}
		quizDaoImpl.updateQuizEntries(userQuizDetails);
		quizDaoImpl.fetchResultMessage(sumScore);
		return "\" spring used \"";
	}
	
}
