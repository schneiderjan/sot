/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapclientwsimport;
import soapservice.Calculator;
import soapservice.SoapCalculatorService;
/**
 *
 * @author jan
 */
public class SoapClientWsimport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoapCalculatorService soapService = new SoapCalculatorService();
        Calculator soapCalculator = soapService.getSoapCalculatorPort();
    int result = soapCalculator.add(6, 7);
        System.out.println("6 + 7 = " + result);  
        
        result = soapCalculator.add(100, 5);
        System.out.println("100 + 5 = " + result);  
    }
}  