package com.skyline.spel;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Demo demo=context.getBean("demo", Demo.class);
		System.out.println(demo);
        System.out.println(demo.getE());
		SpelExpressionParser spel= new SpelExpressionParser();
		Expression expr= spel.parseExpression("22+34");
		System.out.println(expr.getValue());
	}

}
