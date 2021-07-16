package com.model;

public class Employee {
String fname;
String lname;
Address address;
public Employee(String fname, String lname, Address address) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [fname=" + fname + ", lname=" + lname + ", address=" + address.toString() + "]";
}


}
