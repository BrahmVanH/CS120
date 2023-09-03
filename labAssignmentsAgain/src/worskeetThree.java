public class worskeetThree {
    public static void main(String[] args) {

        // Part 1 - Print square root of 5.5
        double a;
        a = 5.5;
        ConsoleIO.printLine("Square root of 5.5: " + Math.sqrt(a));

        // Part 2 - Print absolute value of -8.2
        a = -8.2;
        ConsoleIO.printLine("Absolute value of -8.2: " + Math.abs(a));

        // Part 3 - Print current time in milliseconds
        long t;
        t = System.currentTimeMillis();
        ConsoleIO.printLine("Current time in milliseconds: " + t);

        // Part 4 - Print the value of os.name property
        String currentOs;
        currentOs = System.getProperty("os.name");
        ConsoleIO.printLine("Current operating system: " + currentOs);


    }
}
