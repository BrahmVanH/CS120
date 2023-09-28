package lab_thirteen;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

public class House extends Application {
	public static void main(String[] args) {
    launch(args); //launches the JavaFX application
	}

	@Override
 	public void start(Stage stage) {
		Group root = new Group();
		Scene scene = new Scene(root, 800, 600); //Window size is 800 by 600
		stage.setTitle("House application"); //Window title is "House application"
		stage.setScene(s);
    stage.show(); //Shows the window
	}
}
