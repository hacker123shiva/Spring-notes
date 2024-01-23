package com.skyline.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	 Person p=(Person)context.getBean("person1");
	 System.out.println(p);
	 System.out.println(p.getCerti());
     System.out.println(p.getLst());
	}

}
