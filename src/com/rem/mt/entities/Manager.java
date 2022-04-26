package com.rem.mt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="MANAGER")
public class Manager {
	
	@Id
	@Column(name="MID")
	private int manId;
	@Column(name="EID")
	private int empId;
		
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int manId, int empId) {
		super();
		this.manId = manId;
		this.empId = empId;
	}
	public int getManId() {
		return manId;
	}
	public void setManId(int manId) {
		this.manId = manId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Manager [manId=" + manId + ", empId=" + empId + "]";
	}
	
}
