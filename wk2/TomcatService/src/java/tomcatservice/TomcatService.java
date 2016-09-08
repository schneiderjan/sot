package tomcatservice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import javax.xml.ws.Endpoint;
/**
 *
 * @author jan
 */
public class TomcatService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        String command = "C:\\Program Files\\Java\\apache-tomcat-8.5.4\\bin\\startup.bat";//
//        Process child = Runtime.getRuntime().exec(command);

        Endpoint.publish("http://localhost:4321/WS/TomcatService", new FontysStudent());
        
    }    
}
