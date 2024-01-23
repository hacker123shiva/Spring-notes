package com.telusko.controller;

import java.util.List;

import com.telusko.dao.StudentDao;
import com.telusko.entity.Student;

public class StudentControllerImpl implements StudentController{
   
	private StudentDao studentDao;
	public int addStudent(Student student) {
		int rowAffected=studentDao.addStudent(student);
		return rowAffected;
	}

	public int updateDetail(int enro, String city) {
	int rowAffected=studentDao.updateDetail(enro, city);
		return rowAffected;
	}

	public int removeStudent(int enrNo) {
	int rowAffected=studentDao.removeStudent(enrNo);
		return rowAffected;
	}

	public Student getStudentDetail(int enrNo) {
	    Student student=studentDao.getStudentDetail(enrNo);
		return student;
	}

	public List<Student> getAllStudents() {
	    List<Student> lstStudents=studentDao.getAllStudents();
		return lstStudents;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	
}
