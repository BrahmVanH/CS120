import java.io.Console;

// Name: Brahm Van Houzen
// Sources: Na
public class GuessRandomNumber {
    public static void main(String[] args) {

        // Generate random number
        int randomNumber;
        randomNumber = 1 + (int)(Math.random() * 100);


        int userGuess;
        int numberOfGuesses = 0;

        ConsoleIO.printLine("I'm thinking of a number between 1 and 100, guess it.");
        userGuess = ConsoleIO.readInt();

        while ( userGuess != randomNumber) {
            if (userGuess > 100 || userGuess <= 0) {
                ConsoleIO.printLine("Please enter a number between 1 and 100!");
                userGuess = ConsoleIO.readInt();

            } else if (userGuess < randomNumber) {

                ConsoleIO.printLine("Guess higher...");
                userGuess = ConsoleIO.readInt();
                numberOfGuesses++;

            } else {
                ConsoleIO.printLine("Guess lower...");
                userGuess = ConsoleIO.readInt();
                numberOfGuesses++;

            }
        }

        if ( userGuess == randomNumber) {
            numberOfGuesses++;
            ConsoleIO.printLine("You guessed it! The random number was " + randomNumber + ", it took " + numberOfGuesses + " guesses to get the correct number.");
        }
    }
}
