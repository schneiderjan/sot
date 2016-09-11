package tomcatservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import java.util.jar.Attributes;
import javax.jws.WebService;

/**
 *
 * @author jan
 */
@WebService//(endpointInterface="tomcatservice.Student")
public class Student{
    String stundentName;

    public String getStundentName() {
        return stundentName;
    }

    public void setStundentName(String stundentName) {
        this.stundentName = stundentName;
    }
        
    public Student(){}

    public String Pass() {
        return stundentName+" passed all courses. Hooray!";
    }

    public String Fail() {
        return stundentName+" failed all courses. Hooray!";
    }
    
    
    
}
