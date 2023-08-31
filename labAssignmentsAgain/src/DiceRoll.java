public class DiceRoll {

    public static void main(String[] args) {

        welcomeMessage();


    }
    public static int welcomeMessage() {

        ConsoleIO.printLine("Would you like to roll 6 or 4 sided dice?");
        ConsoleIO.printLine("Enter 1 for 4-sided dice or 2 for 6-sided dice");
        int userChoice;
        userChoice = ConsoleIO.readInt();
        return userChoice;
    }
    public static void fourSided() {
        // Ask user which dice set they would like to use

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
    }
    public static void sixSided() {
        //Die roll game for two 6-sided die
        //Get a random number
        double x;
        x = Math.random();
        double firstDieRoll;

        //Use the random number to decide the outcome of a die roll
        firstDieRoll = Math.ceil(x * 6);
        ConsoleIO.printLine("First die rolled: " + firstDieRoll);

        //Get a second random number
        double y;
        y = Math.random();
        //Decide the outcome of a second die roll
        double secondDieRoll;
        secondDieRoll = Math.ceil(y * 6);
        ConsoleIO.printLine("Second die rolled: " + secondDieRoll);

        //Print out which roll was higher
        if (firstDieRoll > secondDieRoll) {
            ConsoleIO.printLine("First roll was higher than second roll");
        } else if (firstDieRoll == secondDieRoll) {
            ConsoleIO.printLine("Both die rolled the same.");
        } else {
            ConsoleIO.printLine("Second roll was higher than first roll");
        }

    }
}
