package com.future.works.reflect.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.future.works.reflect.pojo.BlindQuizSave;
import com.future.works.reflect.repo.BlindQuizSaveRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor(onConstructor_ = {@Autowired} )
public class BlindQuizDaoImpl implements BlindQuizDao{

	private final BlindQuizSaveRepository blindQuizSaveRepository;
	
	@Override
	public void saveBlindQuiz(BlindQuizSave blindQuizSave) {
		blindQuizSaveRepository.save(blindQuizSave);
		
	}
	
}
