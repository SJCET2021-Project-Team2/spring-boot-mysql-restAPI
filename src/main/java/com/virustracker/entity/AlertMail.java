package com.virustracker.entity;

import org.springframework.stereotype.Component;

@Component
public class AlertMail {

	private String userMailId;
	private String alertMsg = "noice";
	
	public String getUserMailId() {
		return userMailId;
	}
	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}
	public String getAlertMsg() {
		return alertMsg;
	}
	public void setAlertMsg(String alertMsg) {
		this.alertMsg = alertMsg;
	}
 
	
	
}
