public class GetDurationString {
    public static String getDurationString(int minutes, int seconds) {
        if((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            System.out.println("Invalid Value");
        }
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;
        return hours + "hours " + remainderMinutes + " minutes " + seconds + " seconds";
    }
    public static String getDurationString(int seconds){
        if(seconds < 0) {
            System.out.println("Invalid Value");
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }
}
