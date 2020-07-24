package com.future.works.reflect.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.UserQuizDetails;
import com.future.works.reflect.repo.UserQuizDetailsRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired} )
public class QuizUpdateDaoImpl implements QuizUpdateDao{

	private final UserQuizDetailsRepository userQuizDetailsRepository;
	
	@Override
	public void updateQuizEntries(List<UserQuizDetails> userQuizDetails) {
		for(UserQuizDetails userQuizDetail: userQuizDetails) {
			userQuizDetailsRepository.save(userQuizDetail);	
		}
	}
		
}
