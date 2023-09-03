public class HomeworkOne {
    public static void main(String[] args) throws InterruptedException {
//        Key in the area code of your phone number
//        Multiply by 128
//        Add 1
//        Multiply by 156250
//        Add the last 7 digits of your phone number
//        Add the last 7 digits of your phone number again
//        Subtract 156250
//        Divide the number by 2.
        ConsoleIO.printLine("Here's another math trick for you!");
        // Prompt user to enter their phones area code
        long x;
        ConsoleIO.print("Enter the area code of your phone number: ");
        x = ConsoleIO.readLong();

        // Multiply by 128
        x = x * 128;
        ConsoleIO.printLine("Your area code multiplied by 128: " + x);
        Thread.sleep(1000);

        // Add 1
        x = x + 1;
        ConsoleIO.printLine("... Plus 1: " + x);
        Thread.sleep(1000);

        // Multiply by 156250
        x = x * 156250;
        ConsoleIO.printLine("... Multiplied by 156250: " + x);
        Thread.sleep(1000);

        // Prompt user to enter the last 7 digits of their phone number
        long y;
        ConsoleIO.print("Now enter the rest of your phone number (The last 7 digits): ");
        y = ConsoleIO.readLong();


        // Add last 7 of phone number
        x = x + y;
        ConsoleIO.printLine("Our working number with the last 7 digits added: " + x);
        Thread.sleep(1000);


        // Add last 7 of phone number again
        x = x + y;
        ConsoleIO.printLine("... The last 7 added once more: " + x);
        Thread.sleep(1000);


        // Subtract 156250
        x = x - 156250;
        ConsoleIO.printLine("... 156250 subracted from running number: " + x);
        Thread.sleep(1000);

        // Divide number by 2
        x = x / 2;


        // Print result
        ConsoleIO.printLine("... And divided by 2... Does this number look familiar?: " + x);



    }
}
