package com.rem.mt.entities;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {	
	@Id
	@Column(name="EID")
	private int empId;
	@Column(name="EMPNAME")
	private String empName;
	@Column(name="EMPPASS")
	private String empPass;
	@Column(name="EMPEMAIL")
	private String empEmail;
	@Column(name="EMPCONTACT")
	private long empcontact;
	@Column(name="DOB")
	private Date DOB;
	@Column(name="GRADE")
	private String grade;
	@Column(name="MID")
	private int manId;
		
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empPass, String empEmail, long empcontact, Date dOB, String grade,
			int manId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPass = empPass;
		this.empEmail = empEmail;
		this.empcontact = empcontact;
		DOB = dOB;
		this.grade = grade;
		this.manId = manId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public long getEmpcontact() {
		return empcontact;
	}
	public void setEmpcontact(long empcontact) {
		this.empcontact = empcontact;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getManId() {
		return manId;
	}
	public void setManId(int manId) {
		this.manId = manId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPass=" + empPass + ", empEmail=" + empEmail
				+ ", empcontact=" + empcontact + ", DOB=" + DOB + ", grade=" + grade + ", manId=" + manId + "]";
	}
	

}
