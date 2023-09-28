package lab_twelve;

import homework_five.ConsoleIO;

//Name: Brahm Van Houzen
//Sources: Na

import java.text.*;

public class Orchard {
  //Main Class
  public static void main(String[] args) {
    // Format dollar figures to two decimals
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    Orchard orchard = new Orchard();

    orchard.addTree(30);

    double currentAppleSales = orchard.calcAppleSales(0.50);
    String currentAppleSalesString = decimalFormat.format(currentAppleSales);
    ConsoleIO.printLine("Based on a price of $0.50 per pound of apples, you will make $" +currentAppleSalesString+ " in apple sales.");

    orchard.chopTree();
    orchard.chopTree();

    double currentCiderSales = orchard.calcCiderSales(7.50);
    String currentCiderSalesString = decimalFormat.format(currentCiderSales);
    ConsoleIO.printLine("Based on a price of $7.50 per gallon of apple cider, you will make $" +currentCiderSalesString+ " in cider sales.");


  }

  // Variables and methods 
  private int trees;

  /**
   * 
   * This adds the provided number of trees to the current value of 'trees'
   * 
   * @param addedTrees a integer value representing the number of trees to add to
   *                   'trees'
   */
  public void addTree(int addedTrees) {
    trees += addedTrees;
  }

  /**
   * This reduces the value of trees by 1
   */
  public void chopTree() {
    trees = trees - 1;
  }

  /**
   * 
   * This calculates the total dollar value of the current quantity of apple trees
   * in the 'trees' variable
   * 
   * @param pricePerPound This is a double value that represents the price per
   *                      pound of apples
   * @return The total value in dollars of apples from harvest
   */
  public double calcAppleSales(double pricePerPound) {
    return (trees * 200) * pricePerPound;
  }

  /**
   * 
   * This calculates the total dollar value of the volume of cider that can be
   * produced from the current quantity
   * of apple trees in the 'trees' variable
   * 
   * @param pricePerGallon This is a double that represents the price per gallon
   *                       of cider
   * @return The total value in dollars of cider from harvest
   */
  public double calcCiderSales(double pricePerGallon) {
    return (trees * 15) * pricePerGallon;
  }


}
