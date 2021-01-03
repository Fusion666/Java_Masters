public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sumOfEvenDigits = 0;

        while (number > 0) {
            int isEvenDigit = number % 10;
            number /= 10;
            if(isEvenDigit % 2 == 0){
                sumOfEvenDigits += isEvenDigit;
            }
        }
        return sumOfEvenDigits;
    }
}
