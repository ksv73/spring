package com.cgi.annotationbasedconfigurationdemo1;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private int age;
	private String name;
	private Address address;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
