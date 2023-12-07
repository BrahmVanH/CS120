package org.final_project.components;

import java.net.*;
import javafx.scene.image.*;
import javafx.animation.*;
import javafx.scene.*;
import javafx.util.Duration;

public class RandomItem extends Group {
  private Image dogTreatImg;
  private double biscuitWidth = 10;
  private double biscuitHeight = 10;
  private String[] itemsArr = { "dogTreat" };
  private boolean badItem;
  private double startingX = 400.0;

  private ImageView getItemImgView(String itemString) {
    String imagePath = "/image/dogBiscuit.png";
    URL imageUrl = getClass().getResource(imagePath);

    if (imageUrl != null) {
      Image image = new Image(imageUrl.toExternalForm());
      System.out.println(image);
      System.out.println(imagePath);
      System.out.println(imageUrl);

      return new ImageView(image);
    } else {
      System.out.println("Image not found: " + imagePath);
      return null;
    }
  }

  public RandomItem(double roadWidth1) {
    double startingXRange = getStartingXRange(roadWidth1);
    int randBadItemInt = (int) Math.floor(Math.random() * 2);
    int randItemInt = (int) Math.floor((Math.random() * itemsArr.length));
    startingX = (int) Math.floor((Math.random() * startingXRange));
    String randomItemString = itemsArr[randItemInt];
    ImageView randomItemImg = getItemImgView(randomItemString);
    randomItemImg.setFitWidth(biscuitWidth);
    randomItemImg.setFitHeight(biscuitHeight);
    if (randBadItemInt == 1) {
      this.badItem = true;
    } else {
      this.badItem = false;
    }

    randomItemImg.setTranslateX(startingX);
    randomItemImg.setTranslateY(250);
    this.getChildren().add(randomItemImg);

  }

  public void animateItem(double roadYXRatio) {
    double finalX = getFinalX(startingX, roadYXRatio);
    TranslateTransition markerTranslationTy = new TranslateTransition(Duration.millis(3000), this);
    TranslateTransition mTranslateTx = new TranslateTransition(Duration.millis(3000), this);
    ScaleTransition markerScaleT = new ScaleTransition(Duration.millis(3000), this);
    markerTranslationTy.setByY(650);
    markerTranslationTy.setCycleCount(Transition.INDEFINITE);

    markerScaleT.setInterpolator(Interpolator.EASE_BOTH);

    mTranslateTx.setByX(finalX);
    markerScaleT.setToX(7);
    markerScaleT.setToY(10);
    markerTranslationTy.setInterpolator(Interpolator.EASE_BOTH);
    mTranslateTx.setInterpolator(Interpolator.EASE_BOTH);
    mTranslateTx.setCycleCount(Transition.INDEFINITE);
    markerScaleT.setCycleCount(Transition.INDEFINITE);

    markerTranslationTy.play();
    markerScaleT.play();
    mTranslateTx.play();
  }

  public Boolean checkIsBadItem() {
    if (this.badItem) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Takes in roadWidth ratio and returns the proportionate final x position for
   * the random item
   * 
   * @params roadWidth ratio
   * @params starting x value for random item
   * @return final x value for RandomItem animation
   */

  private double getFinalX(double startingX, double roadXRatio) {
    if (startingX < 400) {
      return 400 - (roadXRatio * startingX);
    } else if (startingX > 400) {
      return 400 + (roadXRatio * startingX);
    } else {
      return 400;
    }
  }

  /**
   * Takes in the roadwidth1 and returns the starting X value for RandomItem
   * 
   * @params roadWidth1
   * @return starting x range for RandomItem
   */

  private double getStartingXRange(double roadWidth1) {
    double viewPortWidth = 800;
    double roadRangeX1 = (viewPortWidth / 2) - (roadWidth1 / 2);
    double roadRangeX2 = (viewPortWidth / 2) + (roadWidth1 / 2);
    return roadRangeX2 - roadRangeX1;
  }
}
