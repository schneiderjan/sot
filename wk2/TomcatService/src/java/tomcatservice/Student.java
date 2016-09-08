package tomcatservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author jan
 */
@WebService
public interface Student {
    @WebMethod
    public String Pass();
    @WebMethod 
    public String Fail();
}
