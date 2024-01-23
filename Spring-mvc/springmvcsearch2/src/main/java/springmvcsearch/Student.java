package springmvcsearch;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
private String name;
private Long id;
@DateTimeFormat(pattern="dd/mm/yyyy")
private Date dob;
private List<String> skills;
private String gender;
private String studentType;

private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public List<String> getSkills() {
	return skills;
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getStudentType() {
	return studentType;
}
public void setStudentType(String studentType) {
	this.studentType = studentType;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", skills=" + skills + ", gender=" + gender
			+ ", studentType=" + studentType + ", address=" + address + "]";
}


 
}
