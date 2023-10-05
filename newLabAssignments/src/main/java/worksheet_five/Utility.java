package worksheet_five;

import homework_five.ConsoleIO;

//Name: Brahm Van Houzen
//Resources: Na

public class Utility {

  // Write a class named Utility. It should have four methods:
  // Write a method that prints out the word "Pancakes".

  public static void pancakePrinter() {
    ConsoleIO.printLine("Pancakes");
  }

  // Write a method that takes a String parameter (from the caller) and prints it
  // out 3 times.
  public static void printInputAsString(String input) {
    ConsoleIO.printLine(input);
    ConsoleIO.printLine(input);
    ConsoleIO.printLine(input);

  }

  // Write a method that converts from Fahrenheit to Celsius. The formula for this
  // is: (f - 32) / 180.0 * 100.0. The method should receive a value from the
  // caller in Fahrenheit and return a value in Celsius.
  public static double tempInCelsius(double tempInFahrenheit) {
    return (tempInFahrenheit - 32) / 180.0 * 100;
  }
  // Write a method that takes two doubles, multiples them together, and returns
  // the result.

  public static double productOfTwoDoubles(double x, double y) {
    return x * y;
  }
  // Write a main class that calls each of these four methods, providing values
  // where needed. For the third and fourth methods, you should have variables in
  // main to receive the return values.

  public static void main(String[] args) {
    Utility.pancakePrinter();
    String inputString = "string";
    Utility.printInputAsString(inputString);
    double tempInFahrenheit = 32.0;
    double tempInCelsius = Utility.tempInCelsius(tempInFahrenheit);
    ConsoleIO.printLine(tempInFahrenheit+ "degrees fahrenheit in Celsius is " + tempInCelsius+ " degrees" );
    double x = 5.6;
    double y = 7.0;
    double product = Utility.productOfTwoDoubles(x, y);
    ConsoleIO.printLine("Product of " +x+ " and " +y+ " is " + product);
  }
}
