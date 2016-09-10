package tomcatservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author jan
 */
@WebService
public interface ClassRoom {
 
    @WebMethod
    public boolean AddStudent(Student newStudent);
    
    @WebMethod
    public boolean RemoveStudent(Student student);
    
    @WebMethod 
    public String StartClass();
}
