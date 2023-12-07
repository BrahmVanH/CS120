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
 * JavaFX Game Group Class
 */
public class Game extends Group {

  private double viewPortWidth = 800;

  // Road shape dimensions
  private double roadWidth1 = 50;
  private double roadWidth2 = 350;
  private double roadHeight = 350;

  // Road shape points
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

  // Road Shape width ratios to proportionately animate RandomItems
  private double roadXatio = (roadWidth2 / 2) / (roadWidth1 / 2);

  // Colors for view
  private Color grey = Color.GRAY;
  private Color blue = Color.BLUE;
  private Color tan = Color.TAN;

  // Delay durations for RoadMarker animations
  private final int[] delayDurations = { 0, 500, 1000, 1500, 2000, 2500, 3000 };

  // Assign Road Shape points to array for later use
  private double[] roadPoints = { x1, y1, x2, y2, x3, y3, x4, y4, x5, y5 };

  // Array list for dynamically creating a TBD amount of randomItems
  private List<RandomItem> randomItems = new ArrayList<>();

  // Create RoadMarker array
  private RoadMarker[] roadMarkers = new RoadMarker[6];

  // Create player character instance
  private Dog dogCharacter = new Dog();

  // Create ScoreBoard instance
  ScoreBoard scoreBoard = new ScoreBoard();

  // Create gameLoop for detecting object collision
  AnimationTimer gameLoop = new AnimationTimer() {
    @Override
    public void handle(long now) {
      // Check for collision between player character and item on road
      for (RandomItem item : randomItems) {
        if (dogCharacter.getBoundsInParent().intersects(item.getBoundsInParent())) {
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

    // Populate roadMarkers array
    createRoadMarkers();

    // Populate randomItems ArrayList
    createRandomItems();

    
    // Style
    sky.setFill(blue);
    ground.setFill(tan);
    road.setFill(grey);

    // Add scenery to Game object
    this.getChildren().add(sky);
    this.getChildren().add(ground);
    this.getChildren().add(road);
    this.getChildren().add(dogCharacter);
    this.getChildren().add(scoreBoard);
    // Iterate through ArrayList of RandomItems and append to view
    for (int i = 0; i < randomItems.toArray().length; i++) {
      RandomItem item = randomItems.get(i);
      this.getChildren().add(item);
      item.animateItem(roadXatio);
    }
    
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

  /**
   * Assigns random amount of RandomItems between 15 and 20
   * 
   * @return void
   */

  private void createRandomItems() {
    int randomAmount = getRandomIntInRange(20, 15);
    for (int i = 0; i < randomAmount; i++) {
      randomItems.add(i, new RandomItem(roadWidth1, viewPortWidth));
    }
  }

  /**
   * Creates a random number between two provided values
   * 
   * @param x1
   * @param x2
   * @return randomAmount
   */
  private int getRandomIntInRange(int x1, int x2) {
    int rand15 = (int) Math.floor(Math.random() * x1);
    int rand20 = (int) Math.floor(Math.random() * x2);
    return Math.abs(rand20 - rand15);
  }

  /**
   * Handles the collision between the player character and RandomItems on view
   * 
   * @param item
   * @return void
   */
  private void handleCollision(RandomItem item) {
    // if bad remove points
    // if good add points
    if (item.checkIsBadItem()) {
      int points = -5;
      scoreBoard.updateScoreboard(points);
    }
    this.getChildren().remove(item);
  }

  /**
   * Takes in a keypress event and moves player character accordingly
   * 
   * @param KeyEvent
   * @return void
   */
  private void moveDogChar(KeyEvent event) {
    if (event.getCode() == KeyCode.RIGHT) {
      double x = dogCharacter.getTranslateX();
      if (x < 400 + (roadWidth2 / 2)) {
        x = x + 10;
        dogCharacter.setTranslateX(x);
      }
    } else if (event.getCode() == KeyCode.LEFT) {
      double x = dogCharacter.getTranslateX();
      if (x > 400 - (roadWidth2 / 2)) {
        x = x - 10;
        dogCharacter.setTranslateX(x);
      }
    }
  }

}
