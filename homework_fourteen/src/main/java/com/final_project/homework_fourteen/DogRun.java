package com.final_project.homework_fourteen;
// Name: Brahm Van Houzen
// Resources: Na

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.image.*;
import javafx.scene.text.*;
import javafx.util.Duration;



public class DogRun extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    Group root = new Group();

    Color grey = Color.GRAY;
    Color blue = Color.BLUE;
    Color tan = Color.TAN;

    Rectangle sky = new Rectangle(0, 0, 800, 250);
    Rectangle ground = new Rectangle(250, 0, 800, 350);
    Polygon road = new Polygon(300, 250, 500, 250, 550, 600, 450, 600, 300, 250);
    @Override 
    public void start(Stage stage) {
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("DogRun Game");
        stage.setScene(scene); 
        
        sky.setFill(blue);
        ground.setFill(tan);
        road.setFill(grey);


        root.getChildren().add(sky);
        root.getChildren().add(ground);
        root.getChildren().add(road);




    }
}