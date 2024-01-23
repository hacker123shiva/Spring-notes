package com.telusko;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.controller.StudentController;
import com.telusko.entity.Student;

public class App {

	public static void main(String[] args) {
    boolean pass=true;
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to Student Portal");
    
    ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    StudentController stController=context.getBean("studentController",StudentController.class);
    
    while(pass) {
    	 
System.out.println("Enter the given option:"
		+ "\n1: To get detail of particular Student using enronumbe"
		+ "\n2: To get detail of all Students"
		+ "\n3: Add Student in database"
		+ "\n4: Update only city in database"
		+ "\n5: Delete student from database"
		+ "\n0: Exit from Student portal");
    
    int x=sc.nextInt();
    
    switch(x) {
    case 0:{
    	pass=false;
    	System.out.println("You are exit from Student Portal");
    	System.out.println("Thank You");
    	break;
    }
    case 1:{
    	System.out.println("Enter Enrollment Number of Student:: ");
    	int enro=sc.nextInt();
    	Student student=stController.getStudentDetail(enro);
    	if(student!=null) {
    		System.out.println("Student detail is:: "+student);
    	}else {
    		System.out.println("Student detail not found");
    	}
    	 System.out.println();
       break;
    }
    case 2:{
       List<Student> listStudents=stController.getAllStudents();
       int i=1;
       for(Student student: listStudents) {
    	   System.out.println("Student "+i+" detail is "+student);
    	   i++;
       }
       System.out.println();
    	break;
    }
    
    case 3:{
        Student student=context.getBean("student", Student.class);
        System.out.println("Enter details of Student ");
        System.out.print("Enter Student Id:: ");
        int sid=sc.nextInt();
        System.out.print("Enter Student Name:: ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.print("Enter City  Name:: ");
        String city=sc.nextLine();
        
        student.setSid(sid);
        student.setName(name);
        student.setCity(city);
        
        int rowAffected=stController.addStudent(student);
        
        if(rowAffected!=0) {
        	System.out.println("Student added Succefully to database");
        }else {
        	System.out.println("Student enrNo exist");
        }
        System.out.println();
    	break;
    }
    
    case 4:{
    	 System.out.print("Enter Enro Number:: ");
    	 int enro=sc.nextInt();
    	 sc.nextLine();
    	 System.out.print("Enter City Name:: ");
    	 String city=sc.nextLine();
    	 
    	 int rowAffected= stController.updateDetail(enro, city);
    	 if(rowAffected!=0) {
    		 System.out.println("Student city updated succesfully");
    	 }else {
    		 System.out.println("Student detail not found");
    	 }
    	 System.out.println();
    	break;
    }
    
    case 5: {
    	System.out.print("Enter Enro Number:: ");
    	int enro=sc.nextInt();
    	int rowAffected=stController.removeStudent(enro);
    	
    	if(rowAffected!=0) {
    		System.out.println("Student detail deleted Succefully");
    	}else {
    		System.out.println("Student detail not exist");
    	}
    	 System.out.println();
    	break;
    }
    default :{
    	System.out.println("Enter Correct Option from 0 to 5");
    	 System.out.println();
    	break;
    }
    
    }
	}

}
}
