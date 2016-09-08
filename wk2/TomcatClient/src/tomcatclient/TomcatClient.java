/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomcatclient;

import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import tomcatservice.FontysStudent;

/**
 *
 * @author jan
 */
public class TomcatClient extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        launch(args);

        URL urlStudent = new URL("http://localhost:8080/TomcatService/student?wsdl");
        URL urlClass = new URL("http://localhost:8080/TomcatService/class?wsdl");

        QName qnameStudent = new QName("http://localhost:8080/TomcatService/student", "FontysStudentService");
        QName qnameClass = new QName("http://localhost:8080/TomcatService/class", "SmallClassRoomService");

        Service studentService = Service.create(urlStudent, qnameStudent);
        Service classService = Service.create(urlClass, qnameClass);

        FontysStudent student = studentService.getPort(FontysStudent.class);
        student.setName("jan");
        
               System.out.println(student.getName());
    }

}
