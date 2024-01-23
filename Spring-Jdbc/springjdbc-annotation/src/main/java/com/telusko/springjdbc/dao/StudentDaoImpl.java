package com.telusko.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.telusko.springjdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
   
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private RowMapper<Student> rowMapper;
	public int insert(Student student) {
	      //insert query 
	      String query="insert into student(sid,name,city) values(?,?,?)";
	    int rowAffected=  this.jdbcTemplate.update(query, student.getSid(),student.getName(),student.getCity());
		if(rowAffected!=0) {
			return 1;
		}
		else 
			return 0;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public RowMapper<Student> getRowMapper() {
		return rowMapper;
	}
	public void setRowMapper(RowMapper<Student> rowMapper) {
		this.rowMapper = rowMapper;
	}
	public int change(Student student) {
	    String query ="update student set name=?, city=? where sid=?";  
	    int rowAffected= this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getSid());
		return rowAffected;
	}
	public int delete(int sid) {
		String query="delete from student where sid=?";
		int rowAffected=this.jdbcTemplate.update(query,sid);
		return rowAffected;
	}
	public Student getStudent(int studentId) {
		String query="select * from student where sid=?";
		
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
//		Student student=this.jdbcTemplate.queryForObject(query, new RowMapper<Student>() {
//
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student student=new Student();
//				student.setSid(rs.getInt(1));
//				student.setName(rs.getString(2));
//				student.setCity(rs.getString(3));
//				return student;
//			}},studentId);
		return student;
	}
	public List<Student> getAllStudents() {
		String query="select * from student";
		List<Student> students=this.jdbcTemplate.query(query,rowMapper);
		return students;
	}
	
}
