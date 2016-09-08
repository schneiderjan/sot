package tomcatservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author jan
 */
@WebService(endpointInterface="tomcatservice.ClassRoom")
public class SmallClassRoom implements ClassRoom {
    List<FontysStudent> students;
    private int maxStudents = 25;
    private String className;
    
//    public SmallClassRoom(String className){
//        maxStudents = 25;
//        this.className = className;
//    }
    public SmallClassRoom(){}

    @Override
    public boolean AddStudent(FontysStudent newStudent) {
        if (students.size() < maxStudents){
            return students.add(newStudent);
        }
        return false;
    }

    @Override
    public boolean RemoveStudent(FontysStudent student) {
        return students.remove(student);
    }

    @Override
    public String StartClass() {
        return "Class started. Hooray"; 
    }

    @Override
    public List<FontysStudent> GetStudentsInClass() {
        return students;
    }
    
    
    
}
