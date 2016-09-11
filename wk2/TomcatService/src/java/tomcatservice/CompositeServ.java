/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomcatservice;

import java.util.List;
import javax.jws.WebService;


@WebService(endpointInterface="tomcatservice.ICompositeServ")
public class CompositeServ implements ICompositeServ {
Student student;
SmallClassRoom classRoom;

    @Override
    public Student getStudent() {
        return student;
    }

    @Override
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public SmallClassRoom getClassRoom() {
        return classRoom;
    }

    @Override
    public void setClassRoom(SmallClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public CompositeServ() {
        student = new Student();
        classRoom = new SmallClassRoom();
    }
    
    
@Override
    public boolean AddStudent(Student newStudent) {
        return classRoom.AddStudent(newStudent);
    }

    @Override
    public boolean RemoveStudent(Student student) {
        return classRoom.RemoveStudent(student);
    }

    @Override
    public String StartClass() {
        return classRoom.StartClass();
    }

    @Override
    public String getStundentName() {
        return student.getStundentName();
    }

    @Override
    public void setStundentName(String stundentName) {
        student.setStundentName(stundentName);
    }
        
    @Override
    public String Pass() {
        return student.Pass();
    }

    @Override
    public String Fail() {
        return student.Fail();
    }
    
    @Override
    public List<Student> getStudents() {
        return classRoom.getStudents();
    }
    @Override
    public void setStudents(List<Student> students) {
        classRoom.setStudents(students);
    }

    @Override
    public int getMaxStudents() {
        return classRoom.getMaxStudents();
    }

    @Override
    public void setMaxStudents(int maxStudents) {
classRoom.setMaxStudents(maxStudents);    }

    @Override
    public String getClassName() {
return classRoom.getClassName();    }

    @Override
    public void setClassName(String className) {
        classRoom.setClassName(className);
    }
}




