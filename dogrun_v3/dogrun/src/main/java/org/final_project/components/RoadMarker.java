package org.final_project.components;

import javafx.animation.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.scene.paint.*;

public class RoadMarker extends Group {
  double yVel;
  double scaleVelX;
  double scaleVelY;

  public RoadMarker() {
    Color white = Color.WHITE;
    Color black = Color.BLACK;

    Polygon marker = new Polygon(
      397.5, 250,
     402.5, 250, 
     404, 260, 
     395.5, 260, 
     397.5, 250);

    marker.setFill(white);

    this.getChildren().add(marker);

  }

  // Need to add logic to accelerate roadmarker is in gets nearer to simulate real
  // world visuals
  public void animateRoadMarker() {
    TranslateTransition markerTranslationTx = new TranslateTransition(Duration.millis(3000), this);
    ScaleTransition markerScaleTx = new ScaleTransition(Duration.millis(3000), this);
    markerTranslationTx.setByY(650);
    markerTranslationTx.setCycleCount(Transition.INDEFINITE);
    markerScaleTx.setInterpolator(Interpolator.EASE_BOTH);
    markerScaleTx.setToX(7);
    markerScaleTx.setToY(10);
    markerTranslationTx.setInterpolator(Interpolator.EASE_BOTH);

    markerScaleTx.setCycleCount(Transition.INDEFINITE);

    markerTranslationTx.play();
    markerScaleTx.play();
  }

}