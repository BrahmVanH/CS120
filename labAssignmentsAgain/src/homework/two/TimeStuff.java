package homework.two;

//********************************
//****DO NOT MODIFY THIS FILE:****
//********************************

import java.util.*;

public class TimeStuff {
    public static String getCurrentPartOfDay() {
        int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (h < 6 || h > 22) {
            return "Night time";
        }
        else if (h < 12) {
            return "Morning";
        }
        else if (h == 12) {
            return "Noon, or just after noon";
        }
        else if (h < 17) {
            return "Afternoon";
        }
        else {
            return "Evening";
        }
    }

    public static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static String getNameOfMonth(int monthNumber) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[monthNumber-1];
    }

}

