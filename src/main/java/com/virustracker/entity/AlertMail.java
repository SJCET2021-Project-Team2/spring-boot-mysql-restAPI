package com.virustracker.entity;

import org.springframework.stereotype.Component;

@Component
public class AlertMail {

	private String UserMailId;

	public String getUserMailId() {
		return UserMailId;
	}

	public void setUserMailId(String userMailId) {
		UserMailId = userMailId;
	}
	
}
