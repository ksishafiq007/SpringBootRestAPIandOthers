package com.softapple.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softapple.spring.boot.model.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByStudentIdAndStudentName(Long studentId, String name);

}
