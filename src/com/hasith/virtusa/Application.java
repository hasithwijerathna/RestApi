package com.hasith.virtusa;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hasith.dao.impl.DaoClass;
import com.hasith.dao.impl.DaoClassImpl;
import com.hasith.model.Student;

/**
 * Created by hasith on 1/21/2016.
 */
@Path("/resource")
public class Application {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> sayHello(){
    	DaoClass all = new DaoClassImpl();
        return all.getAllStudent();
    }
}
