package homework.two;

//Name: Brahm Van Houzen
//Time invested: 30 minutes
//References cited: Na

import java.sql.Time;

public class Homework2 {
    public static void main(String[] args) {
        // print cat twice
        ConsoleIO.printLine("Cat:");
        Art.printCat();
        ConsoleIO.printLine("Cat:");
        Art.printCat();

        // print books once
        ConsoleIO.printLine("Books:");
        Art.printBooks();

        // print clock twice
        ConsoleIO.printLine("Clock:");
        Art.printClock();
        ConsoleIO.printLine("Clock:");
        Art.printClock();

        // print square (6)
        ConsoleIO.printLine("6 x 6 Square:");
        Art.printSquare(6);

        // print rectangle (22, 4)
        ConsoleIO.printLine("22 x 4 Rectangle:");
        Art.printRectangle(22, 4);

        // print filledSquare (10. #)
        ConsoleIO.printLine("10 x 10 Filled Square:");
        Art.printFilledSquare(10, "#");

        // print 10 x 5 filled rectangle with letter "A"
        ConsoleIO.printLine("10 x 5 'A' Filled Rectangle:");
        Art.printFilledRectangle(10, 5, "A");

        // print sign "Eat at Joe's", border width 2
        ConsoleIO.printLine("Sign with border width of 2:");
        Art.printSign("Eat at Joe's", 2);

        String d;
        d = TimeStuff.getCurrentPartOfDay();
        ConsoleIO.printLine("Current part of day: " + d);

        int currentYear;
        currentYear = TimeStuff.getCurrentYear();
        ConsoleIO.printLine("The current year is: " + currentYear);

        String nameOfMonth;
        nameOfMonth = TimeStuff.getNameOfMonth(12);
        ConsoleIO.printLine("The name of the 12th month is: " + nameOfMonth);


    }
}

