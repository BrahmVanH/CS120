package homework_nine;
// The purpose of this file is to test to see if the Box class is working correctly.
// Run this to see if it detects any errors in Box.java

public class BoxTest {
  public static void main(String[] args) {
		Box b = new Box();
		b.setWidth(10);
		b.setHeight(10);
		b.setDepth(10);

		Box c = new Box();
		c.setWidth(4.4);
		c.setHeight(5.5);
		c.setDepth(6.6);

		double firstVolume = b.getVolume();
		double secondVolume = c.getVolume();
		double delta = .000001; //I use this to allow for possible roundoff error

		boolean itWorks = true; //so far at least
		if (Math.abs(firstVolume - 1000) > delta) {
			ConsoleIO.printLine("First getVolume() test failed: 10 * 10 * 10 != " + firstVolume);
			itWorks = false;
		}
		if (Math.abs(secondVolume - 159.72) > delta) {
			ConsoleIO.printLine("Second getVolume() test failed: 4.4 * 5.5 * 6.6 != " + secondVolume);
			itWorks = false;
		}
		if (itWorks) {
			ConsoleIO.printLine("All tests passed.");
		}
	}
}