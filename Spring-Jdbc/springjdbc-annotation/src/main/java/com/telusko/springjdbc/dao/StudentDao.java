package com.telusko.springjdbc.dao;

import java.util.List;

import com.telusko.springjdbc.entities.Student;

public interface StudentDao {
public int insert(Student student);
public int change(Student student);
public int delete(int sid);
public Student getStudent(int studentId);
public List<Student> getAllStudents();

}
