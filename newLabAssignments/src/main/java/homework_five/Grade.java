
package homework_five;

import lab_ten.ConsoleIO;

// Name: Brahm Van Houzen
// Resources: Na

import java.math.*;
import java.text.*;

public class Grade {
  public static void main(String[] args) {
    //Instantiate deimalFormatter 
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    //Declare variables
    double total = 0.0;
    double averageGrade;
    double grade = 0.0;
    double highestGrade = 0;
    String letterGrade;
    double gradePoint;
    String formattedGradePoint;
    int numberOfGrades;
    int counter = 0;

    ConsoleIO.printLine(
        "This program will give you the average of all entered numerical grades, grade-point, and a letter grade.");
    ConsoleIO.printLine("How many grades would you like to enter?");
    numberOfGrades = ConsoleIO.readInt();

    //Loop through user input to take in user-declared number of grade values
    while (counter < numberOfGrades) {
      ConsoleIO.printLine("Enter next grade...");
      //Define grade as user-input grade value
      grade = ConsoleIO.readDouble();
      //Add user-entered grade to total
      total += grade;
      //Evaluate if user-entered grade is higher than previously input grades
      if (grade > highestGrade) {
        highestGrade = grade;
      }
      //Increment 
      counter++;
    }

    //Calculate the average grade based on the total and number of grades
    averageGrade = total / numberOfGrades;
    gradePoint = (averageGrade * 0.01) * 4.0;
    formattedGradePoint = decimalFormat.format(gradePoint);

    //Determine letter grade based on average grades
    if (averageGrade < 60) {
      letterGrade = "F";
    } else if (averageGrade < 70) {
      letterGrade = "D";
    } else if (averageGrade < 80) {
      letterGrade = "C";
    } else if (averageGrade < 90) {
      letterGrade = "B";
    } else {
      letterGrade = "A";
    }

    
    //Print grade information to user
    ConsoleIO.printLine("The average of all entered grades is: " + averageGrade+ ". With " +highestGrade+ " being the highest grade.");
    ConsoleIO.printLine("This is a " + formattedGradePoint + " grade-point on a 4-point scale.");
    ConsoleIO.printLine("Letter grade: " + letterGrade);
    
  }
}