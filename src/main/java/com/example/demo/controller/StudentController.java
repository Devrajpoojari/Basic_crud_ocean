package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;

	// add student
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}

	// update student

	@PutMapping("/update/{sid}")
	public Student updateStudent(@PathVariable int sid, @RequestBody Student student) throws Exception {
		return service.updateStudent(sid, student);
	}

	// delete student

	@DeleteMapping("/delete/{sId}")
	public String deleteStudent(@PathVariable int sId) throws Exception {
		return service.deleteStudent(sId);
	}

	// get the student by student id
	@GetMapping("/get/{sId}")
	public Student getStudent(@PathVariable int sId) throws Exception {
		return service.getStudent(sId);
	}

	// list of students from data base

	@GetMapping("/getAll")
	public List<Student> getAllStudents() {
		return service.getAllStudents();
	}

}
