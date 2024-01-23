package com.skyline.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class Main {
public static void main(String []args) {
	ApplicationContext context=new  AnnotationConfigApplicationContext(JavaConfig.class);
	
	Student student=  context.getBean("student",Student.class);
	
	System.out.println(student);
	student.studey();
}
}
