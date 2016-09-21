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
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import org.json.*;
import restservice.Car;
import restservice.Rental;

/**
 *
 * @author jan
 */
public class RestClient extends Application {
   String baseUrl = "http://localhost:8080/RestService/rest/rental/";
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
        btnGetRentals = new Button("Show all rentals.");
        
        btnGetRentals.setOnAction( (ActionEvent e) ->{
            HttpUrl.Builder urlBuilder = HttpUrl.parse(baseUrl).newBuilder();
            urlBuilder.addPathSegment("rentals");
            String url = urlBuilder.build().toString();
            Request request = new Request.Builder()
            .url(url)
            .build();
            try {
            final Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                System.out.println("SUCCESS");
                JSONArray json = new JSONArray(response.body().string());
                System.out.println(json.toString());
//                Gist gist = gson.fromJson(response.body().charStream(), Gist.class);

            } else {
                System.out.println("FAIL");

            }
            }
            catch(IOException | JSONException easd){
                System.out.println(easd.getMessage());
            } 
        
        } );
        
        btnAddRental.setOnAction( (ActionEvent e) ->{
//        final RequestBody body  = new FormBody.Builder()
//                .add("name", "test")
//                .add("price", "5")
//                .
//                .build();
        HttpUrl.Builder urlBuilder = HttpUrl.parse(baseUrl).newBuilder();
        
        urlBuilder.addPathSegment("add");
        urlBuilder.addQueryParameter("name","test");
        urlBuilder.addQueryParameter("price","5");
        String url = urlBuilder.build().toString();
        Request request = new Request.Builder()
            .url(url)
//            .post(body)
//            .url(baseUrl+"add")
//            .post(body)
            .build();
        
         try {
            final Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                System.out.println("SUCCESS");
                System.out.println(response.body().string());

//                Gist gist = gson.fromJson(response.body().charStream(), Gist.class);

            } else {
                System.out.println("FAIL");

            }
            
         }
              catch (Exception exception){
                System.out.println("EXCEIOTOM");
             }
        
        } );
//        btnRemoveRental.setOnAction( (ActionEvent e) ->{} );
//        btnGetPrice.setOnAction( (ActionEvent e) ->{} );
//        btnUpdatePrice.setOnAction( (ActionEvent e) ->{} );


        left.getChildren().add(btnAddRental);
        left.getChildren().add(btnGetRentals);
        center.getChildren().add(listView);
        bp.setCenter(center);
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
