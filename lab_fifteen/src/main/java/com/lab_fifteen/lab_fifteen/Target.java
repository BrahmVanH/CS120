package com.lab_fifteen.lab_fifteen;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class Target extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);
        Image woodImage = new Image("file:./woods.jpg");
        stage.setTitle("Archery");
        stage.setScene(scene);

        Rectangle background = new Rectangle(800, 600);
        background.setFill(new ImagePattern(woodImage));

        Circle circle1 = new Circle(100, 100, 50);
        Circle circle2 = new Circle(100, 100, 40);
        Circle circle3 = new Circle(100, 100, 30);
        Circle circle4 = new Circle(100, 100, 20);
        Circle circle5 = new Circle(100, 100, 10);
        Color white = Color.WHITE;
        Color black = Color.BLACK;
        Color blue = Color.BLUE;
        Color red = Color.RED;
        Color yellow = Color.YELLOW;

        circle1.setFill(white); //Fill white
        circle1.setStroke(black); //Outline black
        circle2.setFill(black);
        circle3.setFill(blue);
        circle4.setFill(red);
        circle5.setFill(yellow);

        Group targetCircles = new Group(circle1, circle2, circle3, circle4, circle5);
        targetCircles.setTranslateX(300);
        targetCircles.setTranslateY(200);
        root.getChildren().add(background);
        root.getChildren().add(targetCircles;

        stage.show();
    }

}