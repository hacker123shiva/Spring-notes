package com.telusko.entity;

public class Student {
private int sid;
private String name;
private String city;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Student() {
	 System.out.println("Non-paramertrized constructor");
}

public Student(int sid, String name, String city) {
	super();
	this.sid = sid;
	this.name = name;
	this.city = city;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", city=" + city + "]";
}



}
