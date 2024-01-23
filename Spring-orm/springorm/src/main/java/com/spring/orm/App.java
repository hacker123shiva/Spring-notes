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
    	 ApplicationContext ctx= ContextProvider.provideContext(); 
         StudentDao studentDao=ctx.getBean("stDao",StudentDao.class); 
   
         // insert 
         Student s=new Student(1004,"shiva"); 
         studentDao.insert(s);
         System.out.println("done");
    }
}
