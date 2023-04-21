package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	// add student

	Student addStudent(Student student);

	// update student

	Student updateStudent(int sid, Student student) throws Exception;

	// delete student

	String deleteStudent(int sId) throws Exception;

	// get the student by student id
	Student getStudent(int sId) throws Exception;

	// list of students from data base

	List<Student> getAllStudents();

}
