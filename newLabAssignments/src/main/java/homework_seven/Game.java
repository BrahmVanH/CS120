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

  public void takeStone(int numberOfStones) {
    stonesRemaining = stonesRemaining - numberOfStones;
  }
}
