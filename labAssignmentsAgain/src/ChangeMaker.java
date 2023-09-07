// Name: Brahm Van Houzen
// Resources:

public class ChangeMaker {

    public static void main(String[] args) {
        //Ask the user for the amount of change to give out (in cents)
        ConsoleIO.printLine("How much change in dollars would you like to return?");
        long dollars = ConsoleIO.readLong();
        ConsoleIO.printLine("How much change in cents would you like to return?");
        int cents = ConsoleIO.readInt();


        int numberOfBills = Dollars.numberOfBillsFor(dollars);
        ConsoleIO.printLine("You will be returning " + numberOfBills + " bills.");
        //Report the number of coins we will give out to make that change.
        int numberOfCoins = Coins.numberOfCoinsFor(cents);
        ConsoleIO.printLine("You will be returning " + numberOfCoins + " coins.");

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

        //Dispense quarters until we must use a smaller coin to continue.
        // Need to dispense quarters until change + 25 > cents
        int changeCents = 0;
        while (changeCents + 25 < cents) {
            Coins.dispenseQuarter(true);
            changeCents += 25;
        }

        //Dispense dimes until we must use a smaller coin to continue.
        while (changeCents + 10 < cents) {
            Coins.dispenseDime(true);
            changeCents += 10;
        }

        //Dispense nickels until we must use a smaller coin to continue.
        while (changeCents + 5 < cents) {
            Coins.dispenseNickel(true);
            changeCents += 5;
        }

        //Dispense pennies for whatever is left.
        while (changeCents < cents) {
            Coins.dispensePenny(true);
            changeCents +=1;
        }

    }

}
