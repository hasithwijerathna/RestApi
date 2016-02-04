package com.hasith.dao;

import java.util.List;

import com.hasith.model.Student;

public interface StudentManipulation {

	List<Student> getAllStudent();

	Student getStudentById(int id);

	Student insertStudent(Student student);
}