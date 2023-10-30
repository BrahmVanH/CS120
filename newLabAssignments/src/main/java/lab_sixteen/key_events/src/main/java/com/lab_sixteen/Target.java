package lab_sixteen.key_events.src.main.java.com.lab_sixteen;

// Name: Brahm Van Houzen
// Resources: Na

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.*;
import javafx.scene.input.*;

import java.util.Random;

public class Target extends Application {

    Random rand = new Random();

    public static void main(String[] args) {
        launch(args);
    }


    Circle circle1 = new Circle(50, 50, 50);
    Circle circle2 = new Circle(50, 50, 40);
    Circle circle3 = new Circle(50, 50, 30);
    Circle circle4 = new Circle(50, 50, 20);
    Circle circle5 = new Circle(50, 50, 10);
    Line line1 = new Line(0, 0, 50, 50);
    Line line2 = new Line(0, 0, 25, 0);
    Line line3 = new Line(0, 0, 0, 25);

    Group arrow = new Group(line1, line2, line3);
    Group targetCircles = new Group(circle1, circle2, circle3, circle4, circle5);



    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600);
        Image woodImage = new Image("file:./woods.jpg");
        stage.setTitle("Archery");
        stage.setScene(scene);

        Rectangle background = new Rectangle(800, 600);
        background.setFill(new ImagePattern(woodImage));



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
        line1.setStroke(red);
        line1.setStrokeWidth(2);
        line2.setStroke(red);
        line2.setStrokeWidth(2);
        line3.setStroke(red);
        line3.setStrokeWidth(2);




        root.getChildren().add(background);
        root.getChildren().add(targetCircles);
        root.getChildren().add(arrow);


        scene.setOnMousePressed(this::mouseEvents);

        stage.show();
    }

    public void moveArrow(MouseEvent event) {
        double x = event.getX();
        double y = event.getY();
        arrow.setTranslateX(x);
        arrow.setTranslateY(y);
    }

    public void moveTargetToRandomLocation() {
        int x = rand.nextInt(700);
        int y = rand.nextInt(500);
        targetCircles.setTranslateX(x);
        targetCircles.setTranslateY(y);
    }

    public void mouseEvents(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            moveArrow(event);
        } else if (event.getButton() == MouseButton.SECONDARY) {
            moveTargetToRandomLocation();
        }

    }

}
