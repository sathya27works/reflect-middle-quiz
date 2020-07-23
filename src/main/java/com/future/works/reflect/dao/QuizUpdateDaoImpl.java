package com.future.works.reflect.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.QuizElements;
import com.future.works.reflect.repo.QuizDetailsRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired} )
public class QuizUpdateDaoImpl implements QuizUpdateDao{

	private final QuizDetailsRepository quizDetailsRepository;
	
	@Override
	public void updateQuizEntries(List<QuizElements> quizElements) {
		for(QuizElements quizElement: quizElements) {
			quizDetailsRepository.save(quizElement);	
		}
	}
		
}
