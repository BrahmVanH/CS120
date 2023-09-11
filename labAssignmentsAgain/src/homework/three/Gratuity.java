package homework.three;

import homework.two.ConsoleIO;

import java.text.*;
import java.math.*;

// Name: Brahm Van Houzen
// Sources: http://euclid.nmu.edu/~mkowalcz/cs120/hwk3/DecimalExample.java

public class Gratuity {
    public static void main(String[] args) {
        // Create a new instance of the DecimalFormat class from java.text
        DecimalFormat formatDecimal = new DecimalFormat("0.00");

        // Set the rounding mode of the formatDecimal instance of DecimalFormat to HALF_UP
        // If >= .5 round up, if < .5 round down
        formatDecimal.setRoundingMode(RoundingMode.HALF_UP);

        // Ask user how much their bill was (double)
        ConsoleIO.print("What is the grand total of your bill? ");
        double billTotal;
        billTotal = ConsoleIO.readDouble();

        // Ask user what percentage gratuity they would like to leave (double)

        ConsoleIO.printLine("What percentage of your total bill would you like to leave as a tip?");
        ConsoleIO.printLine("Enter 1 for 10%");
        ConsoleIO.printLine("Enter 2 for 15%");
        ConsoleIO.printLine("Enter 3 for 20%");
        ConsoleIO.printLine("Enter 4 for 25%");
        ConsoleIO.printLine("Enter 5 to put in a custom percentage");

        int userTipQuantitySelection;
        double percentageTip = 0;

        userTipQuantitySelection = ConsoleIO.readInt();
        // Sets percentage tip to non-decimal to allow for printing later without reformatting
        if (userTipQuantitySelection == 1) {
            percentageTip = 10;
        } else if (userTipQuantitySelection == 2) {
            percentageTip = 15;
        } else if (userTipQuantitySelection == 3) {
            percentageTip = 20;
        } else if (userTipQuantitySelection == 4) {
            percentageTip = 25;
        } else if (userTipQuantitySelection == 5) {
            ConsoleIO.print("Please enter the percentage tip you would like to leave. ");
            percentageTip = ConsoleIO.readDouble();
        } else {
            ConsoleIO.printLine("Please enter a number from the above selection.");
            userTipQuantitySelection = ConsoleIO.readInt();

        }
        double gratuity;

        String roundedGratuity;

        // Calculate gratuity based on user selection
        gratuity = billTotal * ( percentageTip * 0.01);

        // Round gratuity to two decimal places
        roundedGratuity = formatDecimal.format(gratuity);

        // Print amount of gratuity
        ConsoleIO.printLine("The total gratuity for your bill, applying " + (int)percentageTip + "% is $" + roundedGratuity);

        // Calculate total bill using rounded gratuity for consistency
        double billPlusGratuity = billTotal + Double.parseDouble(roundedGratuity);

        // Format total bill to two decimal places
        String roundedBillPlusGratuity = formatDecimal.format(billPlusGratuity);

        // Print total bill
        ConsoleIO.printLine("Your total bill, including gratuity, will be $" + roundedBillPlusGratuity);
    }
}
