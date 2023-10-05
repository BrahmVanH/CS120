package worksheet_six;

import java.io.Console;

import homework_five.ConsoleIO;

//Name: Brahm Van Houzen
//Resources: Na

public class Utility {
 

public static String getWordFor(int x) {
  if (x < 0) {
    return "Negative";
  } else if (x == 0) {
    return "Zero";
  } else if (x > 1) {
    return "Many";
  } else {
    return "One";
  }
}


public static void printWordFor(int y) {
  String word = Utility.getWordFor(y);
  ConsoleIO.printLine(word);
}

public static boolean canVote(int z) {
  if (z >= 18) {
    return true;
  } else {
    return false;
  }
}


public static void main(String[] args) {
  int x = -43;
  int z = 23;
  String wordFor = Utility.getWordFor(x);
  ConsoleIO.printLine("Word for -43 is: " +wordFor);
  Utility.printWordFor(x);
  boolean canTheyVote = Utility.canVote(z);
  ConsoleIO.printLine("It is " +canTheyVote+ "that someone can vote at " +z+ "years old");

}
 
}
