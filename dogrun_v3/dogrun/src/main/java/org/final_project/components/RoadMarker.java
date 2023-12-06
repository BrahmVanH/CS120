package org.final_project.components;

import javafx.animation.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.scene.paint.*;

/**
 * JavaFX Group
 */
public class RoadMarker extends Group {

  private double width1 = 5;
  private double width2 = 9.5;
  private double height = 10;

  private double x1 = 400 - (width1 / 2);
  private double y1 = 250;
  private double x2 = 400 + (width1 / 2);
  private double y2 = y1;
  private double x3 = 400 + (width2 / 2);
  private double y3 = y2 + height;
  private double x4 = 400 - (width2 / 2);
  private double y4 = y1 + height;
  private double x5 = x1;
  private double y5 = y1;

  private double[] roadMarkerPoints = { x1, y1, x2, y2, x3, y3, x4, y4, x5, y5 };

  public RoadMarker() {
    Color white = Color.WHITE;
    Color black = Color.BLACK;

    Polygon marker = new Polygon(roadMarkerPoints);

    marker.setFill(white);

    this.getChildren().add(marker);

  }

  /**
   * Instance method that creates a translation and scale translation for the
   * roadMarker object and play's them
   * 
   */
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