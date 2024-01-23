package com.skyline.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    Emp em=(Emp)context.getBean("emp1");
    System.out.println(em);
    System.out.println(em.getProperties());
	}

}
