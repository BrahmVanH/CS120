package org.final_project.components;

import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.event.*;
import javafx.scene.control.Button;

public class Menu extends Group {

  private EventHandler<ActionEvent> playBtnHandler;
  private Color hotToddy = Color.rgb(162, 115, 42);
  private Color white = Color.WHITE;
  private Color silverChalice = Color.rgb(172, 178, 165);


  public Menu() {

    Rectangle background = new Rectangle(0, 0, 800, 600);
    Button playBtn = new Button("PLAY");
    playBtn.setBackground(null);
    playBtn.setTranslateY(435);
    playBtn.setTranslateX(495.833);
    playBtn.setOnAction(playBtnHandler);

    background.setFill(silverChalice);

    this.getChildren().addAll(background, playBtn);
  }

  public void setPlayButtonHandler(EventHandler<ActionEvent> handler) {
    this.playBtnHandler = handler;
  }

}
