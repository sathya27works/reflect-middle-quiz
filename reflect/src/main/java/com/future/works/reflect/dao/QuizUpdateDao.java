package com.future.works.reflect.dao;

import java.util.List;

import com.future.works.reflect.pojo.UserQuizDetails;

public interface QuizUpdateDao {

	void updateQuizEntries(List<UserQuizDetails> userQuizDetails);

}
