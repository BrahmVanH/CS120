//*****************************//
//*****************************//
//**                         **//
//** DO NOT MODIFY THIS FILE **//
//**                         **//
//*****************************//
//*****************************//


/**
 * This utility class provides basic functionality for writing a change dispenser.
 */
public class Coins {
    private Coins() {}

    /**
     * Takes a number of cents to make change for, and returns the number
     * of coins required to make change for that amount.  This follows the greedy algorithm
     * for making change: taking the greatest number of quarters before dimes, greatest number
     * of dimes before taking nickels, etc.
     *
     * @param cents the number of cents to make change for.
     * @return the number of coins required to make change for the given number of cents.
     */
    public static int numberOfCoinsFor(int cents) {
        int ret = 0;
        ret += cents / 25;
        cents %= 25;
        ret += cents / 10;
        cents %= 10;
        ret += cents / 5;
        cents %= 5;
        ret += cents;
        return ret;
    }

    /**
     * Dispenses a quarter from the cash register - this is simulated by printing it out on the screen, and sounding a beep (if requested).
     *
     * @param beep whether or not to emit a beep when the quarter is dispensed.  True emits a beep, false means no beep.
     */
    public static void dispenseQuarter(boolean beep) {
        System.out.println("/--\\");
        System.out.println("|25|");
        System.out.println("\\--/\n");
        if (beep) beep();
    }

    /**
     * Dispenses a dime from the cash register - this is simulated by printing it out on the screen, and sounding a beep (if requested).
     *
     * @param beep whether or not to emit a beep when the dime is dispensed.  True emits a beep, false means no beep.
     */
    public static void dispenseDime(boolean beep) {
        System.out.println("/--\\");
        System.out.println("|10|");
        System.out.println("\\--/\n");
        if (beep) beep();
    }

    /**
     * Dispenses a nickel from the cash register - this is simulated by printing it out on the screen, and sounding a beep (if requested).
     *
     * @param beep whether or not to emit a beep when the nickel is dispensed.  True emits a beep, false means no beep.
     */
    public static void dispenseNickel(boolean beep) {
        System.out.println("/-\\");
        System.out.println("|5|");
        System.out.println("\\-/\n");
        if (beep) beep();
    }

    /**
     * Dispenses a penny from the cash register - this is simulated by printing it out on the screen, and sounding a beep (if requested).
     *
     * @param beep whether or not to emit a beep when the penny is dispensed.  True emits a beep, false means no beep.
     */
    public static void dispensePenny(boolean beep) {
        System.out.println("/-\\");
        System.out.println("|1|");
        System.out.println("\\-/\n");
        if (beep) beep();
    }

    private static void beep() {
        System.out.println("\007");
        try{Thread.currentThread().sleep(333);}catch(Exception e){}
    }


}