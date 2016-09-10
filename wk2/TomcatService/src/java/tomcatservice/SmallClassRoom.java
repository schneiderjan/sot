package tomcatservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author jan
 */
@WebService(endpointInterface="tomcatservice.ClassRoom")
public class SmallClassRoom implements ClassRoom {
    List<Student> students;
    int maxStudents = 25;
    String className;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public SmallClassRoom(){
        students = new LinkedList<>();
        className = "SOT";
    }

    @Override
    public boolean AddStudent(Student newStudent) {
        if (students.size() < maxStudents){
            return students.add(newStudent);
        }
        return false;
    }

    @Override
    public boolean RemoveStudent(Student student) {
        return students.remove(student);
    }

    @Override
    public String StartClass() {
        return "Class started. Hooray"; 
    }    
}
