//Name: Brahm Van Houzen
//References: Na

public class DiceRollGame {
    public static void main(String[] args) {
        //Get a random number
        double z;
        z = Math.random();
        ConsoleIO.printLine("Random number: " + z);
        int roll;

        //Use the random number to decide the outcome of a die roll
        if (z < 0.25) {
            roll = 1;
        } else if (z < 0.5) {
            roll = 2;
        } else if (z < 0.75) {
            roll = 3;
        } else {
            roll = 4;
        }
        ConsoleIO.printLine("First die rolled a: " + roll);

        //Get a second random number
        double a;
        a = Math.random();
        int secondRoll;

        //Decide the outcome of a second die roll
        if (a < 0.25) {
            secondRoll = 1;
        } else if (a < 0.5) {
            secondRoll = 2;
        } else if (a < 0.75) {
            secondRoll = 3;
        } else {
            secondRoll = 4;
        }
        ConsoleIO.printLine("Second die rolled a: " + secondRoll);
        //Print out which roll was higher

        if (roll > secondRoll) {
            ConsoleIO.printLine("First roll was higher than second roll");
        } else if (roll == secondRoll) {
            ConsoleIO.printLine("Both die rolled the same.");
        } else {
            ConsoleIO.printLine("Second roll was higher than first roll");
        }
        if ( roll != secondRoll) {
            ConsoleIO.printLine("The maximum of the two rolls was: " + Math.max( roll, secondRoll));
        }
    }
}
