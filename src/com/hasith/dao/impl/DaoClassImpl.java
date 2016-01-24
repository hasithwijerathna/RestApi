package com.hasith.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.hasith.dao.DaoClass;
import com.hasith.model.Student;

public class DaoClassImpl implements DaoClass {
	
	public List<Student> getAllStudent(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Kamal"));
		students.add(new Student(2, "Nimal"));
		students.add(new Student(3, "Ranil"));
		students.add(new Student(4, "Sunil"));
		students.add(new Student(5, "Janith"));
 		return students;
	}

	@Override
	public Student getStudentById(int id) {
    	for(Student student : getAllStudent()){
    		if(student.getId() == id){
    			return student;
    		}
    	}
    	return null;
	}
}
