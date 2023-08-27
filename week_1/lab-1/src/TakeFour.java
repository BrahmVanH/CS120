// Name: Brahm Van Houzen
// Sources: Na

public class TakeFour {

    public static void main(String[] args) {

        // Let the user know we are playing Take Four
        ConsoleIO.printLine("Lets play Take Four");

        // State instructions
        // Start with ten stones, two users, each user takes a number of stones 1-4
        // Let the user know there are 10 stones to begin with
        ConsoleIO.printLine("This is a two player game. The game will start with" +
                " ten stones in a pile and each player will remove a one to four stones at" +
                " a time, the player to take the last stone loses");

        // Declare number of stones variable
        int numberOfStones;
        int stonesRemoved;
        // Set variable to 10
        numberOfStones = 10;

        // Create prompt message options depending on number of stones for grammatical correction
        let String numberOfStonesMessage;

        if (numberOfStones > 1) {
            let numberOfStonesMessage = ("There are " + numberOfStones + " stones left in the pile");
        } else {
            let numberOfStonesMessage = ("There is " + numberOfStones + " stone left in the pile");
        }



        ConsoleIO.printLine(numberOfStonesMessage);
        while (numberOfStones >= 4) {
            // Prompt user to withdraw a number of stones 1-4
            ConsoleIO.printLine("Player 1, how many stones would you like to take 1-4?");
            stonesRemoved = ConsoleIO.readInt();
            if (stonesRemoved >= 1 && stonesRemoved <= 4) {
                // Reduce stones by that number
                numberOfStones = numberOfStones - stonesRemoved;
            } else {
                ConsoleIO.printLine("You must choose a number between 1 and 4!");
                stonesRemoved = ConsoleIO.readInt();
                numberOfStones = numberOfStones - stonesRemoved;

            }
            // Update users on number of stones remaining
            ConsoleIO.printLine(numberOfStonesMessage);

            ConsoleIO.printLine("Player 2, how many stones would you like to take 1-4?");
            stonesRemoved = ConsoleIO.readInt();

            if (stonesRemoved >= 1 && stonesRemoved <= 4) {
                // Reduce stones by that number
                numberOfStones = numberOfStones - stonesRemoved;
            } else {
                ConsoleIO.printLine("You must choose a number between 1 and 4!");
                stonesRemoved = ConsoleIO.readInt();
                numberOfStones = numberOfStones - stonesRemoved;

            }
        }

        while ( numberOfStones <=4 ) {
            // Prompt user to withdraw a number of stones 1-4
            ConsoleIO.printLine("Player 1, how many stones would you like to take 1-4?");
            stonesRemoved = ConsoleIO.readInt();
            if (stonesRemoved >= 1 && stonesRemoved <= 4 && numberOfStones - stonesRemoved >= 0) {
                // Reduce stones by that number
                numberOfStones = numberOfStones - stonesRemoved;
            } else {
                ConsoleIO.printLine("There aren't enough stones left to do that");
                stonesRemoved = ConsoleIO.readInt();
                numberOfStones = numberOfStones - stonesRemoved;

            }
        }

    }

}