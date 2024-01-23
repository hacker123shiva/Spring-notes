package com.skyline.ref;

public class A {
private int x;
private B ob;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public B getOb() {
	return ob;
}
public void setOb(B ob) {
	this.ob = ob;
}
public A(int x, B ob) {
	super();
	this.x = x;
	this.ob = ob;
}
public A() {
	super();
	System.out.println("Object of A get Created");
}


}
