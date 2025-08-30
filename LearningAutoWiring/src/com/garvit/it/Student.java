package com.garvit.it;

public class Student {
	private String name ;
	private int id ;
	private long mobileNumber ;
	private Address address ;
	
	

	public Student() {
		System.out.println("Student_Class");
	}
	
	
	
	public Student(String name, int id, long mobileNumber, Address address) {
		this.name = name;
		this.id = id;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}
	

}
