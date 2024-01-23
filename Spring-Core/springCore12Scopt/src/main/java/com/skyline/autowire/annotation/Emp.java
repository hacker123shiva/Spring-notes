package com.skyline.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired //first way ->call non parametrized constructor
     @Qualifier("address2")
	private Address address;

	public Address getAddress() {
	return address;
}

	//@Autowired
public void setAddress(Address address) {
	System.out.println("Setter injection");
	this.address = address;
}

	public Emp() {
		System.out.println("non parametrized constructor");
		 }
	
//	@Autowired
	public Emp(Address address) {
		System.out.println("parametrixed constructor");
		this.address=address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
