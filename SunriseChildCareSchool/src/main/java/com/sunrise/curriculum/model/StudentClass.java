package com.sunrise.curriculum.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class StudentClass {
	@Id
	@GeneratedValue
	private int class_id;
	private String studentclass;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="class_curriculum", joinColumns=@JoinColumn(name="class_id"), inverseJoinColumns=@JoinColumn(name="curriculum_id"))
	private Set<Curriculum> curriculums;
	
	
}
