public class GCD {
    public static int getGreatestCommonDivisor(int number1, int number2) {
        if(number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 =temp;
        }
        if(number1 < 10 || number2 < 10) {
            return -1;
        }
        while (number2 != 0) {
            int tempNumber = number1 % number2;
            number1 = number2;
            number2 = tempNumber;
        }
        return number1;
    }
}
