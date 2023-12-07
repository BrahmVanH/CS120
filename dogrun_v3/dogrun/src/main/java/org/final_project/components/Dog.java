package org.final_project.components;

import java.net.*;
import javafx.scene.image.*;
import javafx.animation.*;
import javafx.scene.*;
import javafx.util.Duration;

public class Dog extends Group {
  private Image leftTrotDog;
  private Image rightTrotDog;
  private boolean isLeftTrotVisible = true;
  private double biscuitWidth = 50;
  private double biscuitHeight = 70;
  private String[] itemsArr = { "dogTreat" };
  private ImageView[] imageArray = new ImageView[2];

  private void getDogImgViews() {
    String leftTrotPath = "/image/odin_left_foot_back.png";
    String rightTrotPath = "/image/odin_right_foot_back.png";

    URL leftTrotUrl = getClass().getResource(leftTrotPath);
    URL rightTrotUrl = getClass().getResource(rightTrotPath);

    if (leftTrotUrl != null || rightTrotUrl != null) {
      Image leftTrotImg = new Image(leftTrotUrl.toExternalForm());
      Image rightTrotImg = new Image(rightTrotUrl.toExternalForm());

      imageArray[0] = new ImageView(leftTrotImg);
      imageArray[1] = new ImageView(rightTrotImg);

    } else {
      System.out.println("Image not found: " + leftTrotUrl);
    }
  }

  public Dog() {
    getDogImgViews();
    if (imageArray != null) {
      // create timeline with keyframe that toggles images back and forth
      Duration duration = Duration.seconds(0.20);
      KeyFrame keyFrame = new KeyFrame(duration, e -> toggleImages());
      Timeline timeline = new Timeline(keyFrame);
      timeline.setCycleCount(Timeline.INDEFINITE);
      timeline.play();

      // position both images
      for (ImageView view : imageArray) {
        view.setFitWidth(75);
        view.setFitHeight(120);
        view.setTranslateX(375);
        view.setTranslateY(480);
      }

      this.getChildren().add(imageArray[0]);
      this.getChildren().add(imageArray[1]);
    }

  }

  private void toggleImages() {
    if (isLeftTrotVisible) {
      imageArray[0].setVisible(false);
      imageArray[1].setVisible(true);
    } else {
      imageArray[0].setVisible(true);
      imageArray[1].setVisible(false);
    }
    isLeftTrotVisible = !isLeftTrotVisible;
  }
}
