package org.final_project;

import org.final_project.components.RoadMarker;
import org.final_project.components.Menu;

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
import javafx.animation.*;


/**
 * JavaFX App
 */
public class App extends Application {
    Boolean appIsRunning = true;
    Boolean displayMenu = true;
    Boolean playing = false;
    Group root = new Group();
    
    @Override
    public void start(Stage stage) {
        
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("DogRun Game");
        stage.setScene(scene);
        Menu startMenu = new Menu();
        
        if(displayMenu && !startMenu.isVisible()) {
            startMenu.setVisible(true);
        }

        if (!displayMenu && startMenu.isVisible()) {
            startMenu.setVisible(false);
        }

        System.out.println(startMenu.getChildren());
        
        root.getChildren().add(startMenu);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}