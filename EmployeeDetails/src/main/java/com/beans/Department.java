package com.beans;

public class Department {
	int did;
	String dname;
	public Department() {
		super();
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

}
