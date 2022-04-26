package com.rem.mt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LEAVEBALANCE")
public class LeaveBalance {
	@Id
	@Column(name="EID")
	private int eid;
	@Column(name="LEAVEBALANCE")
	private int LeaveBalance;
	
	public LeaveBalance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveBalance(int eid, int leaveBalance) {
		super();
		this.eid = eid;
		LeaveBalance = leaveBalance;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getLeaveBalance() {
		return LeaveBalance;
	}
	public void setLeaveBalance(int leaveBalance) {
		LeaveBalance = leaveBalance;
	}
	@Override
	public String toString() {
		return "LeaveBalance [eid=" + eid + ", LeaveBalance=" + LeaveBalance + "]";
	}
	
	
	
	}
