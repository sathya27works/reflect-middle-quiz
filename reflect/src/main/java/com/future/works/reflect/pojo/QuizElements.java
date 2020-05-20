package com.future.works.reflect.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class QuizElements {

	private String quizId;
	private String quizQuestion;
	private boolean configAnswer;
	private int configScore;
	private boolean userOption1Enabled;
	private boolean userOption2Enabled;
	
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
	/**
	 * @return the userOption1Enabled
	 */
	public boolean isUserOption1Enabled() {
		return userOption1Enabled;
	}
	/**
	 * @param userOption1Enabled the userOption1Enabled to set
	 */
	public void setUserOption1Enabled(boolean userOption1Enabled) {
		this.userOption1Enabled = userOption1Enabled;
	}
	/**
	 * @return the userOption2Enabled
	 */
	public boolean isUserOption2Enabled() {
		return userOption2Enabled;
	}
	/**
	 * @param userOption2Enabled the userOption2Enabled to set
	 */
	public void setUserOption2Enabled(boolean userOption2Enabled) {
		this.userOption2Enabled = userOption2Enabled;
	}
	
	
}
