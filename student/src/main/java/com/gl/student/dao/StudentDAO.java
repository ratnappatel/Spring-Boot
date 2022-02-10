package com.gl.student.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.gl.student.model.Student;

@Repository
public class StudentDAO {
	
	private HashMap<Integer,Student> students=new HashMap<Integer, Student>();
	public StudentDAO() {
		System.out.println("In Studnt DAO..");
		students.put(11, new Student("Chesta","CS", "98463747", 450));
		students.put(12, new Student("Kilpa","EEE", "6443748", 567));
		students.put(13, new Student("Kalpana","IT", "637424183", 509));
		students.put(14, new Student("Jalpa","ECE", "16374838", 398));
		students.put(15, new Student("Harshita","ME", "7984527", 650));
		students.put(16, new Student("Roshani","CS", "6374993", 612));
	}

	public HashMap<Integer,Student> getAll()
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
		students.put(rollno,s);
		Student updated=students.get(rollno);
		return updated;
	}
	public HashMap<Integer,Student> insert(int rollno,Student s)
	{
		students.put(rollno, s);
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
