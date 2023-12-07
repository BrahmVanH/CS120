package org.final_project.components;

import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.paint.*;

public class ScoreBoard extends Group {
  public static int score = 0;
  private static Text scoreText = new Text(score + "");

  public ScoreBoard() {
    scoreText.setStroke(Color.WHITE);
    scoreText.setFont(Font.font("Arial", 20));
    scoreText.setTranslateX(400);
    scoreText.setTranslateY(300);
    this.getChildren().add(scoreText);

  }

  public static void updateScoreboard(int points) {
    score = score + points;
    scoreText.setText(score+"");
    System.out.println("updating score"+score);
  }
}
