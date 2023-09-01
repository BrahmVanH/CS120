public class drKowsHamburgerPalace {
    public static void main(String[] args) {
        //Print the Hamburger Palace sign.
        ConsoleIO.printLine("******************************");
        int line = 0;
        while(line < 5) {
            ConsoleIO.printLine("*                            *");
            line++;
        }
        ConsoleIO.printLine("* Dr. Kow's Hamburger Palace *");

        line = 0;
        while(line < 5) {
            ConsoleIO.printLine("*                            *");
            line++;
        }
        ConsoleIO.printLine("******************************");

        //Print the Hamburger Palace sign
        //Ask how much lettuce the user wants
        //Print out the result to the screen

        int lettuce;
        int cheese;
        int bacon;
        ConsoleIO.printLine("How many slices of lettuce do you want on your burger?");
        lettuce = ConsoleIO.readInt();
        ConsoleIO.printLine("How many slices of cheese do you want on your burger?");
        cheese = ConsoleIO.readInt();
        ConsoleIO.printLine("How muany slices of bacon would you like on your burger?");
        bacon = ConsoleIO.readInt();
        line = 0;
        ConsoleIO.printLine("(_________)");
        while (line < lettuce) {
           ConsoleIO.printLine(" ~~~~~~~~~");
           line++;
        }
        line = 0;
        while (line < cheese) {
            ConsoleIO.printLine(" =========");
            line++;
        }
        line = 0;
        while (line < bacon) {
            ConsoleIO.printLine(" |/\\//\\//|");
            line++;
        }
        ConsoleIO.printLine(" *********");
        ConsoleIO.printLine("(_________)");


        ConsoleIO.printLine("Order up!");


    }
}
