package com.future.works.reflect.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

//@Getter @Setter
@Document(collection = "user_quiz_details")
public class UserQuizDetails {

	@Id
	private String userQuizId;
	private int questionNo;
	private String question;
	private boolean selectedAnswer;
	private int userScore;
	private String userName;
	public String getUserQuizId() {
		return userQuizId;
	}
	public void setUserQuizId(String userQuizId) {
		this.userQuizId = userQuizId;
	}
	public int getQuestionNo() {
		return questionNo;
	}
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public boolean isSelectedAnswer() {
		return selectedAnswer;
	}
	public void setSelectedAnswer(boolean selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}
	public int getUserScore() {
		return userScore;
	}
	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
