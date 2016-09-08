/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapservice;

import javax.jws.WebService;

/**
 *
 * @author jan
 */
@WebService(endpointInterface="soapservice.Calculator")
public class SoapCalculator implements Calculator {

    @Override
    public int Add(int nr1, int nr2) {
        return nr1+nr2;
    }

    @Override
    public int Substract(int nr1, int nr2) {
        return nr1-nr2;
    }
    
}
