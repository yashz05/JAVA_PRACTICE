package com.jafaapp.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400, 200);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        Button btn = new Button("Test");
        Text l = new Text();
        l.setText("HI");
        gridPane.add(btn,0,1);
        gridPane.add(l,0,3);
        Scene scene  = new Scene(gridPane,900,400);
        Stage stg = new Stage();
        stg.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}