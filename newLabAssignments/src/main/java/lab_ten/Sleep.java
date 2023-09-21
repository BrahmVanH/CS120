package lab_ten;

public class Sleep {
  // Each hour of sleep lost = drop one IQ point
  // Each subsequent lost hour = drop two IQ points each hour

  // Method that takes in an integer - number of hours of sleep missed - and returns the associated IQ point drop
  public static int iqLoss(int hoursOfSleepMissed) {
    int iqPointsLost = 0;
    if (hoursOfSleepMissed == 1) {
      iqPointsLost = 1;
    } else if (hoursOfSleepMissed > 1) {
      iqPointsLost = ((hoursOfSleepMissed - 1) * 2) + 1;
    }
    
    return iqPointsLost;
  
  }

  // static method that request number of hours slept 0-24, parameter totalHoursOfSleep, return hoursOfSleepMissed

  public static int hoursMissed(int totalHoursOfSleep) {
    int diffInSleepValues;

    if (8 - totalHoursOfSleep > 0) {
      diffInSleepValues = 8 - totalHoursOfSleep;
    } else {
      diffInSleepValues = 0;
    }

    return diffInSleepValues;
  }
  // Takes in the parameter nightsBack, the number of nights ago we are inquiring about, returns number of hours of sleep
  // Returns total hours of sleep 
  public static int inquireHoursOfSleep(int nightsBack) {
    int totalHours;
    if (nightsBack == 1) {
      ConsoleIO.printLine("How much sleep did you get last night?");
      totalHours = ConsoleIO.readInt();

    } else {
      ConsoleIO.printLine("How many hours of sleep did you get " +nightsBack+ " nights ago");
      totalHours = ConsoleIO.readInt();
      
    }
    return totalHours;
  }

}
