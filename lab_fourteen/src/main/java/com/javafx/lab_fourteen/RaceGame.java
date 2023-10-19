
//  DO NOT MAKE MODFICICATIONS TO THIS FILE (UNLESS YOU ARE DOING A BONUS FEATURE).
//  IF THIS DOESN'T COMPILE, THEN THE ERROR IS IN Car.java

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.event.*;
import javafx.animation.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.media.*;

public class RaceGame extends Application {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 550;
    private static final int BORDER_WIDTH = 15;
    private static final int STRIPE_LENGTH = 250;
    private static final int STRIPE_WIDTH = 10;
    private static final int STRIPE_SPACING = 3 * STRIPE_LENGTH;
    private static final int CAR_WIDTH = 148;
    private static final int CAR_LENGTH = 20+45+250+47 - 35; //-35 is an extra buffer - cars are not totally square. oh well.

    private boolean gameOver;  //whether or not the game is over (display a message if game is over)
    private double distance; //distance traveled so far.
    private double accelerate; //amount of current acceleration, as indicated by keyboard input
    private int turn; //amount of change turn, as indicated by keyboard input
    private int playerX, opponentX; //x position of player and opponent.
    private double playerY, opponentY; //y position of player and opponent.
    private Car player, opponent; //player and opponent cars.  opponent is null when not on the screen.

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Takes user keyboard input and uses it to effect the game in play.
     */
    public void readControls() {
        player.accelerate(accelerate);
        if (turn < 0) {
            player.turnMoreLeft();
        }
        else if (turn > 0) {
            player.turnMoreRight();
        }
        else if (player.getWheelPosition() < 0) { //straighten out if they let go
            player.turnMoreRight();
        }
        else if (player.getWheelPosition() > 0) { //straighten out if they let go
            player.turnMoreLeft();
        }
    }

    @Override
    public void start(Stage stage) {
        gameOver = true;
        player = new Car();
        opponent = null;
        playerY = HEIGHT/2 - CAR_WIDTH/2;
        playerX = 20;
        opponentX = - 2 * CAR_LENGTH;
        accelerate = 0;
        turn = 0;

        Group root = new Group();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        stage.setTitle("Race driving challenge");
        stage.setScene(scene);

        //Set up the road
        Group road = new Group();
        Rectangle r = new Rectangle(0, 0, 2*WIDTH, HEIGHT);
        r.setFill(new Color(.5, .5, .5, 1));
        road.getChildren().add(r);
        r = new Rectangle(0, BORDER_WIDTH, 2*WIDTH, HEIGHT-2*BORDER_WIDTH);
        r.setFill(new Color(.25, .25, .25, 1));
        road.getChildren().add(r);
        for(int i = STRIPE_LENGTH; i < 2*WIDTH; i += STRIPE_SPACING) {
            r = new Rectangle(i, HEIGHT/2-STRIPE_WIDTH/2, STRIPE_LENGTH, STRIPE_WIDTH);
            r.setFill(Color.YELLOW);
            road.getChildren().add(r);
        }
        root.getChildren().add(road);

        //Add the car
        Paint carColor = new RadialGradient(0, 0, CAR_LENGTH*3/4, CAR_WIDTH/4, CAR_WIDTH, false, CycleMethod.NO_CYCLE,
                new Stop(0, Color.BLUE),
                new Stop(1, Color.PURPLE.darker())
        );
        Group car = getCar(carColor);
        root.getChildren().add(car);

        //Add the opponent car
        Group opponentCar = new Group();
        root.getChildren().add(opponentCar);
        opponentCar.getChildren().add(getCar(Color.WHITE));

        //Add the instructions / game over text (is non-empty string iff game is over)
        Text text = new Text("Race driving challenge!\nClick to start\nUse arrow keys to control your car");
        text.setFont(Font.font("Papyrus", FontWeight.BOLD, 40));
        text.setFill(new Color(.75, .1, .1, 1));
        text.setStroke(Color.ORANGE);
        text.setTranslateX(50);
        text.setTranslateY(50);
        root.getChildren().add(text);

        //Key pressed
        EventHandler<KeyEvent> keyListener = new EventHandler<KeyEvent>() {
            /**
             * Called when a key is pressed down.  The arrow keys change the speed and
             * direction of the car: right is faster, left is slower, up is turn-left, and
             * down is turn-right.
             *
             * @param event the key event supplied.
             */
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {
                    accelerate = -1;
                }
                else if (event.getCode() == KeyCode.RIGHT) {
                    accelerate = 1;
                }
                else if (event.getCode() == KeyCode.UP) {
                    turn = -1;
                }
                else if (event.getCode() == KeyCode.DOWN) {
                    turn = 1;
                }
            }
        };
        scene.setOnKeyPressed(keyListener);

        //Key released
        EventHandler<KeyEvent> otherKeyListener = new EventHandler<KeyEvent>() {
            /**
             * Called when a key is released.  Used to figure out when
             * they stopped accelerating/turing/etc.
             *
             * @param event the key event supplied.
             */
            @Override
            public void handle(KeyEvent event) {
                //We use max/min below in case one key is held down when the opposite one is pressed
                if (event.getCode() == KeyCode.LEFT) {
                    accelerate = Math.max(0, accelerate);
                }
                else if (event.getCode() == KeyCode.RIGHT) {
                    accelerate = Math.min(0, accelerate);
                }
                else if (event.getCode() == KeyCode.UP) {
                    turn = Math.max(0, turn);
                }
                else if (event.getCode() == KeyCode.DOWN) {
                    turn = Math.min(0, turn);
                }
            }
        };
        scene.setOnKeyReleased(otherKeyListener);

        EventHandler<MouseEvent> mouseListener = new EventHandler<MouseEvent>() {
            /**
             * If the game is over and the mouse is pressed, we start a new game.
             * @param event the mouse event supplied by the press.
             */
            @Override
            public void handle(MouseEvent event) {
                if (!text.getText().equals("")) {
                    text.setText("");
                    player = new Car();
                    opponent = null;
                    distance = 0;
                    playerY = HEIGHT/2 - CAR_WIDTH/2;
                    playerX = 20;
                    opponentX = - 2 * CAR_LENGTH;
                    accelerate = 0;
                    turn = 0;
                }
            }
        };
        scene.setOnMousePressed(mouseListener);

        //Setup animation timer
        AnimationTimer timer = new AnimationTimer() {
            Long time;
            @Override
            public void handle(long now) {
                //Figure out how much time went by since last frame, relative to what we would expect (60 fps)
                double timeMultiplier;
                if (time == null) {
                    timeMultiplier = 1;
                }
                else {
                    timeMultiplier = (now - time) / 1000000000.0 * 60.0;
                }
                time = now;

                if (text.getText().equals("")) { //Only read controls and update positioning if the game isn't over...
                    readControls();
                    if (player.getSpeed() > 40 && opponent == null) {
                        if (Math.random() < .03) {
                            opponent = new Car();

                            Color[] c = {Color.RED.darker(), Color.GREEN.darker().darker().darker(), Color.WHITE.darker(), Color.CYAN.darker().darker().darker()};
                            Color opColor = c[(int)(Math.random()*4)];
                            opponentCar.getChildren().removeAll();
                            opponentCar.getChildren().add(getCar(opColor));

                            opponent.accelerate(40);
                            opponentX = WIDTH;
                            opponentY = Math.random() * (HEIGHT - 2*BORDER_WIDTH - CAR_WIDTH) + BORDER_WIDTH;
                        }
                    }
                    distance += timeMultiplier * player.getSpeed();
                    playerY += timeMultiplier * player.getWheelPosition() * player.getSpeed() / 60;
                    if (opponent != null) {
                        opponentX -= timeMultiplier * (player.getSpeed() - opponent.getSpeed());
                        //If we pass the opponent, they disappear
                        if (opponentX < -CAR_LENGTH) {
                            opponent = null;
                        }
                    }
                    if (playerY < BORDER_WIDTH) {
                        text.setText("Collided with the wall!\nClick screen to try again.");
                    }
                    else if (playerY > HEIGHT-BORDER_WIDTH-CAR_WIDTH) {
                        text.setText("Collided with the wall!\nClick screen to try again.");
                    }
                    else if (opponent != null) {
                        if (playerX + CAR_LENGTH > opponentX && opponentX + CAR_LENGTH > playerX) { //overlap in X
                            if (playerY + CAR_WIDTH > opponentY && opponentY + CAR_WIDTH > playerY) { //overlap in Y
                                text.setText("Collided with another car!\nClick screen to try again.");
                            }
                        }
                    }
                }
                road.setTranslateX(-(distance % STRIPE_SPACING));
                car.setTranslateX(playerX);
                car.setTranslateY(playerY);
                opponentCar.setTranslateX(opponentX);
                opponentCar.setTranslateY(opponentY);
            }
        };
        timer.start();

        stage.show();
    }

    /**
     * Gets a graphical representation of a car, with the given Color.
     */
    public Group getCar(Paint carColor) {
        Group ret = new Group();

        double x0 = 0; //back of back bumper
        double x1 = 20; //front of back bumper
        double x2 = 20+45; //front of the back taper
        double x3 = 20+45+250; //front part of the main body
        double x4 = 20+45+250+47; //front part of the front bumper

        double w1 = 132; //width of back end
        double w2 = 148; //width of main body

        //back bumper
        Arc backBumper = new Arc(x1, w2/2, (x1-x0), w1/2, 90, 180);
        backBumper.setFill(carColor);
        ret.getChildren().add(backBumper);

        //tapered part
        Polygon taperedPart = new Polygon(x1, (w2-w1)/2, x2, 0, x2, w2, x1, w1 + (w2-w1)/2);
        taperedPart.setFill(carColor);
        ret.getChildren().add(taperedPart);

        //main body
        Rectangle mainBody = new Rectangle(x2, 0, x3-x2, w2);
        mainBody.setFill(carColor);
        ret.getChildren().add(mainBody);

        //front bumper
        Arc frontBumper = new Arc(x3 - (x4-x3)/2 + (x4-x3)/2, w2/2, (x4-x3)/2, w2/2, 270, 180);
        frontBumper.setFill(carColor);
        ret.getChildren().add(frontBumper);

        //mirrors...150 pixels past the back of the main body
        Polygon leftMirror = new Polygon(x2 + 150, 0, x2 + 140, -20, x2 + 150, -20, x2 + 165, 0);
        leftMirror.setFill(carColor);
        ret.getChildren().add(leftMirror);
        Polygon rightMirror = new Polygon(x2 + 150, w2, x2 + 140, w2+20, x2 + 150, w2+20, x2 + 165, w2);
        rightMirror.setFill(carColor);
        ret.getChildren().add(rightMirror);

        //windshield 140, 170, 17, 8
        Polygon windshield1 = new Polygon(x2+140, 17, x2+170, 8, x2+170, w2-8, x2+140, w2-17);
        windshield1.setFill(Color.BLACK);
        ret.getChildren().add(windshield1);
        Arc windshield2 = new Arc(x2+130+40, 8+(w2-16)/2, 40, (w2-16)/2, 270, 180);
        windshield2.setFill(Color.BLACK);
        ret.getChildren().add(windshield2);

        //side windows
        Arc leftWindow = new Arc(x2 + 40, 6, 130, 10, 270, 90);
        leftWindow.setFill(Color.BLACK);
        ret.getChildren().add(leftWindow);
        Arc rightWindow = new Arc(x2 + 40, w2-6, 130, 10, 0, 90);
        rightWindow.setFill(Color.BLACK);
        ret.getChildren().add(rightWindow);

        //back window
        //x: 50 90    y: 45 40
        double b0 = 3*x1/4 + x2/4;
        double b1 = x1/2 + x2/2;
        double b2 = x2 + (x2-x1)/2;
        Polygon backWindow = new Polygon(b1, 25, b2, 22, b2, w2-22, b1, w2-25);
        backWindow.setFill(Color.BLACK);
        ret.getChildren().add(backWindow);
        Arc backWindowArc = new Arc(b1, w2/2, (b1-b0), (w2-50)/2, 90, 180);
        backWindowArc.setFill(Color.BLACK);
        ret.getChildren().add(backWindowArc);

        return ret;
    }

}


