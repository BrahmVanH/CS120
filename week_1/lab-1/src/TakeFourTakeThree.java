public class TakeFourTakeThree {
    public static void main(String[] args) {
        // Instruct user this is game take four
        // Explain instructions

        // Declare variable of numberOfStones
        // Each user will take one to four stones from pot
        // User to take last stone from pot wins
        // Pot cannot be less than zero stones
        // When pot is less than four stones, user can only take
        // a maximum amount of stones equal to the number of stones left
        // While number of stones is > 3, act normal
        // While number of stones is < 4, stonesRemoved cannot be greater than remainingStones

        // Declare variables for total stones in pot and amount of stones removed
        int stonesRemaining;
        int stonesRemoved;

        ConsoleIO.printLine("This is the game Take Four. It's a two player game. Players will choose the number ");
        ConsoleIO.printLine("of stones to start the game with and each player will choose to take 1 to 4 stones ");
        ConsoleIO.printLine("from the pot per turn. The player to take the last stone loses.");


        // Prompt users for how many stones they would like to begin the game with
        ConsoleIO.print("How many stones would you like to begin with? ");
        stonesRemaining = ConsoleIO.readInt();


        while (stonesRemaining > 0) {

            ConsoleIO.printLine("There are " + stonesRemaining + " stones left in the pot");

            ConsoleIO.print("Player 1, how many stones would you like to remove from the pot? ");
            stonesRemoved = ConsoleIO.readInt();
//            do {
//                ConsoleIO.printLine("Please choose a number between 1 and 4");
//                stonesRemoved = ConsoleIO.readInt();
//
//            } while (stonesRemoved > 4 || stonesRemoved < 1);
            while (stonesRemoved > 4 || stonesRemoved < 1) {
                ConsoleIO.printLine("Please choose a number between 1 and 4");
                stonesRemoved = ConsoleIO.readInt();
            }

            stonesRemaining -= stonesRemoved;

            if (stonesRemaining <= 0) {
                ConsoleIO.printLine("There are 0 stones left in the pot, player 2 wins");
                break;
            }

            ConsoleIO.printLine("There are " + stonesRemaining + " stones left in the pot");

            ConsoleIO.print("Player 2, how many stones would you like to remove from the pot? ");
            stonesRemoved = ConsoleIO.readInt();

//            do {
//                ConsoleIO.printLine("Please choose a number between 1 and 4");
//                stonesRemoved = ConsoleIO.readInt();
//
//            } while (stonesRemoved > 4 || stonesRemoved < 1);

            while (stonesRemoved > 4 || stonesRemoved < 1) {
                ConsoleIO.printLine("Please choose a number between 1 and 4");
                stonesRemoved = ConsoleIO.readInt();
            }


            stonesRemaining -= stonesRemoved;
            if (stonesRemaining <= 0) {
                ConsoleIO.printLine("There are 0 stones left in the pot, player 1 wins");
                break;
            }

        }

    }


}


