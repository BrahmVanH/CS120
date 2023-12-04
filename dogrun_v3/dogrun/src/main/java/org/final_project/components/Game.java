package org.final_project.components;

import org.final_project.components.RoadMarker;
import org.final_project.lib.Animator;

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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * JavaFX App
 */
public class Game extends Group {

  Color grey = Color.GRAY;
  Color blue = Color.BLUE;
  Color tan = Color.TAN;

  RoadMarker roadMarker = new RoadMarker();

  public void approachMarker(long time) {
    roadMarker.markerApproach();
  }

  public Game() {

    Rectangle sky = new Rectangle(0, 0, 800, 250);
    Rectangle ground = new Rectangle(0, 250, 800, 350);
    Polygon road = new Polygon(375, 250, 425, 250, 575, 600, 225, 600, 375, 250);

    try {

      FileInputStream inputstream = new FileInputStream("/odin_temp_png.png");
      Image image = new Image(inputstream);

      ImageView dogView = new ImageView(image);
      this.getChildren().add(dogView);
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }

    sky.setFill(blue);
    ground.setFill(tan);
    road.setFill(grey);

    this.getChildren().add(sky);
    this.getChildren().add(ground);
    this.getChildren().add(road);
    this.getChildren().add(roadMarker);

  }

}
