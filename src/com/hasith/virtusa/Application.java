package com.hasith.virtusa;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hasith.dao.DaoClass;
import com.hasith.dao.impl.DaoClassImpl;
import com.hasith.model.Student;

/**
 * Created by hasith on 1/21/2016.
 */
@Path("/resource")
public class Application {

	DaoClass all = new DaoClassImpl();
	
	/**
	 * iniitial method
	 * @return
	 */
    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> sayHello(){
        return all.getAllStudent();
    }

    /**
     * get Student name by Id
     * @param id
     * @return
     */
    @GET
    @Path("/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getNameById(@PathParam("id") int id){
    	return all.getStudentById(id);
    }
}
