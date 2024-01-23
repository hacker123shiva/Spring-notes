package com.telusko.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.telusko.springjdbc.dao.StudentDao;
import com.telusko.springjdbc.dao.StudentDaoImpl;
import com.telusko.springjdbc.entities.Student;
 
public class App 
{
    public static void main( String[] args )
    {
        //spring jdbc =>JdbcTemplate
    	System.out.println("Program started...");
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/telusko/springjdbc/config.xml");
StudentDao studentDao=  context.getBean("studentDao", StudentDaoImpl.class);    
      
//Student student=context.getBean("student",Student.class);
//student.setSid(333);
//student.setName("Abhimnyu");
//student.setCity("Ballia");
//
//int rowAffected=studentDao.change(student);
//if(rowAffected!=0) {
//	System.out.println("Student detail updated succesfully");
//}else {
//	System.out.println("Student detail not found");
//}

//int sid=33;
//int rowAffected=studentDao.delete(sid);
//if(rowAffected!=0) {
//System.out.println("Student deleted succesfully");
//}else {
//System.out.println("Student id not found");
//}

//Student student=studentDao.getStudent(222);
//System.out.println(student);

List<Student> students=studentDao.getAllStudents();
for(Student st: students) {
	System.out.println(st);
}
     }
}
