public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2){
        if((number1 <10 || number1 > 99) || (number2 <10 || number2 > 99)) {
            System.out.println("Outside of range scope");
            return false;
        }

        int bufferNumber2 = number2;
        int hasSharedDigitWithNumber1;

        while(number1 > 0) {
            int hasDigitShared = number1 % 10;

            while (bufferNumber2 > 0) {
                hasSharedDigitWithNumber1 = bufferNumber2 % 10;
                if(hasDigitShared == hasSharedDigitWithNumber1) {
                    return true;
                }
                bufferNumber2 /= 10;
            }
            bufferNumber2 = number2;
            number1 /= 10;
        }
        System.out.println(number1);
        System.out.println(number2);
        return false;
    }
}
