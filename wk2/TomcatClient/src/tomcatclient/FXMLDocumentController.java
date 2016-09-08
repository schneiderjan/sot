/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomcatclient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import tomcatservice.SmallClassRoomService;

/**
 *
 * @author jan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    private Button getStudents;
    private Button startClass;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        
        Button clickedButton =(Button) event.getSource();
        
        if ("getStudents".equals(clickedButton.getId()))
        {
            label.setText("fk netbeans");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
