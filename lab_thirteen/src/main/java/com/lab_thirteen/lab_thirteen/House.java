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

    private static object createPicketFence(double startingPointX, double startingPointY) {
       object picketFenceDimensions = {
               x1= startingPointX,
                y1= startingPointY
        }
    }



    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600); //Window size is 800 by 600
        stage.setTitle("House application"); //Window title is "House application"
        stage.setScene(scene);

        // Background
        Rectangle sky = new Rectangle(0, 0, 800, 300);
        Rectangle grass = new Rectangle(0, 300, 800, 300 );

        // House structure
        Rectangle houseFrame = new Rectangle(300, 350, 200, 125);
        Polygon houseRoof = new Polygon(250, 350, 550, 350, 400, 250, 250, 350);
        // Windows
        Rectangle windowLeft = new Rectangle(340, 385, 25, 45);
        Line windowLeftFrameVert = new Line(352.5, 385, 352.5, 430);
        Rectangle windowRight = new Rectangle(435, 385, 25, 45);
        Line windowRightFrameVert = new Line(447.5, 385, 447.5, 430);

        // Fence
        double fenceSlatX = 250;
        double fenceSlatY = 495;
        Polygon fenceSlat = new Polygon(fenceSlatX, fenceSlatY, fenceSlatX + 5, fenceSlatY + 5, fenceSlatX +5, fenceSlatY + 45, fenceSlatX -5, fenceSlatY + 45, fenceSlatX - 5, fenceSlatY + 5, fenceSlatX, fenceSlatY);



        // Door
        // Picket fence (loop)

        Color blue = new Color(.7, .7, 1, 1);
        Color tan = new Color(.81, .68, .34, 1);
        Color brown = new Color(.30, .21, .14, 1);
        Color white = Color.WHITE;
        Color forestGreen = Color.FORESTGREEN;

        sky.setFill(blue);
        grass.setFill(forestGreen);

        houseFrame.setFill(tan);
        houseRoof.setFill(brown);
        windowLeft.setFill(white);
        windowLeft.setStroke(brown);
        windowLeftFrameVert.setStroke(brown);
        windowRight.setFill(white);
        windowRight.setStroke(brown);
        windowRightFrameVert.setStroke(brown);
        fenceSlat.setFill(white);



        root.getChildren().add(sky);
        root.getChildren().add(grass);
        root.getChildren().add(houseFrame);
        root.getChildren().add(houseRoof);
        root.getChildren().add(windowLeft);
        root.getChildren().add(windowLeftFrameVert);
        root.getChildren().add(windowRight);
        root.getChildren().add(windowRightFrameVert);
        root.getChildren().add(fenceSlat);


        stage.show(); //Shows the window
    }
}