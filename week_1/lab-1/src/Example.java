
// Import the Scanner utility from java util
import java.util.Scanner;
public class Example {
    public static void main (String[] args){
        // Instantiate a new scanner using system.in from the console
        // Program reads user input from console
        Scanner areaCalculator = new Scanner(System.in);

        // Initialize pi variable and set to value of pi
        double pi = 3.1459;

        System.out.println("Please enter a radius to calculate the area of the circle");

        // Declare radius variable with instance of areaCalculator
        double radius = areaCalculator.nextDouble();

        // Declare area variable and set value to area of square expression
        double area = (radius * radius) * pi;

        // Print value of area to console
        System.out.println("The area is " + area);

    }
}
