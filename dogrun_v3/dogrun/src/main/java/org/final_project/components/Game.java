package org.final_project.components;

import javafx.scene.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

import javafx.animation.*;

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

  private int score = 0;

  private Color grey = Color.GRAY;
  private Color blue = Color.BLUE;
  private Color tan = Color.TAN;
  private final int[] delayDurations = { 0, 500, 1000, 1500, 2000, 2500, 3000 };
  private double[] roadPoints = { x1, y1, x2, y2, x3, y3, x4, y4, x5, y5 };
  private List<RandomItem> randomItems = new ArrayList<>();
  // Create roadMarker array
  private RoadMarker[] roadMarkers = new RoadMarker[6];
  private Dog dogCharacter = new Dog();
  ScoreBoard scoreBoard = new ScoreBoard();

  AnimationTimer gameLoop = new AnimationTimer() {
    @Override
    public void handle(long now) {
      // Check for collision
      for (RandomItem item : randomItems) {
        if (dogCharacter.getBoundsInParent().intersects(item.getBoundsInParent())) {
          // Collision detected, perform actions
          handleCollision(item);

        }
      }
    }
  };

  // Constructor function, creates scenery and
  public Game(Scene scene) {

    Rectangle sky = new Rectangle(0, 0, 800, 250);
    Rectangle ground = new Rectangle(0, 250, 800, 350);
    Polygon road = new Polygon(roadPoints);

    createRoadMarkers();

    RandomItem randomItem = new RandomItem();
    randomItem.animateItem(roadWidth2);
    randomItems.add(0, randomItem);

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
    this.getChildren().add(scoreBoard);

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

    scene.setOnKeyPressed(this::moveDogChar);

    timeline.play();
    gameLoop.start();
  }

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

  private void handleCollision(RandomItem item) {
    // if bad remove points
    // if good add points
    if (item.checkIsBadItem()) {
      int points = -5;
      scoreBoard.updateScoreboard(points);
    }
    this.getChildren().remove(item);
    score++;
  }

  // Add logic to prevent moving off screen
  private void moveDogChar(KeyEvent event) {
    if (event.getCode() == KeyCode.RIGHT) {
      double x = dogCharacter.getTranslateX();
      x = x + 10;
      dogCharacter.setTranslateX(x);
    } else if (event.getCode() == KeyCode.LEFT) {
      double x = dogCharacter.getTranslateX();
      x = x - 10;
      dogCharacter.setTranslateX(x);
    }
  }

}
