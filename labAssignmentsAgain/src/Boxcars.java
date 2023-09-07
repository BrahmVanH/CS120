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

    }


}
