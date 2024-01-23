package com.spring.orm.dao;

 

 
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.spring.orm.entities.Student;
 
  
  
import java.util.List; 
  
public class StudentDaoImpl implements StudentDao{ 
    private HibernateTemplate hTemplate; 
  
    public void sethTemplate(HibernateTemplate hTemplate) { 
        this.hTemplate = hTemplate; 
    } 
  
    
    @Transactional
    public int insert(Student s) { 
        return (Integer) hTemplate.save(s); 
    } 
  
   
    @Transactional
    public void delete(int id) { 
        Student s=hTemplate.get(Student.class,id); 
        hTemplate.delete(s); 
    } 
  
     
    @Transactional
    public void delete(Student s) { 
        hTemplate.delete(s); 
    } 
  
 
    @Transactional
    public void update(Student s) { 
        hTemplate.update(s); 
    } 
  
     
    public Student getStudent(int id) { 
        return hTemplate.get(Student.class,id); 
    } 
  
     
    public List<Student> getAllStudents() { 
        return hTemplate.loadAll(Student.class); 
    } 
} 
