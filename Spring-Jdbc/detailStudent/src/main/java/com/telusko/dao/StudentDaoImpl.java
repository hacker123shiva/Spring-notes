package com.telusko.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.telusko.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	public int addStudent(Student student) {
	    String query="insert into student(sid, name, city) values(?,?,?)";
	    int rowAffected=jdbcTemplate.update(query,student.getSid(),student.getName(),student.getCity());
		return rowAffected;
	}

	public int updateDetail(int enro, String city){
		 Student student=getStudentDetail(enro);
		 if(student!=null) {
			 String query="update student set city= ? where sid=?";
			 int rowAffected=jdbcTemplate.update(query,city,enro);
			 return rowAffected;
		 }else {
			return 0; 
		 }
		 
	}

	public int removeStudent(int enrNo) {
		 Student student=getStudentDetail(enrNo);
		 if(student!=null) {
			 String query="delete from student where sid=?";
			 int rowAffected=jdbcTemplate.update(query,enrNo);
			 return rowAffected;
		 }else {
			return 0; 
		 }
	}

	public Student getStudentDetail(int enrNo) {
	    String query="select * from student where sid=?";
	   Student student= jdbcTemplate.queryForObject(query, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student=new Student(rs.getInt(1), rs.getString(2),rs.getString(3));
				return student;
			}},enrNo);
	   
		return student;
	}

	public List<Student> getAllStudents() {
		 String query="Select * from student";
		 List<Student> lstStudents=jdbcTemplate.query(query, new RowMapper<Student>() {

				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					Student student=new Student(rs.getInt(1), rs.getString(2),rs.getString(3));
					return student;
				}});
		 
		return lstStudents;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
