package com.skyline.lc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
private String subject;


public String getSubject() {
	return subject;
}


public void setSubject(String subject) {
	this.subject = subject;
}


	public Example() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
}
