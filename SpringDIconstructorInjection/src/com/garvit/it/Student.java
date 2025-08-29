package com.garvit.it;

import java.util.*;

public class Student {
	
	private int id ;
	private String name ;
	private Address address ;
	Map<String, Integer> marks = new HashMap<>();
	
	
	
	
	
	
	
	
	public Student() {
		System.out.println("Student object Created");
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Student(int id, String name, Address address, Map<String, Integer> marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	
	public Map<String, Integer> getMap(){
		return this.marks ;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
	
	
	
	

}
