package com.hasith.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hasith.controller.StudentController;
import com.hasith.controller.impl.StudentControllerImpl;
import com.hasith.dao.StudentDao;
import com.hasith.dao.impl.StudentDaoImpl;
import com.hasith.model.Student;

/**
 * Created by hasith on 1/21/2016.
 */
@Path("/resource")
public class StudentResource {

	StudentDao all = new StudentDaoImpl();
	StudentController controller = new StudentControllerImpl();
	
	/**
	 * iniitial method
	 * @return
	 */
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> sayHello(){
        return all.getAllStudent();
    }

    /**
     * call for getting Student by Id
     * @param id
     * @return
     */
    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getNameById(@PathParam("id") int id){
    	return controller.getingByIdController(id);
    }
    
    /**
     * call for insert a Student
     * @param name as a String
     * @return Student object
     */
    @POST
    @Path("/insert/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String insertStudent(@PathParam("name") String name){
    	return controller.insertionControl(name);
    }
}
