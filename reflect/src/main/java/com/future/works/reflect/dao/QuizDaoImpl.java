package com.future.works.reflect.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.QuizElements;

@Component
public class QuizDaoImpl implements QuizDao{

	@Override
	public List<QuizElements> fetchQuizDetails(String quizType) {
		//to do based on quiztype results should be returned
		List<QuizElements> quizElements = new ArrayList<>();
		QuizElements quiz1 = new QuizElements();
		quiz1.setQuizId("curiosity1");
		quiz1.setQuizQuestion("A Need for Cognition is a scientific measure of intellectual curiosity. Take the quiz by answering true or false and PLACING JUST THE LETTER Y in the column you agree with");
		quiz1.setConfigAnswer(true);
		quiz1.setConfigScore(1);
		quizElements.add(quiz1);
		
		QuizElements quiz2 = new QuizElements();
		quiz2.setQuizId("curiosity2");
		quiz2.setQuizQuestion("I would prefer complex to simple problems.");
		quiz2.setConfigAnswer(true);
		quiz2.setConfigScore(2);
		quizElements.add(quiz2);
		
		QuizElements quiz3 = new QuizElements();
		quiz3.setQuizId("curiosity3");
		quiz3.setQuizQuestion("I like to have the responsibility of handling a situation that requires a lot of thinking.");
		quiz3.setConfigAnswer(false);
		quiz3.setConfigScore(1);
		quizElements.add(quiz3);
		
		QuizElements quiz4 = new QuizElements();
		quiz4.setQuizId("curiosity4");
		quiz4.setQuizQuestion("I usually end up deliberating about issues even when they do not affect me personally.");
		quiz4.setConfigAnswer(true);
		quiz4.setConfigScore(2);
		quizElements.add(quiz4);
		
		QuizElements quiz5 = new QuizElements();
		quiz5.setQuizId("curiosity5");
		quiz5.setQuizQuestion("I find satisfaction in deliberating hard and for long hours.");
		quiz5.setConfigAnswer(false);
		quiz5.setConfigScore(1);
		quizElements.add(quiz5);
		
		
		
		return quizElements;
	}
}
