package com.skyline.sc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String []args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Person per=context.getBean("person1",Person.class);
	System.out.println(per.getFriends().getClass().getName());
	System.out.println(per.getFeestructure().getClass().getName());
	System.out.println(per);
}
}
