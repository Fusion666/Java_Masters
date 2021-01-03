public class MinutesYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long years = minutes / 525_600;
            long remainderMinutesFromYears = minutes % 525_600;
            long remainderDays = remainderMinutesFromYears / 1440;
            System.out.println(minutes + " min" + " = " + years + " y and " + remainderDays + " d");
        }
    }
}
