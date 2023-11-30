package homework_eleven;

import homework_eight.ConsoleIO;

public class GolfSwingFaults {

  public static void main(String[] args) {
    String[] userSwing = new String[2];

    ConsoleIO.printLine("Is your golf swing left-handed or right-handed? \n1) Left Handed \n2) Right Handed  ");
    int userSwingChoice = ConsoleIO.readInt();

    if (userSwingChoice == 1) {
      userSwing[0] = "left";
      userSwing[1] = "right";
    } else if (userSwingChoice == 2) {
      userSwing[0] = "right";
      userSwing[1] = "left";

    }

    String[] symptoms = new String[7];
    symptoms[0] = "The ball flies high and curves " +userSwing[0];
    symptoms[1] = "The ball flies low and curves " +userSwing[1];
    symptoms[2] = "You ball flies " +userSwing[0];
    symptoms[3] = "You ball flies " +userSwing[1];
    symptoms[4] = "I top the ball or miss completely";
    symptoms[5] = "The club twists or vibrates";
    symptoms[6] = "I throw the club in anger";

    String[] causes = new String[7];
    causes[0] = "Your clubface is open on impact.";
    causes[1] = "Your clubface is closed on impact";
    causes[2] = "You have an in-to-out swing path.";
    causes[3] = "You have an out-to-in swing path.";
    causes[4] = "You are probably not maintaining a steady spine angle.";
    causes[5] = "You are missing the sweet spot on the clubface.";
    causes[6] = "You forgot to take a deep breath. Remember: it's just a game.";


    
    
    for (int i = 0; i < 7; i++) {
      ConsoleIO.printLine(i+ ") " +symptoms[i]);
    }

    ConsoleIO.printLine("Please choose your golf swing symptom from above and enter the option number.");
    int userChoice = ConsoleIO.readInt();

    while (userChoice < 0 || userChoice > 6) {
      ConsoleIO.printLine("Please enter a valid choice");
    }

    if (userChoice >= 0 && userChoice < 7) {

      ConsoleIO.printLine(causes[userChoice]);
    }

  }

}
