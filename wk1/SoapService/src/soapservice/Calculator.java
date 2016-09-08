/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author jan
 */
@WebService
public interface Calculator {
    @WebMethod
    public int Add(int nr1, int nr2);
    
    @WebMethod
    public int Substract(int nr1, int nr2);
}
