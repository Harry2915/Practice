package com.model;

public class Employee {
String firstName;
String lastName;
int age;
Address address;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(String firstName, String lastName, int age, Address address) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.address = address;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
			+ "]";
}

}
