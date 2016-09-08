/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapservice;


import javax.xml.ws.Endpoint;
/**
 *
 * @author jan
 */
public class SoapService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:4321/WS/SoapCalculator", new SoapCalculator());
        System.out.println("Running service on http://localhost:4321/WS/SoapCalculator!");  
    }
    
}
