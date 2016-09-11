/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomcatservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author jan
 */
@WebService
public interface ICompositeServ {

    @WebMethod
    boolean AddStudent(Student newStudent);
    @WebMethod
    String Fail();
    @WebMethod
    String Pass();
    @WebMethod
    boolean RemoveStudent(Student student);
    @WebMethod
    String StartClass();
    @WebMethod
    String getClassName();
    @WebMethod
    SmallClassRoom getClassRoom();
    @WebMethod
    int getMaxStudents();
    @WebMethod
    Student getStudent();
    @WebMethod
    List<Student> getStudents();
    @WebMethod
    String getStundentName();
    @WebMethod
    void setClassName(String className);
    @WebMethod
    void setClassRoom(SmallClassRoom classRoom);
    @WebMethod
    void setMaxStudents(int maxStudents);
    @WebMethod
    void setStudent(Student student);
    @WebMethod
    void setStudents(List<Student> students);
    @WebMethod
    void setStundentName(String stundentName);
    
}
