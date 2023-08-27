//Name: [put your name here]
//References (books, websites, people): TODO: write in later
public class MathTrick {
    public static void main(String[] args) {
        // User input positive integer
        int x;
        x = 5;
        System.out.println("Initial positive integer: " + x);
        // Square user input integer
        int y;
        y = x * x;
        System.out.println("Initial integer squared: " + y);
        // Add result to original
        y = y + x;
        System.out.println("Squared integer plus initial integer: " + y);
        // Divide by original number
        y = y / x;
        System.out.println("New value divided by initial integer: " + y);
        // Add 17
        y = y + 17;
        System.out.println("New value plus 17: " + y);
        // Subtract original number
        y = y - x;
        System.out.println("New value minus initial integer: " + y);
        // Divide by six
        y = y / 6;
        // Number result should be 3
        System.out.println("New value divided by six, should result in 3");
        System.out.println(y);

    }
}