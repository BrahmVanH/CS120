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
 * JavaFX Group
 */
public class Game extends Group {

  Color grey = Color.GRAY;
  Color blue = Color.BLUE;
  Color tan = Color.TAN;
  private final int[] delayDurations = { 0, 500, 1000, 1500, 2000, 2500, 3000 };

  // Create roadMarker array
  RoadMarker[] roadMarkers = new RoadMarker[6];

  /**
   * Assigns roadMarker instances to roadMarkers array members
   * 
   * @return void
   */
  public void createRoadMarkers() {

    for (int i = 0; i < roadMarkers.length; i++) {
      roadMarkers[i] = new RoadMarker();
    }

  }

  // Constructor function, creates scenery and
  public Game() {

    Rectangle sky = new Rectangle(0, 0, 800, 250);
    Rectangle ground = new Rectangle(0, 250, 800, 350);
    Polygon road = new Polygon(375, 250, 425, 250, 575, 600, 225, 600, 375, 250);

    createRoadMarkers();
    // try {

    // FileInputStream inputstream = new FileInputStream("/odin_temp_png.png");
    // Image image = new Image(inputstream);

    // ImageView dogView = new ImageView(image);
    // this.getChildren().add(dogView);
    // } catch (FileNotFoundException e) {
    // System.out.println(e);
    // }

    // Style
    sky.setFill(blue);
    ground.setFill(tan);
    road.setFill(grey);

    // Add scenery to Game object
    this.getChildren().add(sky);
    this.getChildren().add(ground);
    this.getChildren().add(road);

    // Create new timeline for roadMarker animations
    Timeline timeline = new Timeline();

    // Add all road markers to Game object
    for (RoadMarker marker : roadMarkers) {
      this.getChildren().add(marker);
    }

    // Create key frame for each roadMarker object with a delay corresponding to
    // delayDurations array members
    for (int i = 0; i < roadMarkers.length; i++) {
      int index = i;
      KeyFrame keyFrame = new KeyFrame(Duration.millis(delayDurations[i]), e -> roadMarkers[index].animateRoadMarker());
      timeline.getKeyFrames().add(keyFrame);
    }

    timeline.play();
  }

}
