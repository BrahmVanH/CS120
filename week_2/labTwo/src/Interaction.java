//Name: Brahm Van Houzen
//References: The lab README

public class Interaction {
    public static void main(String[] args) {
        // Get decimal from user
        ConsoleIO.printLine("What number do you want the square root of?");
        double x;
        x = ConsoleIO.readDouble();
        // Get integer from user
        ConsoleIO.printLine("What number do you want to see larger?");
        int z;
        z = ConsoleIO.readInt();

        // Find the square root of the decimal number and print it out
        double y;
        y = Math.sqrt(x);
        ConsoleIO.printLine("Square root of " + x + " is " + y);
        // Print a number 1 larger than the integer entered
        int a;
        a = z + 1;
        ConsoleIO.printLine("You number made bigger is " + a);
    }
}
