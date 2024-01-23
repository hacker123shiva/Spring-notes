package com.skyline.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context=	 new ClassPathXmlApplicationContext("config.xml");
   Emp emp1= context.getBean("emp",Emp.class);
	System.out.println(emp1);
	}

}
