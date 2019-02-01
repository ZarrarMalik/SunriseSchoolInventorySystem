package com.sunrise.curriculum.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int student_id;
	private String username;
	private String password;
	private String className;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="student_class", joinColumns=@JoinColumn(name="student_id"), inverseJoinColumns=@JoinColumn(name="class_id"))
	private StudentClass studentClass;
	
	
	
	
	public Student() {
		super();
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public StudentClass getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(StudentClass studentClass) {
		this.studentClass = studentClass;
	}
	
	
	

	
	
	
	
	
	

}
