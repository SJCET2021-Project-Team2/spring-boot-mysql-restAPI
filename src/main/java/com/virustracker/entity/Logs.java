package com.virustracker.entity;

//import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

@Entity
public class Logs {
	
	@Id
	private Integer UserId;
	private Integer premisesId;
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date userEntryTimestamp;
//	private Integer premisesName;
//	private Integer premisesMobile;
//	private String premisesLocation;
//	private String userName;
//	private Integer userMobile;
//	private String userLocation;
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public Integer getPremisesId() {
		return premisesId;
	}
	public void setPremisesId(Integer premisesId) {
		this.premisesId = premisesId;
	}
//	public Date getUserEntryTimestamp() {
//		return userEntryTimestamp;
//	}
//	public void setUserEntryTimestamp(Date userEntryTimestamp) {
//		this.userEntryTimestamp = userEntryTimestamp;
//	}
}
