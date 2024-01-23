package com.skyline.constructorInjection;

public class Addition {
private int a;
private int b;

public Addition() {
	
}
public Addition(double  a, double b) {
	this.a=(int)a;
	this.b=(int)b;
	System.out.println("A object get created of double, double");
	
}

public Addition(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("A value is: "+a);
	System.out.println("B value is: "+b);
	System.out.println("A Object get created of int, int");
}

public Addition(String a, String b) {
	super();
	this.a = Integer.parseInt(a);
	this.b = Integer.parseInt(b);
	System.out.println("A Object get created of String, String");
}

 

public void doSum() {
	System.out.println("Sum is = "+(this.a+this.b));
}


}
