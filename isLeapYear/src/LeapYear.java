public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean leapOrNot = false;
        if(year >= 1 && year < 9999){
            if(((year % 100) == 0) && ((year % 400) != 0)) {
                return leapOrNot;
            }
            else if (((year % 4) == 0) ){
                leapOrNot = true;
            }
        }
        return leapOrNot;
    }
}