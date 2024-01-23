package com.skyline.constructorInjection;

public class Certi {
private String name;

public Certi() {
	super();
}

public Certi(String name) {
	this.name=name;
	System.out.println("Certi object get created");
}

@Override
public String toString() {
	return "Certi [name=" + name + "]";
}


}
