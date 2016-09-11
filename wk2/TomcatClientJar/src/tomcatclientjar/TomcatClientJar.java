/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomcatclientjar;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import tomcatservice.*;
import tomcatservice.ICompositeServ;


/**
 *
 * @author jan
 */
public class TomcatClientJar extends Application {
    Button btnFail,btnAddStudent,btnSetStudentName, btnGetAllStudents,btnPass
            ,btnStartClass;
    ListView<String> listView;
    BorderPane bp;
    TextField txtField;
    VBox left = new VBox();
    VBox center = new VBox();
    VBox right = new VBox();
    
    @Override
    public void start(Stage primaryStage) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/TomcatService/comp?wsdl");
        QName qname = new QName("http://tomcatservice/","CompositeServService");
        Service service = Service.create(url,qname);

        ICompositeServ proxy = service.getPort(ICompositeServ.class);

        proxy.setStundentName("JarClient");
        proxy.setMaxStudents(15);

        bp = new BorderPane();
        left = new VBox();
        center = new VBox();
        right = new VBox();
        listView = new ListView<>();
        txtField = new TextField("Enter student or class name.");
        btnFail= new Button("Fail Student");
        btnPass= new Button("Pass Student");
        btnAddStudent= new Button("Go to class");
        btnSetStudentName= new Button("Set StudentName");
        btnGetAllStudents = new Button("All students");
        btnStartClass = new Button("Start class");

        center.getChildren().add(txtField);
        center.getChildren().add(listView);
        left.getChildren().add(btnPass);
        left.getChildren().add(btnFail);
        left.getChildren().add(btnSetStudentName);
        right.getChildren().add(btnGetAllStudents);
        right.getChildren().add(btnStartClass);
        right.getChildren().add(btnAddStudent);

        bp.setLeft(left);
        bp.setRight(right);
        bp.setCenter(center);
        Scene scene = new Scene(bp,500,250);
        primaryStage.setScene(scene);


        btnFail.setOnAction( (ActionEvent e) -> {
            listView.getItems().add( proxy.Fail());
            }
        );
        btnPass.setOnAction( (ActionEvent e) -> {
                    listView.getItems().add(proxy.Pass());
                }
        );
        btnAddStudent.setOnAction( (ActionEvent e) -> {
           if( proxy.AddStudent(proxy.getStudent())){
               listView.getItems().add("You went to class.");
           }else listView.getItems().add("Class full. Better stay home.");
            }
        );
        btnSetStudentName.setOnAction( (ActionEvent e) -> {
            proxy.setStundentName(txtField.getText());
            }
        );
        btnGetAllStudents.setOnAction( (ActionEvent e) -> {
            for (Student stud : proxy.getStudents()){
                listView.getItems().add(stud.getStundentName());
            }}
        );
        btnStartClass.setOnAction( (ActionEvent e) -> {
               listView.getItems().add( proxy.StartClass());
        }
        );
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
