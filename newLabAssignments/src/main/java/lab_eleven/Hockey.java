package lab_eleven;

import java.io.Console;

import lab_ten.ConsoleIO;

public class Hockey {
  public static void main(String[] args) {

    Goalie homeGoalie;
    homeGoalie = new Goalie();

    Goalie awayGoalie;
    awayGoalie = new Goalie();

    ConsoleIO.printLine("What is the name of the home team goalie?");
    homeGoalie.name = ConsoleIO.readLine();

    ConsoleIO.printLine("What is the name of the away team goalie?");
    awayGoalie.name = ConsoleIO.readLine();

    boolean run = true;

    while (run) {

      ConsoleIO.printLine("Enter a Command\n===============");
      ConsoleIO.printLine("0. Exit.");
      ConsoleIO.printLine("1. Enter a goal against " + homeGoalie.name + ".");
      ConsoleIO.printLine("2. Enter a goal against " + awayGoalie.name + ".");
      ConsoleIO.printLine("3. Enter a save made by " + homeGoalie.name + ".");
      ConsoleIO.printLine("4. Enter a save made by " + awayGoalie.name + ".");
      ConsoleIO.printLine("5. Check stats");
      int userSelect = ConsoleIO.readInt();

      while (userSelect > 5 || userSelect < 0 ) {
        ConsoleIO.printLine("Please make a valid entry");
      }

      if (userSelect == 0) {
        run = false;
      } else if (userSelect == 1) {
        homeGoalie.goalsAgainst++;
        ConsoleIO.printLine(homeGoalie.name + " has let " + homeGoalie.goalsAgainst + " goals in.");
      } else if (userSelect == 2) {
        awayGoalie.goalsAgainst++;
        ConsoleIO.printLine(awayGoalie.name + " has let " + awayGoalie.goalsAgainst + " goals in.");
      } else if (userSelect == 3) {
        homeGoalie.numberOfSaves++;
        ConsoleIO.printLine(homeGoalie.name + " has saved " + homeGoalie.numberOfSaves + " goals.");
      } else if (userSelect == 4) {
        awayGoalie.numberOfSaves++;
        ConsoleIO.printLine(awayGoalie.name + " has saved " + awayGoalie.numberOfSaves + " goals.");
      } else {
        String homeSaveRate = homeGoalie.saveRate(homeGoalie.numberOfSaves, homeGoalie.goalsAgainst);
        String awaySaveRate = awayGoalie.saveRate(awayGoalie.numberOfSaves, awayGoalie.goalsAgainst);

        ConsoleIO.printLine(homeGoalie.name + " has saved " + homeGoalie.numberOfSaves + " of "
            + (homeGoalie.numberOfSaves + homeGoalie.goalsAgainst) + " shot(s) on net. A " +homeSaveRate+ "% save rate.");
        
        ConsoleIO.printLine(awayGoalie.name + " has saved " + awayGoalie.numberOfSaves + " of "
            + (awayGoalie.numberOfSaves + awayGoalie.goalsAgainst) + " shot(s) on net. A " +awaySaveRate+ "% save rate.");
      }
    }
  }
}