package org.final_project.components;

import java.io.File;
import java.net.*;
import javafx.scene.image.*;
import javafx.animation.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.scene.paint.*;

public class RandomItem extends Group {
  private Image dogTreatImg;
  private double biscuitWidth = 10;
  private double biscuitHeight = 10;
  private String[] itemsArr = { "dogTreat" };

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

  public RandomItem() {
    int rand = (int) Math.floor((Math.random() * itemsArr.length));
    String randomItemString = itemsArr[rand];
    ImageView randomItemImg = getItemImgView(randomItemString);
    randomItemImg.setFitWidth(biscuitWidth);
    randomItemImg.setFitHeight(biscuitHeight);

    randomItemImg.setTranslateX(380);
    randomItemImg.setTranslateY(250);
    this.getChildren().add(randomItemImg);

  }

  public void animateItem(double roadWidth2) {
    TranslateTransition markerTranslationTy = new TranslateTransition(Duration.millis(3000), this);
    TranslateTransition mTranslateTx = new TranslateTransition(Duration.millis(3000), this);
    ScaleTransition markerScaleT = new ScaleTransition(Duration.millis(3000), this);
    markerTranslationTy.setByY(650);
    markerTranslationTy.setCycleCount(Transition.INDEFINITE);

    markerScaleT.setInterpolator(Interpolator.EASE_BOTH);

    mTranslateTx.setByX(-(roadWidth2 / 2));
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
}
