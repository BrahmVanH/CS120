package homework_eight;

import homework_five.ConsoleIO;

// Name: Brahm Van Houzen
// Resources: Na
public class Main {
  public static void main(String[] args) {
    ConsoleIO.printLine("This program will calculate the distance between two points.");
    ConsoleIO.printLine("Please enter the coordinates of your two points: ");
    ConsoleIO.print("x1: ");
    double x1 = ConsoleIO.readDouble();
    ConsoleIO.print("y1: ");
    double y1 = ConsoleIO.readDouble();
    ConsoleIO.print("x2: ");
    double x2 = ConsoleIO.readDouble();
    ConsoleIO.print("y2: ");
    double y2 = ConsoleIO.readDouble();

    double distance = Cartesian.distance(x1, y1, x2, y2);
    double manhattanDistance = Cartesian.manhattanDistance(x1, y1, x2, y2);

    ConsoleIO.printLine("The distance between the two points is " + distance);
    ConsoleIO.printLine("Using Manhattan Geometry, the distance is: " + manhattanDistance);

  }
}
