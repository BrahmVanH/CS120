public class ExampleWithConsoleIO {
    public static void main (String[] args){

        // Initialize pi variable and set to value of pi
        double pi = 3.1459;

        ConsoleIO.print("Please enter a radius to calculate the area of the circle ");

        // Declare radius variable with instance of areaCalculator
        double radius = ConsoleIO.readDouble();

        // Declare area variable and set value to area of square expression
        double area = (radius * radius) * pi;

        // Print value of area to console
        ConsoleIO.print("The area is " + area);

    }
}
