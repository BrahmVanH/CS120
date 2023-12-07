package org.final_project;

import org.final_project.components.Menu;
import org.final_project.components.Game;

import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.scene.input.*;

/**
 * JavaFX App
 */
public class App extends Application {
    Boolean appIsRunning = true;
    Boolean displayMenu = true;
    Boolean playing = false;
    Group root = new Group();
    Menu startMenu = new Menu();

    // Couldn't quite nail down a more direct event handler in Menu to trigger a
    // view change
    EventHandler<MouseEvent> viewChangeHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent e) {
            if (!startMenu.isVisible()) {
                Game game = new Game();
                root.getChildren().add(game);
                startMenu.setVisible(false);

            }
        }
    };

    @Override
    public void start(Stage stage) {

        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("DogRun Game");
        stage.setScene(scene);

        startMenu.addEventFilter(MouseEvent.MOUSE_CLICKED, viewChangeHandler);

        root.getChildren().add(startMenu);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}