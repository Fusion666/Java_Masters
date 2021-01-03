public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean sleepAwake = false ;
        if((( hourOfDay == 23) && barking == true) || ((hourOfDay >= 0 && hourOfDay < 8)
                && barking == true)) {
            sleepAwake = true;
        }
        return sleepAwake;
    }
}