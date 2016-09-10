/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomcatclient;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tomcatservice.*;

/**
 *
 * @author jan
 */
public class TomcatClient extends Application {
    Button btnFail,btnAddStudent,btnSetStudentName, btnGetAllStudents,btnPass
            ,btnStartClass;
    ListView<String> listView;
    BorderPane bp;
    TextField txtField;
    VBox left = new VBox();
    VBox center = new VBox();
    VBox right = new VBox();


    @Override
    public void start(Stage primaryStage) throws Exception {
        CompositeServService servService = new CompositeServService();
        CompositeServ service = servService.getCompositeServPort();
        service.setStundentName("Jan");
        service.setMaxStudents(5);

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
            listView.getItems().add( service.fail());
            }
        );
        btnPass.setOnAction( (ActionEvent e) -> {
                    listView.getItems().add(service.pass());
                }
        );
        btnAddStudent.setOnAction( (ActionEvent e) -> {
           if( service.addStudent(service.getStudent())){
               listView.getItems().add("You went to class.");
           }else listView.getItems().add("Class full. Better stay home.");
            }
        );
        btnSetStudentName.setOnAction( (ActionEvent e) -> {
            service.setStundentName(txtField.getText());
            }
        );
        btnGetAllStudents.setOnAction( (ActionEvent e) -> {
            for (Student stud : service.getStudents()){
                listView.getItems().add(stud.getStundentName());
            }}
        );
        btnStartClass.setOnAction( (ActionEvent e) -> {
               listView.getItems().add( service.startClass());
        }
        );

        primaryStage.show();

    }
    
}
