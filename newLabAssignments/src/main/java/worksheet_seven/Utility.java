package worksheet_seven;

import lab_ten.ConsoleIO;

public class Utility {
//   Practice writing and calling static methods; start by creating a main class and a utility class.
// Write a method called predictMyFuture in the utility class. The method should just print out to the console, “fame and fortune”. Call it from main.
public static void predictMyFuture() {
  ConsoleIO.printLine("Fame and fortune");
}
// Write a method called tripleMyNumber in the utility class. It should take a single double parameter, and return (not print) triple the value of that number. Call it from main, telling it to triple the number 18.5, and print out the result from your main program.
public static double tripleMyNumber(double a) {
  return a*3;
}
// Write a method called cheatCode in the utility class. It should take a String parameter and return a boolean value. If the string given is equal to “iddqd” then return true, otherwise return false. Recall that unlike int and double (which we compare using ==) we compare strings like this: if (myStringVariable.equals("yes")) {
// Write a method called average in the utility class. It should take two double parameters, and return a double value which is the average of the two. In main, use your average method to compute the average of 98.6 and 101.2, and print it out.
}
