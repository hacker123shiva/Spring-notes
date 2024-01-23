package com.spring.orm.entities;

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.Id; 
import javax.persistence.Table; 
  
@Entity
@Table(name="Student_Details") 
public class Student { 
    @Id
    @Column(name="Student_Id") 
    private int id; 
    @Column(name="Student_Name") 
    private String name; 
  
    public Student() { 
    } 
  
    public Student(int id, String name) { 
        this.id = id; 
        this.name = name; 
    } 
  
    public void setId(int id) { 
        this.id = id; 
    } 
  
    public void setName(String name) { 
        this.name = name; 
    } 
  
    public int getId() { 
        return id; 
    } 
  
    public String getName() { 
        return name; 
    } 
  
    @Override
    public String toString() { 
        return "Student{" + 
                "id=" + id + 
                ", name='" + name + '\'' + 
                '}'; 
    } 
} 