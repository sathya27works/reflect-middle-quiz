package com.future.works.reflect.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Document(collection = "reflect_quiz_details")
public class QuizElements {

	@Id
	private String quizId;
	private String quizQuestion;
	private boolean configAnswer;
	private int configScore;
	
	/**
	 * @return the quizId
	 */
	public String getQuizId() {
		return quizId;
	}
	/**
	 * @param quizId the quizId to set
	 */
	public void setQuizId(String quizId) {
		this.quizId = quizId;
	}
	/**
	 * @return the quizQuestion
	 */
	public String getQuizQuestion() {
		return quizQuestion;
	}
	/**
	 * @param quizQuestion the quizQuestion to set
	 */
	public void setQuizQuestion(String quizQuestion) {
		this.quizQuestion = quizQuestion;
	}
	/**
	 * @return the configAnswer
	 */
	public boolean isConfigAnswer() {
		return configAnswer;
	}
	/**
	 * @param configAnswer the configAnswer to set
	 */
	public void setConfigAnswer(boolean configAnswer) {
		this.configAnswer = configAnswer;
	}
	/**
	 * @return the configScore
	 */
	public int getConfigScore() {
		return configScore;
	}
	/**
	 * @param configScore the configScore to set
	 */
	public void setConfigScore(int configScore) {
		this.configScore = configScore;
	}
	
}
