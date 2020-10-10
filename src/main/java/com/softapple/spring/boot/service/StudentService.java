package com.softapple.spring.boot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softapple.spring.boot.model.dto.StudentDTO;
import com.softapple.spring.boot.model.entity.Student;
import com.softapple.spring.boot.repository.StudentRepository;;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public String saveStudent(StudentDTO studentDTO) {

		Student student = copyStudentDtoToStudent(studentDTO);
		studentRepository.save(student);
		return "Data saved successfully!";
	}

	public String updateStudent(StudentDTO studentDTO) {

		Student student = copyStudentDtoToStudent(studentDTO);
		studentRepository.save(student);
		return "Data updated successfully!";
	}

	public List<StudentDTO> findAllStudents() {

		List<Student> students = studentRepository.findAll();

		List<StudentDTO> studentDTOs = students.stream().map(student -> copyStudentToStudentDTO(student))
				.collect(Collectors.toList());

		return studentDTOs;

	}

	public StudentDTO findStudentById(Long studentId) {

		Student student = studentRepository.findOne(studentId);
		return copyStudentToStudentDTO(student);
	}

	public StudentDTO findStudentByIdAndName(Long studentId, String name) {

		Student student = studentRepository.findByStudentIdAndStudentName(studentId, name);

		return copyStudentToStudentDTO(student);

	}

	public Student copyStudentDtoToStudent(StudentDTO studentDTO) {

		Student student = new Student();
		BeanUtils.copyProperties(studentDTO, student);
		return student;
	}

	public StudentDTO copyStudentToStudentDTO(Student student) {
		if (student != null) {
			StudentDTO studentDTO = new StudentDTO();
			BeanUtils.copyProperties(student, studentDTO);

			return studentDTO;
		}else {
			return null;
		}

	}

	public String deleteStudentById(Long studentId) {

		studentRepository.delete(studentId);

		return "Data deleted successfully!";

	}

}
