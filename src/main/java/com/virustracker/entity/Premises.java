package com.virustracker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Premises {

	@Id
	private Integer premisesId;
	private String premisesName;
	private String premisesMobile;
	private String premisesMail;
	private String premisesLocation;
	public Integer getPremisesId() {
		return premisesId;
	}
	public void setPremisesId(Integer premisesId) {
		this.premisesId = premisesId;
	}
	public String getPremisesName() {
		return premisesName;
	}
	public void setPremisesName(String premisesName) {
		this.premisesName = premisesName;
	}
	public String getPremisesMobile() {
		return premisesMobile;
	}
	public void setPremisesMobile(String premisesMobile) {
		this.premisesMobile = premisesMobile;
	}
	public String getPremisesMail() {
		return premisesMail;
	}
	public void setPremisesMail(String premisesMail) {
		this.premisesMail = premisesMail;
	}
	public String getPremisesLocation() {
		return premisesLocation;
	}
	public void setPremisesLocation(String premisesLocation) {
		this.premisesLocation = premisesLocation;
	}
	
}
