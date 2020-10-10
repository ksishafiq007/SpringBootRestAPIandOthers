package com.softapple.spring.boot.model.dto;

import javax.persistence.Column;

public class StudentDTO {

	private Long studentId;
	
	private String studentName;
	
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
