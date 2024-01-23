package com.spring.orm.dao;

 

import com.spring.orm.entities.Student;

import java.util.List; 

public interface StudentDao { 
    public int insert(Student s); 
    public void delete(int id); 
    public void delete(Student s); 
    public void update(Student s); 
    public Student getStudent(int id); 
    public List<Student> getAllStudents(); 
}