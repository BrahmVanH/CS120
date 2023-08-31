public class DiceRollWithOptions {
    public static void main(String[] args) {

        //Prompt user if they want to play with 4 or 6 sided die
        //If statement to evaluate input and set number of sides on dice

        ConsoleIO.printLine("Would you like to roll 4- or 6-sided dice?");
        ConsoleIO.printLine("Please enter 1 for 4-sided or 2 for 6-sided");
        int userInput;
        userInput = ConsoleIO.readInt();

        do {
            int numberOfSides;
            numberOfSides = 0;
            double firstRoll;
            double secondRoll;

            if (userInput == 1) {
                numberOfSides = 4;

            } else if (userInput == 2) {
                numberOfSides = 6;
            } else {
                ConsoleIO.printLine("You must enter 1 or 2");
                userInput = ConsoleIO.readInt();
            }
            firstRoll = Math.ceil(Math.random() * numberOfSides);
            secondRoll = Math.ceil(Math.random() * numberOfSides);
            ConsoleIO.printLine("First die rolled a " + firstRoll);
            ConsoleIO.printLine("Second die rolled a " + secondRoll);
            if (firstRoll > secondRoll) {
                ConsoleIO.printLine("First roll was higher than second roll");
            } else {
                ConsoleIO.printLine("Second roll was higher than first roll");
            }


        } while (userInput != 1 && userInput != 2);
    }
}