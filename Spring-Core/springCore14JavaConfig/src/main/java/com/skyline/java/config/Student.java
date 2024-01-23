package com.skyline.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 

@Component
public class Student {
	 
    private Samosa samosa;
    
    @Autowired
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public void studey() {
		System.out.println("Student is study book");
	}
}
