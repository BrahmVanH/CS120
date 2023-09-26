package lab_eleven;

import homework_five.ConsoleIO;

import java.text.*;

public class Goalie {

  DecimalFormat decimalFormat = new DecimalFormat("0.0");

  String name;
  int goalsAgainst;
  int numberOfSaves;

  public String saveRate(int numberOfSaves, int goalsAgainst) {
    ConsoleIO.printLine("saves and goals against " +numberOfSaves + goalsAgainst);
    double totalShots = numberOfSaves + goalsAgainst;
    ConsoleIO.printLine("Total shots " +totalShots);
    if (totalShots > 0) {
      double savePercentage = (numberOfSaves / totalShots)*100;
      return decimalFormat.format(savePercentage);
    } else {
      return "0.0";
    }
    
  }
}