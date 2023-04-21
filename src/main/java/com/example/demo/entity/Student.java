package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="student_table")
public class Student {

	@Id
	@GeneratedValue
	private int sId;

	private String sName;

	private String teacherName;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	private Student(int sId, String sName, String teacherName) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.teacherName = teacherName;
	}

	private Student() {
		super();
	}

}
