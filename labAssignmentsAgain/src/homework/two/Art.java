package homework.two;

//********************************
//****DO NOT MODIFY THIS FILE:****
//********************************

//All ASCII art courtesy of retrojunkie.com

public class Art {
    public static void printCat() {
        ConsoleIO.printLine(".--.");
        ConsoleIO.printLine("'-. \\            |\\\\_");
        ConsoleIO.printLine("   \\ \\           /  a'.");
        ConsoleIO.printLine("    \\ \\__..---../  ,__/");
        ConsoleIO.printLine("     \\             |");
        ConsoleIO.printLine("     |            /");
        ConsoleIO.printLine("     /\\ \\-\"\"\"-'\\ \\ \\");
        ConsoleIO.printLine("    / / /_      \\ \\ \\_");
        ConsoleIO.printLine(" jgs\\_\\___)      \\__)_)");
    }

    public static void printClock() {
        ConsoleIO.printLine("           .-.-.");
        ConsoleIO.printLine("      ((  (__I__)  ))");
        ConsoleIO.printLine("        .'_....._'.");
        ConsoleIO.printLine("       / / .12 . \\ \\");
        ConsoleIO.printLine("      | | '  |  ' | |");
        ConsoleIO.printLine("      | | 9  /  3 | |");
        ConsoleIO.printLine("       \\ \\ '.6.' / /");
        ConsoleIO.printLine("        '.`-...-'.'");
        ConsoleIO.printLine("    jgs  /'-- --'\\");
        ConsoleIO.printLine("        `\"\"\"\"\"\"\"\"\"`");
    }

    public static void printBooks() {
        ConsoleIO.printLine("       /-/--/-/|");
        ConsoleIO.printLine("      /_/__/_/ |");
        ConsoleIO.printLine("      |=|==|=| |");
        ConsoleIO.printLine("      | |  | | |");
        ConsoleIO.printLine("      | |  | | |");
        ConsoleIO.printLine("      | |  | | |");
        ConsoleIO.printLine("  jgs | |  | | /");
        ConsoleIO.printLine("      |=|==|=|/");
        ConsoleIO.printLine("      `\"`\"\"`\"`");
    }

    public static void printSquare(int size) {
        printFilledSquare(size, " ");
    }

    public static void printFilledSquare(int size, String filler) {
        printFilledRectangle(size, size, filler);
    }

    public static void printRectangle(int width, int height) {
        printFilledRectangle(width, height, " ");
    }

    public static void printFilledRectangle(int width, int height, String filler) {
        int r = 0;
        if (filler == null || filler.equals("")) {
            filler = " ";
        }

        for(int x = 0; x < width; x++) {
            ConsoleIO.print("-");
        }
        ConsoleIO.printLine();
        for(int y = 0; y < height-2; y++) {
            ConsoleIO.print("|");
            for(int x = 0; x < width-2; x++) {
                ConsoleIO.print(filler.substring(r,r+1));
                r = (r + 1) % filler.length();
            }
            ConsoleIO.print("|");
            ConsoleIO.printLine();
        }
        for(int x = 0; x < width; x++) {
            ConsoleIO.print("-");
        }
        ConsoleIO.printLine();
    }

    public static void printSign(String title, int borderWidth) {
        for(int j = 0; j < borderWidth; j++) {
            for(int i = 0; i <= title.length() + 2*borderWidth - 1; i++) {
                ConsoleIO.print("#");
            }
            ConsoleIO.printLine();
        }
        for(int i = 0; i < borderWidth; i++) {
            ConsoleIO.print("#");
        }
        ConsoleIO.print(title);
        for(int i = 0; i < borderWidth; i++) {
            ConsoleIO.print("#");
        }
        ConsoleIO.printLine();
        for(int j = 0; j < borderWidth; j++) {
            for(int i = 0; i <= title.length() + 2*borderWidth - 1; i++) {
                ConsoleIO.print("#");
            }
            ConsoleIO.printLine();
        }
    }

}
