package com.hasith.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hasith.dao.StudentDao;
import com.hasith.model.Student;
import com.hasith.util.HibernateUtilities;

public class StudentDaoImpl implements StudentDao {
	

	public List<Student> getAllStudent() {
		
		Session session = HibernateUtilities.currentSession();
		session.beginTransaction();
		//Student student = (Student)session.get(Student.class,id);
		Query query = session.createQuery("from com.hasith.model.Student");
		List<Student> students = query.list();
		session.getTransaction().commit();
		//session.close();
		HibernateUtilities.closeSession();
		
		
		/*students.add(new Student(1, "Kamal"));
		students.add(new Student(2, "Nimal"));
		students.add(new Student(3, "Ranil"));
		students.add(new Student(4, "Sunil"));
		students.add(new Student(5, "Janith"));*/
		return students;
	}

	@Override
	public Student getStudentById(int id) {
		Session session = HibernateUtilities.currentSession();
		session.beginTransaction();
		//Student student = (Student)session.get(Student.class,id);
		Student student = (Student)session.get(Student.class, id);
		session.getTransaction().commit();
		//session.close();
		HibernateUtilities.closeSession();
		return student;
	}

	@Override
	public Student insertStudent(Student student) {
		Session session = HibernateUtilities.currentSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		//session.close();
		HibernateUtilities.closeSession();
		System.out.println(student.getId()+" Saved");
		return student;
	}
}
