package com.skyline.stero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 public static void main(String []args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	 
	 Student st=context.getBean("obj",Student.class);
	 System.out.println(st.getAddress());
 }
}
