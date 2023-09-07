import java.io.Console;
// Name: Brahm Van Houzen
// Resources: Na
public class DanceClub {
    public static void main(String[] args) {

        //Print out the dance club name
        ConsoleIO.printLine("Welcome to The Club!");
        ConsoleIO.printLine("How old are you?");

        int age;
        age = ConsoleIO.readInt();

        //Ask for the age (re-ask if less than zero)
        while (age < 0 ) {
            ConsoleIO.printLine("Please enter a valid age over 0.");
            age = ConsoleIO.readInt();
        }

        //Ask for the coolness factor (re-ask if greater than 10)
        ConsoleIO.printLine("What is your coolness factor? (10 max).");

        int coolnessFactor;
        coolnessFactor = ConsoleIO.readInt();

        while (coolnessFactor > 10 || coolnessFactor < 0) {
            ConsoleIO.printLine("Please enter a valid number 0 to 10.");
            coolnessFactor = ConsoleIO.readInt();
        }

        //Tell them if they are welcome or not
        if (age >= 21 && coolnessFactor > 5) {
            ConsoleIO.printLine("Come on in! Feel free to head over to the bar and grab a drink. ");
        }else if (age >= 18 && coolnessFactor > 5) {
            ConsoleIO.printLine("You are invited! Come on in.");
        } else if (coolnessFactor <= 5 && age >= 18) {
            ConsoleIO.printLine("Sorry, you're not cool enough to come in. See ya!");
        }  else {
            ConsoleIO.printLine("Sorry, you're not old enough to come in. See ya!");
        }


    }
}
