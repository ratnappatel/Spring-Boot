package com.gl.student.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

import com.gl.student.model.Student;

@Component("service")//studentService
public class StudentService {

private static ArrayList<Student> students=new ArrayList<Student>();
	
	static {
		System.out.println("In Studnt DAO..");
		students.add( new Student(11,"Chesta","CS", "98463747", 450));
		students.add( new Student(12,"Kilpa","EEE", "6443748", 567));
		students.add( new Student(13,"Kalpana","IT", "637424183", 509));
		students.add( new Student(14,"Jalpa","ECE", "16374838", 398));
		students.add(new Student(15, "Harshita","ME", "7984527", 650));
		students.add( new Student(16,"Roshani","CS", "6374993", 612));
	}

	public ArrayList<Student> getAll()
	{
		System.out.println("In DAO get ALL");
		
		return students;
	}
	public Student getStudent(int rollno)
	{
		return students.get(rollno);
	}
	public Student updateStudent(int rollno,Student s)
	{
		students.add(rollno,s);
		Student updated=students.get(rollno);
		return updated;
	}
	public ArrayList<Student> insert(Student s)
	{
		students.add(s);
		return students;
	}
	public String delete(int rollno)
	{
		if(students.remove(rollno)!=null)
			return "deleted";
		
		else
			return "Not Deleted";
		
	}
}
