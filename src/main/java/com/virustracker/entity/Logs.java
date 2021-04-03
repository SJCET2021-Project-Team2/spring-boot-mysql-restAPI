package com.virustracker.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logs {
	
	@Id
	private Integer userId;
	private Integer premisesId;
	private LocalDate userEntryDate;
	private LocalTime userEntryTime;
//	private Integer premisesName;
//	private Integer premisesMobile;
//	private String premisesLocation;
//	private String userName;
//	private Integer userMobile;
//	private String userLocation;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getPremisesId() {
		return premisesId;
	}
	public void setPremisesId(Integer premisesId) {
		this.premisesId = premisesId;
	}
	public LocalDate getUserEntryDate() {
		return userEntryDate;
	}
	public void setUserEntryDate(LocalDate userEntryDate) {
		this.userEntryDate = userEntryDate;
	}
	public LocalTime getUserEntryTime() {
		return userEntryTime;
	}
	public void setUserEntryTime(LocalTime localTime) {
		this.userEntryTime = localTime;
	}
	
}
