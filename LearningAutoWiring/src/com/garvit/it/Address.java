package com.garvit.it;

public class Address {
	
	private String city ;
	private String Country ;
	private int pinCode ;
	
	
	public Address() {
		System.out.println("Address Class Object is Callled");
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", Country=" + Country + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
