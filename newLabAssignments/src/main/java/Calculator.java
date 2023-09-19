// Name: Brahm Van Houzen
// Resources: Na

public class Calculator {
  public static void main(String[] args) {
    boolean continueCalculating = true;

    while (continueCalculating) {

      // Ask user what type of calculation they would like to do
      ConsoleIO.printLine("What calculation would you like to perform?");
      ConsoleIO.printLine("   1. Add\n   2. Subtract\n   3. Multiply\n   4. Divide\n   5. Power\n   6. Square root");
      int selectedOperation = ConsoleIO.readInt();

      // Ask user for their first number
      ConsoleIO.printLine("What is your first number?");
      double x = ConsoleIO.readDouble();

      // Ask user for their second number if they aren't calculating powers
      double y = 0;
      if (selectedOperation != 6) {
        ConsoleIO.printLine("What is your second number?");
        y = ConsoleIO.readDouble();
      }

      // Calculate
      double result;
      if (selectedOperation == 1) {
        result = x + y;
      } else if (selectedOperation == 2) {
        result = x - y;
      } else if (selectedOperation == 3) {
        result = x * y;
      } else if (selectedOperation == 4) {
        result = x / y;
      } else if (selectedOperation == 5) {
        result = Math.pow(x, y);
      } else {
        result = Math.sqrt(x);
      }
      // Print answer
      ConsoleIO.printLine(result);

      ConsoleIO.printLine("Would you like to keep calculating?");
      ConsoleIO.printLine("   1. Yes\n   2. No");
      int userContinueSelection = ConsoleIO.readInt();

      if (userContinueSelection == 2) {
        continueCalculating = false;
      }

    }

  }
}
