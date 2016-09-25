/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restclient;

import com.owlike.genson.Genson;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.io.*;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

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

    Genson genson = new Genson();
    String baseUrl = "http://localhost:8080/RestService/rest/rental/";
    BorderPane bp;
    VBox left, center, right;
    ListView<String> listView;
    Button btnGetRentals, btnAddRental, btnRemoveRental, btnGetPrice, btnUpdatePrice;
    TextField txtName, txtPrice, txtNewPrice, txtIndex;
    OkHttpClient client;
    MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    @Override
    public void start(Stage primaryStage) {
        client = new OkHttpClient();
        bp = new BorderPane();
        left = new VBox();
        center = new VBox();
        right = new VBox();
        listView = new ListView<>();
        txtName = new TextField("Enter name.");
        txtPrice = new TextField("Enter price.");
        txtIndex = new TextField("Index to remove");
        txtNewPrice = new TextField("Enter new price.");

        btnAddRental = new Button("Add new rental.");
        btnGetRentals = new Button("Show all rentals.");
        btnRemoveRental = new Button("Remove rental.");
        btnUpdatePrice = new Button("Change price.");

        btnGetRentals.setOnAction((ActionEvent e) -> {
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
                    JSONArray jsonArray = new JSONArray(response.body().string());
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject c = null;
                        c = jsonArray.getJSONObject(i);
                        listView.getItems().add("Car: " + c.getString("name") + "; Price: " + c.getInt("price"));
                    }

                } else {
                    System.out.println("FAIL");
                }
            } catch (IOException | JSONException easd) {
                System.out.println(easd.getMessage());
            }

        });

        btnAddRental.setOnAction((ActionEvent e) -> {
            Car c = null;
            try {
                c = new Car(txtName.getText(), Integer.parseInt(txtPrice.getText()));
            } catch (NumberFormatException ek) {
                listView.getItems().add("Not correct format.");
            }
            if (c == null) {
                return;
            }

            RequestBody body = RequestBody.create(JSON, genson.serialize(c));
            Request request = new Request.Builder()
                    .url(baseUrl + "add")
                    .post(body)
                    .build();
            try {
                final Response response = client.newCall(request).execute();
                if (response.isSuccessful()) {
                    listView.getItems().add("Car added successfully.");
                } else {
                    System.out.println("FAIL");
                    System.out.println(response.message());
                }

            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        });

        btnRemoveRental.setOnAction((ActionEvent e) -> {
//            int index = -1;
//            try {
//                index = Integer.parseInt(txtIndex.getText());
//            } catch (NumberFormatException nein) {
//                listView.getItems().add("Not correct format.");
//            }
//            if (index == -1) {
//                return;
//            }

            int index = 0;
            JSONObject j = null;
            try {
                j = new JSONObject()
                        .put("index", index);
            } catch (JSONException ex) {
                Logger.getLogger(RestClient.class.getName()).log(Level.SEVERE, null, ex);
            }

            RequestBody body = new FormBody.Builder()
                    .add("index", String.valueOf(index))
                    .build();
            Request request = new Request.Builder()
                    .url(baseUrl + "remove")
                    .delete(body)
                    //                    .method("DELETE", body)
                    .build();

            try {
                final Response response = client.newCall(request).execute();
                if (response.isSuccessful()) {
                    System.out.println("SUCCESS");
                    System.out.println(response.body().string());

                } else {
                    System.out.println("FAIL");
                    System.out.println(response.body().string());
                }

            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }

        });
        btnUpdatePrice.setOnAction((ActionEvent e) -> {
            int index = 2;
            int price = 123;
            JSONObject j = null;
            try {
                j = new JSONObject()
                        .put("index", index)
                        .put("newPrice", price);
            } catch (JSONException ex) {
                Logger.getLogger(RestClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(j.toString());
            RequestBody body = RequestBody.create(JSON, j.toString());
            Request request = new Request.Builder()
                    .url(baseUrl + "price")
                    .put(body)
                    .build();
            try {
                final Response response = client.newCall(request).execute();
                if (response.isSuccessful()) {
                    System.out.println("SUCCESS");
                    System.out.println(response.body().string());
                } else {
                    System.out.println("FAIL");
                    System.out.println(response.body().string());
                }

            } catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        });

        left.getChildren().add(btnAddRental);
        left.getChildren().add(txtName);
        left.getChildren().add(txtPrice);
        left.getChildren().add(btnGetRentals);
        right.getChildren().add(btnRemoveRental);
        right.getChildren().add(txtIndex);
        right.getChildren().add(btnUpdatePrice);
        right.getChildren().add(txtNewPrice);
        center.getChildren().add(listView);
        bp.setCenter(center);
        bp.setLeft(left);
        bp.setRight(right);
        Scene scene = new Scene(bp, 500, 200);
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
