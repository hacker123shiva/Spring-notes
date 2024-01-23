package com.spring.orm.dao;

 

import java.util.List;

import com.spring.orm.entities.Student;

public interface StudentDao {
	 
public int insert(Student student);


//get the single data(object)
public Student getStudent(int sid) ;


//get multiple data(object)
public List<Student> getAllStudent();

//delete object using id
public void deleteStudent(int sid);

//delete object using student object
public void deleteStudent(Student student);

//Update object using student object
public void updateStudent(Student student);
}

 
 