package com.skyline.constructorInjection;

import java.util.List;

public class Person {
private String name;
private int personId;
private Certi certi;
private List<String> lst;
public Person(String name, int personId, Certi certi, List<String> lst) {
	super();
	this.name = name;
	this.personId = personId;
	this.certi=certi;
	this.lst=lst;
	System.out.println("Person Object get created");
}
@Override
public String toString() {
	return "Person [name=" + name + ", personId=" + personId + "]";
}


public List<String> getLst() {
	return lst;
}

public Certi getCerti() {
	return certi;
}



 

}
