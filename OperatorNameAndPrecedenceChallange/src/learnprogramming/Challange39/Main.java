package learnprogramming.Challange39;

public class Main {

    public static void main(String[] args) {
        double myDoubleVariable = 20.00d;
        double mySecondDoubleVariable = 80.00d;
        double resultDouble = (myDoubleVariable + mySecondDoubleVariable) * 100.00d;
        System.out.println("Total result is: " + resultDouble);

        double remainderFirst = resultDouble % 40.00d;
        System.out.println("Remainder is: " + remainderFirst);

        boolean wasRemainder = (remainderFirst == 0) ? true : false;
        System.out.println("wasRemainder variable is: " + wasRemainder);

        if (!wasRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
