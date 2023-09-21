package lab_eleven;

import java.io.Console;

import lab_ten.ConsoleIO;

public class Hockey {
  public static void main(String[] args) {

    Goalie home;
    home = new Goalie();

    ConsoleIO.printLine("What is the name of the home team goalie?");
    home.name = ConsoleIO.readLine();
  }
}