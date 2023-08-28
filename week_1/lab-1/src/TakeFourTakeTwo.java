
public class TakeFourTakeTwo {
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

        int stonesRemaining;
        int stonesRemoved;


        ConsoleIO.print("How many stones would you like to play with? ");
        stonesRemaining = ConsoleIO.readInt();

        ConsoleIO.printLine("There are " + stonesRemaining + " stones left in the pot");


        while (stonesRemaining > 3) {

            ConsoleIO.print("Player 1, how many stones would you like to take? ");
            stonesRemoved = ConsoleIO.readInt();

            if (stonesRemoved > 4 || stonesRemoved < 1) {
                ConsoleIO.printLine("Please choose a number between one and four");
                continue;
            }

            stonesRemoved = ConsoleIO.readInt();
            stonesRemaining = stonesRemaining - stonesRemoved;
            ConsoleIO.printLine("There are " + stonesRemaining + " stones remaining in the pot");
            ConsoleIO.print("Player 2, how many stones would you like to remove? ");
            stonesRemoved = ConsoleIO.readInt();
            if (stonesRemoved > 4 || stonesRemoved < 1) {
                ConsoleIO.printLine("Please choose a number between one and four");
               continue;
            }
            stonesRemoved = ConsoleIO.readInt();
            stonesRemaining = stonesRemaining - stonesRemoved;



            ConsoleIO.printLine("There are " + stonesRemaining + " stones remaining in the pot");
        }

        while (stonesRemaining < 4 ) {


                ConsoleIO.print("Player 1, how many stones would you like to remove? ");
                stonesRemoved = ConsoleIO.readInt();
                if (stonesRemoved > 4 || stonesRemoved < 1) {
                    ConsoleIO.printLine("Please choose a number between one and four");
                    continue;
                } else if (stonesRemoved == 4) {
                    ConsoleIO.printLine("No stones left in the pot, player 2 wins");

                } else {
                    ConsoleIO.print("Player 2, how many stones would you like to remove?");
                    continue;
                }

            stonesRemoved = ConsoleIO.readInt();
            stonesRemaining = stonesRemaining - stonesRemoved;

        }

        while (stonesRemaining == 3 ) {


                ConsoleIO.print("Player 1, how many stones would you like to remove? ");
                stonesRemoved = ConsoleIO.readInt();
                if (stonesRemoved > 3) {
                    ConsoleIO.printLine("There arent that many stones left in the pot, please choose an appropriate number of stones.");
                    stonesRemoved = ConsoleIO.readInt();
                    stonesRemaining = stonesRemaining - stonesRemoved;
                } else if (stonesRemoved == 3) {
                    ConsoleIO.printLine("No more stones left in the pot, Player 2 wins");
                } else {
                    ConsoleIO.printLine("There are " + stonesRemaining + " stones left in the pot");
                    ConsoleIO.print("Player 2, how many stones would you like to remove?");
                    stonesRemoved = ConsoleIO.readInt();
                    stonesRemaining = stonesRemaining - stonesRemoved;
                }


        }
            while (stonesRemaining == 2) {

                ConsoleIO.print("Player 1, how many stones would you like to remove? ");
                stonesRemoved = ConsoleIO.readInt();
                if (stonesRemoved > 2) {
                    ConsoleIO.printLine("There arent that many stones left in the pot, please choose an appropriate number of stones.");
                    stonesRemoved = ConsoleIO.readInt();
                    stonesRemaining = stonesRemaining - stonesRemoved;
                } else if (stonesRemoved == 2) {
                    ConsoleIO.printLine("No more stones left in the pot, Player 2 wins");
                } else {
                    ConsoleIO.printLine("There are " + stonesRemaining + " stones left in the pot");
                    ConsoleIO.print("Player 2, how many stones would you like to remove?");
                    stonesRemoved = ConsoleIO.readInt();
                    stonesRemaining = stonesRemaining - stonesRemoved;


                }
            }

                    while (stonesRemaining == 1) {

                            ConsoleIO.print("Player 1, how many stones would you like to remove? ");
                            stonesRemoved = ConsoleIO.readInt();
                            if (stonesRemoved > 1) {
                                ConsoleIO.printLine("There arent that many stones left in the pot, please choose an appropriate number of stones.");
                                stonesRemoved = ConsoleIO.readInt();
                                stonesRemaining = stonesRemaining - stonesRemoved;
                            } else if (stonesRemoved == 1) {
                                ConsoleIO.printLine("No more stones left in the pot, Player 2 wins");
                            } else {
                                ConsoleIO.printLine("There are " + stonesRemaining + " stones left in the pot");
                                ConsoleIO.print("Player 2, how many stones would you like to remove?");
                                stonesRemoved = ConsoleIO.readInt();
                                stonesRemaining = stonesRemaining - stonesRemoved;
                            }


                        }

    }
                }


