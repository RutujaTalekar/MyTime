package com.rem.mt.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIMESHEET")
public class TimeSheet {	
	@Id
	@Column(name="TSID")
	private int tsId;
	@Column(name="EID")
	private int empId;
	@Column(name="PID")
	private int projId;
	@Column(name="TSSTATUS")
	private String tsStatus;
	@Column(name="TSDATE")
	private Date tsDate;
	@Column(name="TSHOURS")
	private int hours;		//I am not sure how we take hours...will keep it int for now
	@Column(name="SHIFT")
	private String shift;
	
	public TimeSheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TimeSheet(int tsId, int empId, int projId, String tsStatus, Date tsDate, int hours, String shift) {
		super();
		this.tsId = tsId;
		this.empId = empId;
		this.projId = projId;
		this.tsStatus = tsStatus;
		this.tsDate = tsDate;
		this.hours = hours;
		this.shift = shift;
	}

	public int getTsId() {
		return tsId;
	}

	public void setTsId(int tsId) {
		this.tsId = tsId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getTsStatus() {
		return tsStatus;
	}

	public void setTsStatus(String tsStatus) {
		this.tsStatus = tsStatus;
	}

	public Date getTsDate() {
		return tsDate;
	}

	public void setTsDate(Date tsDate) {
		this.tsDate = tsDate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	@Override
	public String toString() {
		return "TimeSheet [tsId=" + tsId + ", empId=" + empId + ", projId=" + projId + ", tsStatus=" + tsStatus
				+ ", tsDate=" + tsDate + ", hours=" + hours + ", shift=" + shift + "]";
	}
	
	
	

}
