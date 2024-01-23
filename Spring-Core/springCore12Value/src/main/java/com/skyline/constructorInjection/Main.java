package com.skyline.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	 Addition ad=(Addition)context.getBean("add");
	 ad.doSum();
	}

}
