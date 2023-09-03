package lecture.discussion.two;

import java.util.*; //This is so we can use the Date class.
import java.net.*; //This is so we can use InetAddress

public class Utility {
    //public means it can be called from anywhere.
    //static methods are called using the class name as a prefix:   int j = Utility.getPositiveInt();
    //int here in the method declaration says what kind of data comes back to the caller (main)

    // Promts user to enter a positive integer and saves that value as an integer, prints int
    public static int getPositiveInt() {
        ConsoleIO.printLine("Enter a positive integer:");
        int value = ConsoleIO.readInt();
        while(value <= 0) {
            ConsoleIO.printLine("Enter a positive integer:");
            value = ConsoleIO.readInt();
        }

        //To send the value back to main, we use a return statement, like this:
        return value;
    }

    // Returns the value of pi, which is manually entered here
    public static double getPi() {
        return 3.14159265358979;
    }

    // Returns the value of pi^2
    public static double getPiSquared() {
        double p = getPi();
        p = p * p;
        return p;
    }

    public static String getCurrentTime() {
        Date d = new Date();
        String s = d.toString();
        return s;
    }

    // Gets current user's IP address
    public static String getIP() {
        String ip = "";
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        }
        catch(Exception e) {}

        return ip;
    }

    //If it doesn't return anything, use 'void'
    public static void ghostPrintLine(String stuffToType) {
        int i = 0;
        while(i < stuffToType.length()) {
            ConsoleIO.print( stuffToType.substring(i, i+1) );
            // Try.. catch to allow method to loop async
            try {
                // .sleep() method causes current loop to cease function for specified amount of time
                Thread.currentThread().sleep(100);
            }
            catch(Exception e) {}
            i = i + 1;
        }
        ConsoleIO.printLine();

    }



}
