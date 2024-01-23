package com.skyline.stero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 public static void main(String []args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	 
	 Student st=context.getBean("obj",Student.class);
	 System.out.println(st.hashCode());
	 
	 Student st1=context.getBean("obj",Student.class);
	 System.out.println(st1.hashCode());
	 
	 Teacher t1=context.getBean("teacher",Teacher.class);
	 System.out.println("teacher1: "+t1.hashCode());
	 
	 Teacher t2=context.getBean("teacher",Teacher.class);
	 System.out.println("teacher2: "+t2.hashCode());
 }
}
