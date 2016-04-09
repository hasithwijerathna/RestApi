package com.hasith.controller.impl;

import com.hasith.controller.StudentController;
import com.hasith.dao.StudentDao;
import com.hasith.dao.impl.StudentDaoImpl;
import com.hasith.model.Student;

public class StudentControllerImpl implements StudentController {
	
	StudentDao studentManipulation = new StudentDaoImpl();
	
	/* (non-Javadoc)
	 * @see com.hasith.controller.impl.StudentController#insertStudentController(int, java.lang.String)
	 */
	@Override
	public String insertionControl(String name){
		studentManipulation.insertStudent(new Student(name));
		return name+ " inserted.";
	}

	@Override
	public Student getingByIdController(int id) {
		return studentManipulation.getStudentById(id);
	}
}
