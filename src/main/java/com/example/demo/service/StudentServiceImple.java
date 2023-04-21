package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImple implements StudentService {

	@Autowired
	private StudentRepository repository;

	@Override
	public Student addStudent(Student student) {
		Student s = repository.save(student);
		return s;
	}

	@Override
	public Student updateStudent(int sid, Student student) throws Exception {
		Student s = repository.findById(sid).orElseThrow(() -> new Exception("Student is not exists in data base.."));
		repository.delete(s);

		return repository.save(student);
	}

	@Override
	public String deleteStudent(int sId) throws Exception {
		Student s = repository.findById(sId).orElseThrow(() -> new Exception("Student is not exists in data base.."));
		repository.delete(s);

		return "Student is deleted ";
	}

	@Override
	public Student getStudent(int sId) throws Exception {

		return repository.findById(sId).orElseThrow(() -> new Exception("Student is not exists in data base.."));
	}

	@Override
	public List<Student> getAllStudents() {

		return repository.findAll();
	}

}
