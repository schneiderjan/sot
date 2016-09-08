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
@WebService(endpointInterface="tomcatservice.Student")
public class FontysStudent implements Student{
    public String Name;
        
//    public FontysStudent(String nameString){
//        Name = nameString;
//    }
    public FontysStudent(){}

    @Override
    public String Pass() {
        return Name+" passed all courses. Hooray!";
    }

    @Override
    public String Fail() {
        return Name+" failed all courses. Hooray!";
    }
    
    
    
}
