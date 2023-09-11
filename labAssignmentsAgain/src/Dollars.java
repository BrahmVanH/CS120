public class Dollars {


    // Takes in a long, dollars, and returns the amount of bills required to make that change
    // Beings with the dollars entered by user, and increments through smaller bills
    // to increase the amount of bills returned as ret

    // @param dollars the number of dollars to make change for
    // @return the number of bills required to make change for the given number of bills
    public static int numberOfBillsFor(long dollars) {
        int ret = 0;
        ret += dollars / 100;
        dollars %= 100;
        ret += dollars / 50;
        dollars %= 50;
        ret += dollars / 20;
        dollars %= 20;
        ret += dollars / 10;
        dollars %= 10;
        ret += dollars / 5;
        dollars %= 5;
        ret += dollars;
        return ret;
    }

    // Dispenses a $100 bill from the cash register and beeps if requested
    // @param beep whether to emit a beep when a bill is dispensed

    public static void dispenseHundred(boolean beep) {
        System.out.println("|---------|");
        System.out.println("|---100---|");
        System.out.println("|---------|");
        if (beep) beep();
    }

    public static void dispenseFifty(boolean beep) {
        System.out.println("|--------|");
        System.out.println("|---50---|");
        System.out.println("|--------|");
        if (beep) beep();
    }

    public static void dispenseTwenty(boolean beep) {
        System.out.println("|--------|");
        System.out.println("|---20---|");
        System.out.println("|--------|");
        if (beep) beep();
    }

    public static void dispenseTen(boolean beep) {
        System.out.println("|--------|");
        System.out.println("|---10---|");
        System.out.println("|--------|");
        if (beep) beep();
    }


    public static void dispenseFive(boolean beep) {
        System.out.println("|---------|");
        System.out.println("|----5----|");
        System.out.println("|---------|");
        if (beep) beep();
    }public static void dispenseOne(boolean beep) {
        System.out.println("|---------|");
        System.out.println("|----1----|");
        System.out.println("|---------|");
        if (beep) beep();
    }

    private static void beep() {
        System.out.println("\007");
        try{Thread.currentThread().sleep(333);}catch(Exception e){}
    }
}
