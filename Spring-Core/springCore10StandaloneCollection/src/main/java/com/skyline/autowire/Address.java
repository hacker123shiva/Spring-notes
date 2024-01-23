package com.skyline.autowire;

public class Address {
public String street;
public String city;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}


}
