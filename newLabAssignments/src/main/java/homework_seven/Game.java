package homework_seven;

import homework_five.ConsoleIO;

public class Game {
  private int stonesRemaining;

  public Game(int stones) {
    stonesRemaining = stones;
  }

  public int getNumberOfStonesRemaining() {
    return stonesRemaining;
  }

  // print number of stones remaining - syntax corrected
  public void printRemainingStones() {
    if (stonesRemaining > 1 || stonesRemaining == 0) {
      ConsoleIO.printLine("There are " + stonesRemaining + " stones left in the pot");
    } else {
      ConsoleIO.printLine("There is " + stonesRemaining + " stone left in the pot");
    }
  }
  
  public void takeStone(int stonesRemoved) {
    while (stonesRemoved > 4 || stonesRemoved < 1) {
      ConsoleIO.printLine("Please choose a number between 1 and 4");
      stonesRemoved = ConsoleIO.readInt();
    }
    while (stonesRemoved > stonesRemaining) {
      ConsoleIO.printLine("There aren't that many stones left in the pot, please choose an ");
      ConsoleIO.printLine("appropriate number.");
      stonesRemoved = ConsoleIO.readInt();
    }
    stonesRemaining = stonesRemaining - stonesRemoved;
  }
  


}
