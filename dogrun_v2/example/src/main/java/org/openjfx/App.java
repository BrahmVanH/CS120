package org.openjfx;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.image.*;
import javafx.scene.text.*;
import javafx.util.Duration;

/**
 * JavaFX App
 */
public class App extends Application {
    Group root = new Group();

    Color grey = Color.GRAY;
    Color blue = Color.BLUE;
    Color tan = Color.TAN;

    Rectangle sky = new Rectangle(0, 0, 800, 250);
    Rectangle ground = new Rectangle(0, 250, 800, 350);
    Polygon road = new Polygon(375, 250, 425, 250, 575, 600, 225, 600, 375, 250);

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

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}