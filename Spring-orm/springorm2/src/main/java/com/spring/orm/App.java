package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
 
	public static void main( String[] args )
    {
    	System.out.println("Application is started...");
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
       
//       Student student =new Student(234,"Abhishek Srivastava","Ballia");
//       int r=studentDao.insert(student);
//       System.out.println(r);
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("********************Welcome to spring orm project********************");
      outer: while(true) {
       System.out.println("PRESS 1 for add new Student");
       System.out.println("PRESS 2 for display all Students");
       System.out.println("Press 3 for get detail of single stuudent");
       System.out.println("Press 4 for delete student");
       System.out.println("PRESS 5 for update student");
       System.out.println("PRESS 6 for exit");
       
       
       try {
    	 int input= Integer.parseInt(br.readLine()) ;
    	 switch(input) {
    	  
    	 case 1:{
 	        Student student=new Student();
 	        System.out.println("Enter details of Student ");
 	        System.out.print("Enter Student Id:: ");
 	        int sid=Integer.parseInt(br.readLine());
 	        System.out.print("Enter Student Name:: ");
 	        
 	        String name=br.readLine();
 	        System.out.print("Enter City  Name:: ");
 	        String city= br.readLine();
 	        
 	        student.setSid(sid);
 	        student.setSname(name);
 	        student.setScity(city);
 	        
 	        int rowAffected=studentDao.insert(student);
 	        
 	        if(rowAffected!=0) {
 	        	System.out.println("Student added Succefully to database");
 	        }else {
 	        	System.out.println("Student enrNo exist");
 	        }
 	        System.out.println();
 	    	break;
 	    }
 	    
    	
    	    case 2:{
    	       List<Student> listStudents=studentDao.getAllStudent();
    	       int i=1;
    	       for(Student student: listStudents) {
    	    	   System.out.println("Student "+i+" detail is "+student);
    	    	   i++;
    	       }
    	       System.out.println();
    	    	break;
    	    }
    	    
    	    case 3:{
    	    	System.out.println("Enter Enrollment Number of Student:: ");
    	    	int enro=Integer.parseInt(br.readLine());
    	    	Student student=studentDao.getStudent(enro);
    	    	if(student!=null) {
    	    		System.out.println("Student detail is:: "+student);
    	    	}else {
    	    		System.out.println("Student detail not found");
    	    	}
    	    	 System.out.println();
    	       break;
    	    }
    	    
    	     
    	    case 4: {
    	    	System.out.print("Enter Enro Number:: ");
    	    	int enro=Integer.parseInt(br.readLine());
    	    	studentDao.deleteStudent(enro);
    	    	System.out.println("Student deleted succesfully");
    	    	break;
    	    }
    	    
    	    case 5:{
    	    	 System.out.print("Enter Enro Number:: ");
    	    	 int enro=Integer.parseInt(br.readLine());
    	    	 
    	    	 System.out.println("Enter name:: ");
    	    	 String name=br.readLine();
    	    	 
    	    	 System.out.print("Enter City Name:: ");
    	    	 String city=br.readLine();
    	    	 
    	    	 Student student=new Student(enro,name,city);
    	    	 
    	    	 studentDao.updateStudent(student);
    	    	 System.out.println("Student detail updated succesfully");
    	    	break;
    	    }
    	 
    	    case 6:{
    	    	System.out.println("You are exit from Student Portal");
    	    	System.out.println("Thank You");
    	    	break outer;
    	    }
    	    default :{
    	    	System.out.println("Enter Correct Option from 0 to 5");
    	    	 System.out.println();
    	    	break;
    	    }
    	    
    	    }
       }catch(Exception e) {
    	   System.out.println("Invalid Input try with another one!!");
    	   
       }
       }
       
       
       
       
    }
}
