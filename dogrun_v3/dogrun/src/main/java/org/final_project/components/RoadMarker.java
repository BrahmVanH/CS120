package org.final_project.components;

import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class RoadMarker extends Group {
  double yVel;
  double scaleVelX;
  double scaleVelY;

  public RoadMarker() {
    Color white = Color.WHITE;

    Polygon marker = new Polygon(397.5, 250, 402.5, 250, 405, 260, 395, 260, 397.5, 250);
    
    marker.setFill(white);

    this.getChildren().add(marker);

  }

  public void markerApproach() {
    double yPos = this.getTranslateY();
    double xScale = this.getScaleX();
    double yScale = this.getScaleY();

    yVel = 1;
    scaleVelX = 0.5;
    scaleVelY = 0.5;

    yPos = yPos - yVel;
    xScale = xScale + scaleVelX;
    yScale = yScale + scaleVelY;

    this.setTranslateY(yPos);
    this.setScaleX(xScale);
    this.setScaleY(yScale);

  }

}