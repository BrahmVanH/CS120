// Name: Brahm Van Houzen
// Sources: Assignment guide; Homework 3 DecimalFormat information

import java.text.*;
import java.math.*;

public class Boxcars {
    public static void main(String[] args) {
        // Keep rolling two dice until we get boxcars (12)


        int diceOne;
        int numberOfRolls = 0;
        int diceTwo;
        diceOne = 1 + (int)(Math.random() * 6);
        numberOfRolls++;
        diceTwo = 1 + (int)(Math.random() * 6);
        ConsoleIO.printLine("Rolled: " + diceOne + ", " + diceTwo);

        while (diceOne < 6 || diceTwo < 6) {
            diceOne = 1 + (int)(Math.random() * 6);
            diceTwo = 1 + (int)(Math.random() * 6);

            numberOfRolls++;
            ConsoleIO.printLine("Rolled: " + diceOne + ", " + diceTwo);

        }

        ConsoleIO.printLine("Number of tries to get Boxcar: " + numberOfRolls);

        DecimalFormat formatDecimal = new DecimalFormat("0.00");

        // Set the rounding mode of the formatDecimal instance of DecimalFormat to HALF_UP
        // If >= .5 round up, if < .5 round down
        formatDecimal.setRoundingMode(RoundingMode.HALF_UP);

        double probability = (100.0/36.0)* (Math.pow((35.0/36.0), (numberOfRolls - 1)));
        String roundedProbability;
        roundedProbability = formatDecimal.format(probability);
        ConsoleIO.printLine("The probablilty of rolling the dice this many times to get boxcars is: " + roundedProbability + "%.");
    }


}
