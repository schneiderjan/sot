/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restclient;

import com.sun.deploy.util.SessionState;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.io.*;
//import org.json.JSONException;
//import org.json.JSONObject;

/**
 *
 * @author jan
 */
public class RestClient extends Application {
    BorderPane bp;
    VBox left, center, right;
    ListView<String> listView;
    Button btnGetRentals, btnAddRental, btnRemoveRental, btnGetPrice,btnUpdatePrice;
    OkHttpClient client;
    
    @Override
    public void start(Stage primaryStage) {
        client = new OkHttpClient();
        bp = new BorderPane();
        left = new VBox();
        center = new VBox();
        right = new VBox();
        listView = new ListView<>();

        btnAddRental = new Button("Add new rental.");
        
//        btnGetRentals.setOnAction( (ActionEvent e) ->{} );
        
        btnAddRental.setOnAction( (ActionEvent e) ->{
        final RequestBody body  = new FormBody.Builder()
                .add("name", "testname")
                .add("price", "5")
                .build();
        Request request = new Request.Builder()
            .url("http://localhost:8080/RestService/rest/add")
            .post(body)
            .build();
        
         try {
            final Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                System.out.println("SUCCESS");
//                JSONObject json = new JSONObject(response.body().string());
//                response.close();

//                Integer success = Integer.parseInt( json.getString("success"));
//                String message = json.getString("message");
            }}
              catch (Exception exception){
                System.out.println("EXCEIOTOM");
             }
        
        } );
//        btnRemoveRental.setOnAction( (ActionEvent e) ->{} );
//        btnGetPrice.setOnAction( (ActionEvent e) ->{} );
//        btnUpdatePrice.setOnAction( (ActionEvent e) ->{} );


        left.getChildren().add(btnAddRental);
        bp.setLeft(left);
        Scene scene = new Scene(bp,500,200);
        primaryStage.setTitle("Great Car Rental!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}
