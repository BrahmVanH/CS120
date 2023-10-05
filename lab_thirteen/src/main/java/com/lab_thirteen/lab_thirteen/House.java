package com.lab_thirteen.lab_thirteen;

import javafx.application.*;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class House extends Application {
    public static void main(String[] args) {
        launch(args); //launches the JavaFX application
    }



    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600); //Window size is 800 by 600
        stage.setTitle("House application"); //Window title is "House application"
        stage.setScene(scene);
        Rectangle sky = new Rectangle(0, 0, 800, 300);
        Line houseLeftLine = new Line(200, 350, 200, 550);
        Line houseRightLine = new Line(500, 350, 500, 550);
        Color blue = new Color(.7, .7, 1, 1);
        Color tan = new Color(.81, .68, .34, 1);
        Color brown = new Color(.30, .21, .14, 1);
        sky.setFill(blue);
        houseLeftLine.setStroke(tan);
        houseRightLine.setStroke(tan);

        root.getChildren().add(sky);
        root.getChildren().add(houseLeftLine);
        root.getChildren().add(houseRightLine);

        stage.show(); //Shows the window
    }
}