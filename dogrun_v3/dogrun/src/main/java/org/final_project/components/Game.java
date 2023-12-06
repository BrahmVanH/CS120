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
  private final int[] delayDurations = { 0, 1000, 2000, 3000, 4000, 5000, 6000 };

  RoadMarker roadMarker = new RoadMarker();

  public void approachMarker(long time) {
    roadMarker.markerApproach();
  }

  public RoadMarker[] createRoadmarkers() {
    RoadMarker[] roadMarkers = new RoadMarker[6];

    for (int i = 0; i < roadMarkers.length; i++) {
      roadMarkers[i] = new RoadMarker();
    }

    return roadMarkers;
  }

  public void animateRoadMarker(RoadMarker roadMarker) {
    TranslateTransition markerTransition = new TranslateTransition(Duration.millis(3000), roadMarker);
    markerTransition.setByY(600);
    markerTransition.setCycleCount(Transition.INDEFINITE);

    markerTransition.play();
  }

  public Game() {

    Rectangle sky = new Rectangle(0, 0, 800, 250);
    Rectangle ground = new Rectangle(0, 250, 800, 350);
    Polygon road = new Polygon(375, 250, 425, 250, 575, 600, 225, 600, 375, 250);

    RoadMarker[] roadMarkers = createRoadmarkers();
    // try {

    // FileInputStream inputstream = new FileInputStream("/odin_temp_png.png");
    // Image image = new Image(inputstream);

    // ImageView dogView = new ImageView(image);
    // this.getChildren().add(dogView);
    // } catch (FileNotFoundException e) {
    // System.out.println(e);
    // }

    sky.setFill(blue);
    ground.setFill(tan);
    road.setFill(grey);

    Timeline timeline = new Timeline();
    for (RoadMarker marker : roadMarkers) {
      this.getChildren().add(marker);
    }


    for (int i = 0; i < roadMarkers.length; i++) {
      int index = i;
      KeyFrame keyFrame = new KeyFrame(Duration.millis(delayDurations[i]), e -> animateRoadMarker(roadMarkers[index]));
      timeline.getKeyFrames().add(keyFrame);
    }

    timeline.play();
  }

}
