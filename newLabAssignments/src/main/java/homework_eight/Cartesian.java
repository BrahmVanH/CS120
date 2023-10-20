package homework_eight;

import java.lang.Math;


public class Cartesian {
  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
  }

  public static double manhattanDistance(double x1, double y1, double x2, double y2) {
    return Math.abs((x1 - x2)) + Math.abs((y1 - y2));
  }
}
