package com.rem.mt.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="LEAVEREQUEST")
public class LeaveRequest {
	@Id
	@Column(name="LEVID")
	private int LId;
	@Column(name="EID")
	private int eId;
	@Column(name="LEVFROM")
	private Date leaveStartingDate;
	@Column(name="NOOFDAYS")
	private int noOfDays;
	@Column(name="LEVSTATUS")
	private String leaveStatus;
	@Column(name="LEVREMARKS")
	private String leaveReason;
	
	
	public LeaveRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LeaveRequest(int lId, int eId, Date leaveStartingDate, int noOfDays, String leaveStatus,
			String leaveReason) {
		super();
		LId = lId;
		this.eId = eId;
		this.leaveStartingDate = leaveStartingDate;
		this.noOfDays = noOfDays;
		this.leaveStatus = leaveStatus;
		this.leaveReason = leaveReason;
	}


	public int getLId() {
		return LId;
	}


	public void setLId(int lId) {
		LId = lId;
	}


	public int geteId() {
		return eId;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}


	public Date getLeaveStartingDate() {
		return leaveStartingDate;
	}


	public void setLeaveStartingDate(Date leaveStartingDate) {
		this.leaveStartingDate = leaveStartingDate;
	}


	public int getNoOfDays() {
		return noOfDays;
	}


	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}


	public String getLeaveStatus() {
		return leaveStatus;
	}


	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}


	public String getLeaveReason() {
		return leaveReason;
	}


	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}


	@Override
	public String toString() {
		return "LeaveRequest [LId=" + LId + ", eId=" + eId + ", leaveStartingDate=" + leaveStartingDate + ", noOfDays="
				+ noOfDays + ", leaveStatus=" + leaveStatus + ", leaveReason=" + leaveReason + "]";
	}

	
	
}


