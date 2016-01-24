package com.hasith.dao;

import java.util.List;

import com.hasith.model.Student;

public interface DaoClass {
	
	List<Student> getAllStudent();
	
	Student getStudentById(int id);
}