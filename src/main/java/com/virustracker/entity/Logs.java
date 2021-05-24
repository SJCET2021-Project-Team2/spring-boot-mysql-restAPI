package com.virustracker.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Logs{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String userId;
	private Integer premisesId;
	private LocalDate userEntryDate;
	private LocalTime userEntryTime;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
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

