package com.gl.student.service;

import java.util.HashMap;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.student.dao.StudentDAO;
import com.gl.student.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDAO studentDAO;
	public StudentService() {
		System.out.println("In Student Service");
	}
	public TreeMap<Integer,Student> getStudents()
	{
		System.out.println("In service get all");
		HashMap<Integer,Student> students=studentDAO.getAll();
		TreeMap <Integer,Student> sorted=new TreeMap<Integer, Student>(students);
		return sorted;
	}
	
	public TreeMap<Integer,Student> addStudent(int rollno,Student s)
	{
		HashMap<Integer,Student> students=studentDAO.insert(rollno, s);
		TreeMap<Integer,Student> sorted=new TreeMap<Integer, Student>(students);
		return sorted;
	}
}
