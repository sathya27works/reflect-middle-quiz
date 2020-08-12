package com.future.works.reflect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.dao.BlindQuizDaoImpl;
import com.future.works.reflect.pojo.BlindQuizSave;

@Component
public class BlindQuizServiceImpl implements BlindQuizService{

	@Autowired
	private BlindQuizDaoImpl quizDaoImpl;

	@Override
	public String saveBlindSpotQuiz(String uniqueId, String selectedList, String userId) {
		BlindQuizSave save = new BlindQuizSave();
		save.setSelectedList(selectedList);
		save.setUniqueId(uniqueId);
		save.setUserId(userId);
		quizDaoImpl.saveBlindQuiz(save);
		return "SUCCESS";
	}
	
}
