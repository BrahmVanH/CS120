// Name: Brahm Van Houzen
// Sources: Na

import java.math.*;
import java.text.*;

public class KowMart {
  public static void main(String[] args) {

    DecimalFormat decimalFormat = new DecimalFormat("0.00");
    // Print greeting.

    ConsoleIO.printLine("Welcome to KowMart!");

    // Ask how many items
    ConsoleIO.printLine("How many items do you have to checkout? (1-10)");
    int numberOfItems;
    numberOfItems = ConsoleIO.readInt();

    // As long as they gave a number too small or too big, loop and ask again

    while (numberOfItems < 1 || numberOfItems > 10) {
      ConsoleIO.printLine("Please choose 1-10.");
      numberOfItems = ConsoleIO.readInt();
    }

    // Add up the cost of each item

    int itemsCounter = 0;
    double itemCost;
    double totalCost = 0;

    if (itemsCounter == 0) {
      ConsoleIO.printLine("Enter the first item price.");
      itemCost = ConsoleIO.readDouble();
      itemsCounter++;
      totalCost += itemCost;
    }

    while (itemsCounter > 0 && itemsCounter < numberOfItems - 1) {
      ConsoleIO.printLine("Enter next item cost.");
      itemCost = ConsoleIO.readDouble();
      itemsCounter++;
      totalCost += itemCost;
    }

    if (itemsCounter == numberOfItems - 1) {
      ConsoleIO.printLine("Enter the cost of the last item.");
      itemCost = ConsoleIO.readDouble();
      totalCost += itemCost;

    }

    // Ask if a bag is needed
    ConsoleIO.printLine(
        "Would you like to purchase a bag for your items? Enter 'yes' or 'no'. ($0.05 for orders less than 3 items)");
    boolean wouldLikeBag = false;
    String bagResponse;
    bagResponse = ConsoleIO.readLine();
    if (bagResponse.equals("yes")) {
      wouldLikeBag = true;
      ConsoleIO.printLine("You chose 'yes' to purchasing a bag");
    } else if (bagResponse.equals("no")) {
      ConsoleIO.printLine("You chose 'no' to purchasing a bag.");
    } else {
      ConsoleIO.printLine("Please enter 'yes' or 'no'.");
    }

    // Add the cost of bag, if necessary.
    if (wouldLikeBag && numberOfItems < 3) {
      totalCost += 0.05;
    }

    String formatTotalCost = decimalFormat.format(totalCost);

    ConsoleIO.printLine("Sub-total: $" + formatTotalCost);
    ConsoleIO.printLine("Tax (6%): $" + decimalFormat.format(totalCost * 0.06));
    // Add sales tax (MI sales tax)
    totalCost += (totalCost * 0.06);
    formatTotalCost = decimalFormat.format(totalCost);

    // print out the total.
    ConsoleIO.printLine("Total: $" + formatTotalCost + ".");
  }
}