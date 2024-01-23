package com.skyline.lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String []args) {
	
	//enable preshutdown hook to call destroy method 
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Samosa s1=(Samosa)context.getBean("samosa");
	System.out.println(s1);
	context.registerShutdownHook();
	
	
	
}
}
