package com.garvit.it;

public class Address {
	
	private int pinocde ;
	private String city ;
	private String country ;
	
	
	
	public Address() {
		System.out.println("Addresss Object is Created");
	}
	
	
	
	public Address(int pinocde, String city, String country) {
		super();
		this.pinocde = pinocde;
		this.city = city;
		this.country = country;
	}



	public int getPinocde() {
		return pinocde;
	}



	public String getCity() {
		return city;
	}



	public String getCountry() {
		return country;
	}



	@Override
	public String toString() {
		return "Address [pinocde=" + pinocde + ", city=" + city + ", country=" + country + "]";
	}



	
	
	

}
