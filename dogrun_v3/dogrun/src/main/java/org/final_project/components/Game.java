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

  private double roadWidth1 = 50;
  private double roadWidth2 = 350;
  private double roadHeight = 350;

  private double x1 = 400 - (roadWidth1 / 2);
  private double y1 = 250;
  private double x2 = 400 + (roadWidth1 / 2);
  private double y2 = y1;
  private double x3 = 400 + (roadWidth2 / 2);
  private double y3 = y2 + roadHeight;
  private double x4 = 400 - (roadWidth2 / 2);
  private double y4 = y1 + roadHeight;
  private double x5 = x1;
  private double y5 = y1;

  private Color grey = Color.GRAY;
  private Color blue = Color.BLUE;
  private Color tan = Color.TAN;
  private final int[] delayDurations = { 0, 500, 1000, 1500, 2000, 2500, 3000 };
  private double[] roadPoints = { x1, y1, x2, y2, x3, y3, x4, y4, x5, y5 };

  // Create roadMarker array
  private RoadMarker[] roadMarkers = new RoadMarker[6];

  /**
   * Assigns roadMarker instances to roadMarkers array members
   * 
   * @return void
   */
  private void createRoadMarkers() {

    for (int i = 0; i < roadMarkers.length; i++) {
      roadMarkers[i] = new RoadMarker();
    }

  }

  // Constructor function, creates scenery and
  public Game() {

    Rectangle sky = new Rectangle(0, 0, 800, 250);
    Rectangle ground = new Rectangle(0, 250, 800, 350);
    Polygon road = new Polygon(roadPoints);
    Dog dogCharacter = new Dog();

    createRoadMarkers();

    RandomItem randomItem = new RandomItem();
    randomItem.animateItem(roadWidth2);

    // Style
    sky.setFill(blue);
    ground.setFill(tan);
    road.setFill(grey);

    // Add scenery to Game object
    this.getChildren().add(sky);
    this.getChildren().add(ground);
    this.getChildren().add(road);
    this.getChildren().add(randomItem);
    this.getChildren().add(dogCharacter);

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
