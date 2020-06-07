package com.future.works.reflect.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

//@Getter @Setter
@Document(collection = "blind_spot_quiz_save")
public class BlindQuizSave {

	
	private String userId;
	private String selectedList;
	private String uniqueId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSelectedList() {
		return selectedList;
	}
	public void setSelectedList(String selectedList) {
		this.selectedList = selectedList;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	
}
