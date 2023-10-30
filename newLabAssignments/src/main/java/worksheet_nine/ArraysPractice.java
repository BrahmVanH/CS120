package worksheet_nine;

import homework_eight.ConsoleIO;

public class ArraysPractice {
  public static void main(String[] args) {
    //Declare an array of doubles. Set it to be an array of length 100. 
    double[] doubleArr = new double[100];

    //Declare an array of ints, and make it an array of length 20000. 
    int[] intArr = new int[20000];

    //Declare an array of booleans. Set it to be a new array of length 10.
    boolean[] boolArr = new boolean[10]; 

    //Declare another array of ints, this time with only 3 elements. 
    int[] shortIntArr = new int[3];

    //Set the elements to be 35, 77, and 89.
    shortIntArr[0] = 35;
    shortIntArr[1] = 77;
    shortIntArr[2] = 89;

 
    //Finally, print the last element of the array.
    ConsoleIO.printLine(shortIntArr[2]);
  }
}


