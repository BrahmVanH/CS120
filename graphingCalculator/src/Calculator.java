import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an arithmetic expression: ");
        String expression = scanner.nextLine();

        // Split the expression into operands and operators
        String[] tokens = expression.split("(?<=[-+*/()])|(?=[-+*/()])");

        // Evaluate the expression in the order given, without regarding to the precedence of operators
        int result = Integer.parseInt(tokens);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            } else if (operator.equals("*")) {
                result *= operand;
            } else if (operator.equals("/")) {
                result /= operand;
            }
        }

        System.out.println("Result: " + result);
    }
}
