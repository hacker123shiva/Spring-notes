package com.spring.orm.dao;

 

 
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.spring.orm.entities.Student;
 
public class StudentDaoImpl  implements StudentDao {
    
	private HibernateTemplate hibernateTemplate;
	//save student
	@Transactional
	public int insert(Student student) {
		Integer i=(Integer) this.hibernateTemplate.save(student);
		return i;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public Student getStudent(int sid) {
	  Student student=   hibernateTemplate.get(Student.class,sid);
		return student;
	}
	public List<Student> getAllStudent() {
		List<Student> students=hibernateTemplate.loadAll(Student.class);
		return students;
	}
	@Transactional
	public void deleteStudent(int sid) {
		Student student=hibernateTemplate.get(Student.class, sid);
		hibernateTemplate.delete(student);
		return;
	}
	
	@Transactional
	public void deleteStudent(Student student) {
		hibernateTemplate.delete(student);
	}
	@Transactional
	public void updateStudent(Student student) {
	 hibernateTemplate.update(student);	
	}
	

	
}
