package com.hasith.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.hasith.dao.StudentManipulation;
import com.hasith.model.Student;
import com.hasith.util.HibernateUtilities;

public class StudentManipulationImpl implements StudentManipulation {

	public List<Student> getAllStudent() {
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
		for (Student student : getAllStudent()) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	@Override
	public Student insertStudent(Student student) {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getSessionFactory().close();
		return student;
	}
}
