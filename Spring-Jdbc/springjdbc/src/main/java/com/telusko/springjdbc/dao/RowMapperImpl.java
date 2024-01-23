package com.telusko.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.telusko.springjdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student>{

	private Student student;
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	    student=new Student();
		 
		student.setSid(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
