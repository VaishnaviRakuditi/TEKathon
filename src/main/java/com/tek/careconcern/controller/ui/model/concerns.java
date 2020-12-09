package com.tek.careconcern.controller.ui.model;

public class concerns {

	int userId;
	String concernText;
	String mailId;
	String type;
	String status;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getConcernText() {
		return concernText;
	}

	public void setConcernText(String concernText) {
		this.concernText = concernText;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
