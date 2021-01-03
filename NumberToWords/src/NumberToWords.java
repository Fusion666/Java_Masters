public class NumberToWords {
    public static int reverse (int number) {
        int reversed = 0;
        int numberForReversing = number;
        while(numberForReversing !=0) {
            int digit = numberForReversing % 10;
            reversed = reversed * 10 + digit;
            numberForReversing /= 10;
        }
        return reversed;
    }
    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int numberCounter = 0;
        int numberForCounting = number;
        while(numberForCounting != 0) {
            numberCounter++;
            numberForCounting /= 10;
        }
        return numberCounter;
    }
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        if(number == 0) {
            System.out.println("Zero");
        }

        int reversedNumber = reverse(number);

        while(reversedNumber != 0) {
            switch (reversedNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }
        int reverseDigitCounter = getDigitCount(reverse(number));
        while(reverseDigitCounter < getDigitCount(number)) {
            System.out.println("Zero");
            reverseDigitCounter++;
        }
    }
}
