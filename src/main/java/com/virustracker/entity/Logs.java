package com.virustracker.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Logs {
	
	@Id
	private Integer UserId;
	private Integer premisesID;
	@Temporal(TemporalType.TIMESTAMP)
	private Date userEntryTimestamp;
//	private Integer premisesName;
//	private Integer premisesMobile;
//	private String premisesLocation;
//	private String userName;
//	private Integer userMobile;
//	private String userLocation;
}
