package com.future.works.reflect.dao;

import java.util.List;

import com.future.works.reflect.pojo.QuizElements;

public interface QuizUpdateDao {

	void updateQuizEntries(List<QuizElements> quizElements);

}
