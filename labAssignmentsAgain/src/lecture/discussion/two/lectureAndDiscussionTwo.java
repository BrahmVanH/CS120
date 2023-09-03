package lecture.discussion.two;
public class lectureAndDiscussionTwo {
    public static void main(String[] args) {
        // Calling getPositiveInt method by using Utility class as prefix from Utility class file
        int j = Utility.getPositiveInt();
        ConsoleIO.printLine("The valid value was: " + j);

        int age = Utility.getPositiveInt();
        ConsoleIO.printLine("The valid value was: " + age);

        age = age + 1;
        // Calling getPi method from Utility class
        double pi = Utility.getPi();
        ConsoleIO.printLine(pi);
        // Calling getCurentTime from Utility class
        String date = Utility.getCurrentTime();
        ConsoleIO.printLine(date);

        String ip = Utility.getIP();
        ConsoleIO.printLine(ip);
        // Calls ghostPrintLine method that utilizes the .sleep() method for dramatic effect
        Utility.ghostPrintLine("So...we meet again...BATMAN");


    }
}
