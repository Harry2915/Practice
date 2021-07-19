package com.model;

public class Address {
String streetName;
int HouseNo;
String city;
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public int getHouseNo() {
	return HouseNo;
}
public void setHouseNo(int houseNo) {
	HouseNo = houseNo;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address(String streetName, int houseNo, String city) {
	super();
	this.streetName = streetName;
	HouseNo = houseNo;
	this.city = city;
}
public Address() {
	super();
}
@Override
public String toString() {
	return "Address [streetName=" + streetName + ", HouseNo=" + HouseNo + ", city=" + city + "]";
}

}
