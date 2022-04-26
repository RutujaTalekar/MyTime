package com.rem.mt.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="REOPENREQUEST")
public class ReopenRequest {
	
	@Id
	@Column(name="RID")
	private int rId;
	@Column(name="EID")
	private int eId;
	@Column(name="REOPENDATE")
	private Date reopenDate;
	@Column(name="REOPENREASON")
	private String reopenReason;
	@Column(name="REOPENSTATUS")
	private String reopenStatus;
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public Date getReopenDate() {
		return reopenDate;
	}
	public void setReopenDate(Date reopenDate) {
		this.reopenDate = reopenDate;
	}
	public String getReopenReason() {
		return reopenReason;
	}
	public void setReopenReason(String reopenReason) {
		this.reopenReason = reopenReason;
	}
	public String getReopenStatus() {
		return reopenStatus;
	}
	public void setReopenStatus(String reopenStatus) {
		this.reopenStatus = reopenStatus;
	}
	public ReopenRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ReopenRequest [rId=" + rId + ", eId=" + eId + ", reopenDate=" + reopenDate + ", reopenReason="
				+ reopenReason + ", reopenStatus=" + reopenStatus + "]";
	}
	

}



