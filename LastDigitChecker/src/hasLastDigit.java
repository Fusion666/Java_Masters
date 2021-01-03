public class hasLastDigit {
    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
       int lastDigit1 = number1 % 10;
       int lastDigit2 = number2 % 10;
       int lastDigit3 = number3 % 10;

        if(isValid(number1) && isValid(number2) && isValid(number3)) {
            return lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3;
        }
        return false;
    }
}
