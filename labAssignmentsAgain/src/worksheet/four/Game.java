package worksheet.four;

//Fill in the main program below.

import homework.two.ConsoleIO;

import java.util.concurrent.CompletionService;

public class Game {
    public static void main(String[] args) {
        //This declares a Player variable called playerOne.
        Player playerOne;

        //TODO: Assign a new Player object to playerOne.
        playerOne = new Player();

        //TODO: Set playerOne's name to be your name
        playerOne.name = "Brahm";

        //TODO: Set playerOne's point score to be 880
        playerOne.pointScore = 880;

        //The following line of code makes the score go up by 10.
        playerOne.pointScore = playerOne.pointScore + 10;

        //TODO: Now print out the playerOne.pointScore variable.
        ConsoleIO.printLine("Player One, " + playerOne.name + ", has a score of " + playerOne.pointScore + " points.");
    }
}
