package com.skyline.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	 A obj=(A)context.getBean("aref");
	 System.out.println(obj);

	}

}
