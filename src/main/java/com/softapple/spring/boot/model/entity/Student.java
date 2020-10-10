package com.softapple.spring.boot.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name= "email")
	private String email;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
