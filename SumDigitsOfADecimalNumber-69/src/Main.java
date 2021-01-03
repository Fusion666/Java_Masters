public class Main {
    public static void main(String[] args) {
        //System.out.println(SumDigits(1));
        System.out.println("The sum of the numbers in 125 is " + sumDigits(125));
        System.out.println("The sum of the numbers in 125 is " + sumDigits(-125));
        System.out.println("The sum of the numbers in 125 is " + sumDigits(4));
        System.out.println("The sum of the numbers in 125 is " + sumDigits(32123));
    }


    // **********   THE COMMENTED TEXT IS MY PERSONAL SOLUTION OF THE CHALLENGE **************
//    public static int SumDigits(int number) {
//        int sumOfDigits = 0;
//        if(number < 10) {
//            return -1;
//        }
//        else {
//            do {
//                if(number / 10 != 1) {
//                    int currentDigit = number % 10;
//                    number = number / 10;
//                    sumOfDigits = sumOfDigits + currentDigit;
//                    System.out.println("number " + number);
//                    System.out.println("currentDigit " + currentDigit);
//                }
//                else {
//                    sumOfDigits = sumOfDigits + number;
//                    return sumOfDigits;
//                }
//            } while(number / 10 > 10);
//            sumOfDigits = sumOfDigits + number;
//        }
//        return sumOfDigits;
//    }

    // ********** HERE IS THE SOLUTION OF TIM BUCHALKA!! THE CODE IS LESS AND IT HAS 1 OPERATION LESS COMPARED TO
                    // MY CODE **************88
    private static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum  = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
