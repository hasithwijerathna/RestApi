package com.hasith.controller;

import com.hasith.model.Student;

public interface StudentController {

	String insertionControl(String name);
	
	Student getingByIdController(int id);

}