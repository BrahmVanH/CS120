package homework_seven;
// Name: Brahm Van Houzen
// Sources: I read about java while and do.. while on geeksforgeeks, but the code is all original

public class TakeFourTakeThree {
    public static void main(String[] args) {

        // Declare variables for stone handling
        int stonesRemaining;
        int stonesRemoved;

        // Explain instructions for players
        ConsoleIO.printLine("This is the game Take Four. It's a two player game. Players will choose the number ");
        ConsoleIO.printLine("of stones to start the game with and each player will choose to take 1 to 4 stones ");
        ConsoleIO.printLine("from the pot per turn. The player to take the last stone loses.");


        // Prompt users for how many stones they would like to begin the game with
        ConsoleIO.print("How many stones would you like to begin with? ");

        // Save console input as stones remaining
        int stones = ConsoleIO.readInt();
        Game game = new Game(stones);
        stonesRemaining = game.getNumberOfStonesRemaining();

        // Game will proceed only if there are more than zero stones in the pot
        while (stonesRemaining > 0) {
            
            game.printRemainingStones();
            
            // Prompt player one for their turn
            ConsoleIO.print("Player 1, how many stones would you like to remove from the pot? ");
            // Save console input as stones removed by user
            stonesRemoved = ConsoleIO.readInt();
            game.takeStone(stonesRemoved);
            // Ensure only the appropriate number of stones are removed from the pot
           

            // Ensure user isn't taking more stones than are remaining in the pot
            while (stonesRemoved > stonesRemaining) {
                ConsoleIO.printLine("There aren't that many stones left in the pot, please choose an ");
                ConsoleIO.printLine("appropriate number.");
                stonesRemoved = ConsoleIO.readInt();
            }

            stonesRemaining -= stonesRemoved;
            // Check to see if user took last stone
            if (stonesRemaining <= 0) {
                ConsoleIO.printLine("There are 0 stones left in the pot, player 2 wins");
                
            }

            if (stonesRemaining > 1) {
                ConsoleIO.printLine("There are " + stonesRemaining + " stones left in the pot");
            } else {
                ConsoleIO.printLine("There is " + stonesRemaining + " stone left in the pot");
            }

            ConsoleIO.print("Player 2, how many stones would you like to remove from the pot? ");
            stonesRemoved = ConsoleIO.readInt();



            while (stonesRemoved > 4 || stonesRemoved < 1) {
                ConsoleIO.printLine("Please choose a number between 1 and 4");
                stonesRemoved = ConsoleIO.readInt();
            }

            while (stonesRemoved > stonesRemaining) {
                ConsoleIO.printLine("There aren't that many stones left in the pot, please choose an ");
                ConsoleIO.printLine("appropriate number.");
                stonesRemoved = ConsoleIO.readInt();
            }

            stonesRemaining -= stonesRemoved;

            if (stonesRemaining <= 0) {
                ConsoleIO.printLine("There are 0 stones left in the pot, player 1 wins");
            }

        }

    }


}


