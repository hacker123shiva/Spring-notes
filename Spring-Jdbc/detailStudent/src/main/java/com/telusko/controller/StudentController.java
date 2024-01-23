package com.telusko.controller;

import java.util.List;

import com.telusko.entity.Student;

public interface StudentController {
	public int addStudent(Student student);
	public int updateDetail(int enro, String city);
	public int removeStudent(int enrNo);
	public Student getStudentDetail(int enrNo);
	public List<Student> getAllStudents();
}
