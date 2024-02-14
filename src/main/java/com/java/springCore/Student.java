package com.java.springCore;
public class Student {
	String name;
	int roll_no;
	Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", address=" + address + "]";
	}
	public Student(String name, int roll_no, Address address) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.address = address;
	}
}

