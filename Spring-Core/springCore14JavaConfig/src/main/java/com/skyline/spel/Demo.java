package com.skyline.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22-3}")
private int x;
	@Value("#{1+12}")
private int y;
	@Value("#{T(java.lang.Math).sqrt(24)}")
private double z;
	@Value("#{T(java.lang.Math).E}")
private double e;

	@Value("#{new java.lang.String('Shiva Srivastava').toLowerCase()}")
	private String name;


public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}


public double getZ() {
	return z;
}
public void setZ(double z) {
	this.z = z;
}


public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}


public String getName() {
	
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
}
 
 

}
