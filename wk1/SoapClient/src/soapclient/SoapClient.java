/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapclient;
import java.net.MalformedURLException;
import java.net.URL;
import soapservice.Calculator;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;     

/**
 *
 * @author jan
 */
public class SoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
   URL url = new URL("http://localhost:4321/WS/SoapCalculator?wsdl");  
   QName qname = new QName("http://soapservice/", "SoapCalculatorService");
   Service service = Service.create(url, qname);
   Calculator calculator = service.getPort(Calculator.class);
   int result = calculator.Add(2,45);
   System.out.println(result);
    }
    
}
