package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.dao.StudentDaoImpl;
import com.spring.orm.entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Application is started...");
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao= context.getBean("studentDao",StudentDaoImpl.class);
       
       Student student =new Student(234,"Abhishek Srivastava","Ballia");
       int r=studentDao.insert(student);
       System.out.println(r);
       
    }
}
