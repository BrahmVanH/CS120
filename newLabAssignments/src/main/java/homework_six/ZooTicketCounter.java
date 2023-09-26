package homework_six;

//Name: Brahm Van Houzen
//Resources: https://stackoverflow.com/questions/2755945/how-can-i-use-as-the-delimiter-with-string-split-in-java (For proper usage of String.split() method with "." as a regex)
import java.util.Arrays;
import java.util.regex.Pattern;

import homework_five.ConsoleIO;


public class ZooTicketCounter {
  public static void main(String[] args) {

   

    // Ask user how many adults they have (keep asking if less than 1)
    ConsoleIO.printLine("Welcome to the CS 120 Zoo!");


    //User enter number of adults in party
    ConsoleIO.printLine("How many adults do you have in your party?");
    int numberOfAdults = ConsoleIO.readInt();
    //Require positive integer
    while (numberOfAdults < 0) {
      ConsoleIO.printLine("How many adults do you have in your party?");
      numberOfAdults = ConsoleIO.readInt();

    }

    //User enter number of children over 4 years in party
    ConsoleIO.printLine("How many children (age 5 to 18) do you have in your party?");
    int numberOfChildren = ConsoleIO.readInt();
    //Required positive integer
    while (numberOfChildren < 0) {
      ConsoleIO.printLine("How many children (age 5 to 18) do you have in your party?");
      numberOfChildren = ConsoleIO.readInt();

    }

    //User enter number of children under 4
    ConsoleIO.printLine("How many children under 4 do you have in your party?");
    int numberOfFreeChildren = ConsoleIO.readInt();

    //Require positive integer
    while (numberOfFreeChildren < 0) {
      ConsoleIO.printLine("How many children under 4 do you have in your party?");
      numberOfFreeChildren = ConsoleIO.readInt();

    }
    
    // Declare ticket prices for easy changing with changing of ticket prices
    double adultTicketPrice = 12.50;
    double childTicketPrice = 7.25;
    double totalTicketPrice = 0.0;

    //Conditional responses and ticket price evaluation dependent on different amounts of ticket types
    if (numberOfAdults == 0 && numberOfChildren > 0) {
      ConsoleIO.printLine("Sorry, all children under 18 must be accompanied by an adult");

    } else if (numberOfAdults > 0 && numberOfChildren == 0) {
      totalTicketPrice = numberOfAdults * adultTicketPrice;
    } else if (numberOfChildren < 4 && numberOfAdults > 0) {
      totalTicketPrice = (numberOfAdults * adultTicketPrice) + (numberOfChildren * childTicketPrice);

    } else if (numberOfAdults > 0 && numberOfChildren > 3) {
      totalTicketPrice = (numberOfAdults * adultTicketPrice) + (childTicketPrice * 3);
    } else {
      ConsoleIO.printLine("There was an error in the amount of children or adults in your party");
    }

    //Calculate total party size
    int totalPartySize = numberOfAdults + numberOfChildren + numberOfFreeChildren;
    ConsoleIO.printLine("So that's " +totalPartySize+ " tickets. You're total is going to be $" +totalTicketPrice+ ".");

    //Input total cash tendered
    ConsoleIO.printLine("Total cash tendered?");
    double tendered = ConsoleIO.readDouble();

    //Require adequate payment amount from user
    while (tendered < totalTicketPrice) {
      ConsoleIO.printLine("Sorry, that wasn't quite enough... Please give the correct amount.");
      tendered = ConsoleIO.readDouble();
    }
    double change = tendered - totalTicketPrice;


    String changeStr = change+"";
    ConsoleIO.printLine("You're change will be $" +changeStr);
    String[] changeArr = changeStr.split(Pattern.quote("."));
    
    long dollars = Long.parseLong(changeArr[0]);
    int cents = Integer.parseInt(changeArr[1]);

    int numberOfBills = Dollars.numberOfBillsFor(dollars);
    int numberOfCoins = Coins.numberOfCoinsFor(cents);

    ConsoleIO.printLine("You will be returning " +numberOfBills+ " bills, and " +numberOfCoins+ " coins.");

    int changeDollars = 0;

    while (changeDollars + 100 <= dollars) {
      Dollars.dispenseHundred(true);
      changeDollars += 100;

    }

    while (changeDollars + 50 <= dollars) {
      Dollars.dispenseFifty(true);
      changeDollars += 50;
    }

    while (changeDollars + 20 <= dollars) {
      Dollars.dispenseTwenty(true);
      changeDollars += 20;
    }

    while (changeDollars + 10 <= dollars) {
      Dollars.dispenseTen(true);
      changeDollars += 10;
    }

    while (changeDollars + 5 <= dollars) {
      Dollars.dispenseFive(true);
      changeDollars += 5;
    }

    while (changeDollars < dollars) {
      Dollars.dispenseOne(true);
      changeDollars += 1;
    }

    // Dispense quarters until we must use a smaller coin to continue.
    // Need to dispense quarters until change + 25 > cents
    int changeCents = 0;
    while (changeCents + 25 <= cents) {
      Coins.dispenseQuarter(true);
      changeCents += 25;
    }

    // Dispense dimes until we must use a smaller coin to continue.
    while (changeCents + 10 <= cents) {
      Coins.dispenseDime(true);
      changeCents += 10;
    }

    // Dispense nickels until we must use a smaller coin to continue.
    while (changeCents + 5 <= cents) {
      Coins.dispenseNickel(true);
      changeCents += 5;
    }

    // Dispense pennies for whatever is left.
    while (changeCents < cents) {
      Coins.dispensePenny(true);
      changeCents += 1;
    }



  }
}
