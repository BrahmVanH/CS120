//Data types:
//int		integer (3, 7, -9, 0)
//long		same as int, but more range
//double	numbers with a decimal point (3.8, -0.7, 1.0, 0.0)
//String	text
//boolean	(true or false)

//control structures (if statements, while loops)
//arithmetic operations (/, *, +, -) - order of operations
//functions calls (aka static method calls, subroutine calls)

public class QuadraticProgram {
	public static void main(String[] args) {
		//Tell the user that we are solving the quadratic.
		ConsoleIO.printLine("I am going solve for x, in the formula:");
		ConsoleIO.printLine("  a x^2 + b x + c = 0");

		//Declare variables for a, b, and c.
		double a;
		double b;
		double c;

		//Prompt user for values for a, b, and c.
		ConsoleIO.print("What would you like to use for a? a = ");
		a = ConsoleIO.readDouble();

		ConsoleIO.print("What would you like to use for b? b = ");
		b = ConsoleIO.readDouble();

		ConsoleIO.print("What would you like to use for c? c = ");
		c = ConsoleIO.readDouble();

		//Use the quadratic formula to determine the answer.
		if (b*b - 4*a*c >= 0) {
			double x;
			x = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);

			double x2;
			x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);

			//Print it out.
			ConsoleIO.printLine("One root is " + x);
			ConsoleIO.printLine("The other root is " + x2);
		}


		if (b*b - 4*a*c < 0) {
			ConsoleIO.printLine("No real-valued roots.");
		}
	}
}