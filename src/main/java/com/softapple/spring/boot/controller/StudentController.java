package com.softapple.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softapple.spring.boot.model.dto.StudentDTO;
import com.softapple.spring.boot.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@RequestBody StudentDTO studentDTO) {
		return studentService.saveStudent(studentDTO);
	}
	
	@RequestMapping(value = "/find-all", method = RequestMethod.GET)
	public List<StudentDTO> findAllStudents(){
		return studentService.findAllStudents();
	}
	
	@RequestMapping(value = "/find/by/id", method = RequestMethod.GET)
	public StudentDTO findStudentById(@RequestParam Long studentId) {
		
		return studentService.findStudentById(studentId);		
	}
	
	@RequestMapping(value = "/find/by/id/and/name", method = RequestMethod.GET)
	public StudentDTO findStudentByIdAndName(@RequestParam Long studentId, @RequestParam String name) {
		
		return studentService.findStudentByIdAndName(studentId, name);		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateStudent(@RequestBody StudentDTO studentDTO) {
		return studentService.updateStudent(studentDTO);
	}
	
	@RequestMapping(value = "/delete/by/id", method = RequestMethod.GET)
	public String deleteStudentById(@RequestParam Long studentId) {
		
		return studentService.deleteStudentById(studentId);		
	}
}
