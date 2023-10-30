package homework_nine;

public class Main {
  public static void main(String[] args) {
    Box box = new Box();
    ConsoleIO.printLine("Enter the width of your box in feet.");
    double w = ConsoleIO.readDouble();
    box.setWidth(w);

    ConsoleIO.printLine("Enter the height of your box in feet.");
    double h = ConsoleIO.readDouble();
    box.setHeight(h);

    ConsoleIO.printLine("Enter the depth of your box in feet.");
    double d = ConsoleIO.readDouble();
    box.setDepth(d);

    double v = box.getVolume();
    ConsoleIO.printLine("The volume of your box is " + v+ " cubic feet.");

  }
}
