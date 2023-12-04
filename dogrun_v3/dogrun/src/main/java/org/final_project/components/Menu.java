package org.final_project.components;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.util.Duration;
import javafx.animation.*;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Menu extends Group {

  private Color silverChalice = Color.rgb(172, 178, 165);
  // private EventHandler<MouseEvent> newHandler;

  EventHandler<ActionEvent> playBtnHandler = new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent e) {
      setVisible(false);
    }
  };

  public Menu() {

    Rectangle background = new Rectangle(0, 0, 800, 600);
    Button playBtn = new Button("PLAY");

    Font font = Font.font("Courier New", FontWeight.BOLD, 24);

    playBtn.setStyle("-fx-background-color: rgb(162, 115, 42); background-color: rgb(162, 115, 42);");
    playBtn.setMinHeight(30);
    playBtn.setMinWidth(75);
    playBtn.setTranslateY(435);
    playBtn.setTranslateX(495.833);
    playBtn.setFont(font);

    playBtn.setOnAction(playBtnHandler);
    // background.addEventFilter(MouseEvent.MOUSE_CLICKED, newHandler);

    background.setFill(silverChalice);

    final KeyValue kvX = new KeyValue(playBtn.scaleXProperty(), 1.1);
    final KeyValue kvY = new KeyValue(playBtn.scaleYProperty(), 1.1);

    final Timeline timeline = new Timeline(
        new KeyFrame(Duration.millis(1000), kvX, kvY));
    timeline.setCycleCount(Timeline.INDEFINITE);
    timeline.setAutoReverse(true);
    timeline.play();

    this.getChildren().addAll(background, playBtn);
  }

  // public void setHandler(EventHandler<MouseEvent> handler) {
  //   this.newHandler = handler;
  // }

}
