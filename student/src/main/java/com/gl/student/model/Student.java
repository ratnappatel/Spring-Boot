package com.gl.student.model;

import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Student {
	private int rollno;
	private String name;
	private String stream;
	private String mobileNo;
	private int marks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno,String name, String stream, String mobileNo, int marks) {
		super();
		this.rollno=rollno;
		this.name = name;
		this.stream = stream;
		this.mobileNo = mobileNo;
		this.marks = marks;
	}
}
