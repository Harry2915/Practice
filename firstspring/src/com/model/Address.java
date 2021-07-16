package com.model;

public class Address {
int house_no;
String street;
int pin;
public int getHouse_no() {
	return house_no;
}
public void setHouse_no(int house_no) {
	this.house_no = house_no;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public Address(int house_no, String street, int pin) {
	super();
	this.house_no = house_no;
	this.street = street;
	this.pin = pin;
}
@Override
public String toString() {
	return "Address [house_no=" + house_no + ", street=" + street + ", pin=" + pin + "]";
}

}
