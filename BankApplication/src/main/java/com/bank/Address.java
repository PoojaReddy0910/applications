package com.bank;

public class Address {
	private long hNo;
    private String city;
    private String state;
	public long gethNo() {
		return hNo;
	}
	public void sethNo(long hNo) {
		this.hNo = hNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address(long hNo, String city, String state) {
		super();
		this.hNo = hNo;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", city=" + city + ", state=" + state + "]";
	}
    
 

}
