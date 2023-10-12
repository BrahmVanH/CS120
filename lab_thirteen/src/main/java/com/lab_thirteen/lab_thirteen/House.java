package com.lab_thirteen.lab_thirteen;

import javafx.application.*;

// Name: Brahm Van Houzen
// Resources: Na

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class House extends Application {
    public static void main(String[] args) {
        launch(args); //launches the JavaFX application
    }



    public double[] createFencePointsArr(double x) {
        double y = 495;
        double x1 = x;
        double y1 = y;
        double x2 = x + 5;
        double y2 = y + 5;
        double x3 = x + 5;
        double y3 = y + 45;
        double x4 = x - 5;
        double y4 = y + 45;
        double x5 = x - 5;
        double y5 = y + 5;
        double x6 = x;
        double y6 = y;
        double[] pointsArr = {x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6};
        String pointsArrString = Arrays.toString(pointsArr);
        ConsoleIO.printLine(pointsArrString);
        return pointsArr;
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

        // Instantiate colors
        Color blue = new Color(.7, .7, 1, 1);
        Color tan = new Color(.81, .68, .34, 1);
        Color brown = new Color(.30, .21, .14, 1);
        Color white = Color.WHITE;
        Color forestGreen = Color.FORESTGREEN;

        // Set component colors
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




        // Add components to root
        root.getChildren().add(sky);
        root.getChildren().add(grass);
        root.getChildren().add(houseFrame);
        root.getChildren().add(houseRoof);
        root.getChildren().add(windowLeft);
        root.getChildren().add(windowLeftFrameVert);
        root.getChildren().add(windowRight);
        root.getChildren().add(windowRightFrameVert);

        for (int i = 250; i < 550; i += 10) {
            double[] points = createFencePointsArr(i);
            String pointsString = Arrays.toString(points);
            Polygon fenceSlat = new Polygon(points);

            fenceSlat.setFill(white);
            root.getChildren().add(fenceSlat);
        }

        // Render app
        stage.show(); //Shows the window
    }
}