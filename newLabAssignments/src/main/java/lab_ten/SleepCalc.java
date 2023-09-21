package lab_ten;

import java.io.Console;

public class SleepCalc {
  public static void main(String[] args) {

    // Introduce program
    ConsoleIO.printLine(
        "This is a program that calculates the total IQ point drop, or lackthereof, associated with 3 nights of sleep");

    ConsoleIO.printLine(
        "This is based on Stanley Cohens sleep debt model outlined in 'Sleep Thieves' and makes the audacious assumption that everyone needs the same amount of sleep every night (8 Hours)");

    int nightOneSleep;
    int nightTwoSleep;
    int nightThreeSleep;

    // Call Sleep.iqDrop three times (three nights worth of sleep)
    nightOneSleep = Sleep.inquireHoursOfSleep(3);

    nightTwoSleep = Sleep.inquireHoursOfSleep(2);

    nightThreeSleep = Sleep.inquireHoursOfSleep(1);

    // Calculate total amount of sleep lost for each night

    int nightOneSleepLoss = Sleep.hoursMissed(nightOneSleep);
    int nightTwoSleepLoss = Sleep.hoursMissed(nightTwoSleep);
    int nightThreeSleepLoss = Sleep.hoursMissed(nightThreeSleep);

    int nightOneIqDrop = Sleep.iqLoss(nightOneSleepLoss);
    int nightTwoIqDrop = Sleep.iqLoss(nightTwoSleepLoss);
    int nightThreeIqDrop = Sleep.iqLoss(nightThreeSleepLoss);

    // Return total amount of iqLoss for all three nights

    int totalIqDrop = nightOneIqDrop + nightTwoIqDrop + nightThreeIqDrop;

    ConsoleIO.printLine("Your total IQ drop for the last three nights of sleep is " + totalIqDrop + " points.");
  }
}