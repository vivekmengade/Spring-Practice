package com.DependencyInjection;

public class Address {
	
	String cname;
	int laneNo;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getLaneNo() {
		return laneNo;
	}
	public void setLaneNo(int laneNo) {
		this.laneNo = laneNo;
	}
	public Address(String cname, int laneNo) {
		super();
		this.cname = cname;
		this.laneNo = laneNo;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [cname=" + cname + ", laneNo=" + laneNo + "]";
	}
	
	
}
