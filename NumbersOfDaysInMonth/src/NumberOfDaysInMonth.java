public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year) {

        int days = 0;

        if((month < 1) || (month > 12)){
            return -1;
        }
        if((year < 1) || (year > 9999)){
            return -1;
        }
        if(isLeapYear(year)){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 2:
                    days = 29;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                break;
            }
            System.out.println("Leap year");
        }
        else {
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                break;
                case 2:
                    days = 28;
                break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                break;
            }
            System.out.println("Not Leap Year");
        }
        //System.out.println(days);
        return days;
    }
}
