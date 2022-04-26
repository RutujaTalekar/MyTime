package com.rem.mt.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROJECTDETAIL")
public class ProjectInfo {	
	@Id
	@Column(name="PID")
	private int projId;
	@Column(name="EID")
	private int empId;
	@Column(name="PNAME")
	private String projName;
	@Column(name="PCATEGORY")
	private String projCategory;
	@Column(name="PFROM")
	private Date startDate;
	@Column(name="PTO")
	private Date endDate;
	
	
	public ProjectInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectInfo(int projId, int empId, String projName, String projCategory, Date startDate, Date endDate) {
		super();
		this.projId = projId;
		this.empId = empId;
		this.projName = projName;
		this.projCategory = projCategory;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getProjCategory() {
		return projCategory;
	}

	public void setProjCategory(String projCategory) {
		this.projCategory = projCategory;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "ProjectInfo [projId=" + projId + ", empId=" + empId + ", projName=" + projName + ", projCategory="
				+ projCategory + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
	
}
