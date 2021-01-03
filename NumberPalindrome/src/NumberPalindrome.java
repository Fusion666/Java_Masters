public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        number = Math.abs(number);
        int initialNumber = number;
        while(number > 0) {
            int lesserDigit = number % 10;
            number = number / 10;
            reverseNumber = (reverseNumber * 10) + lesserDigit;
        }
        if(initialNumber != reverseNumber) {
            return false;
        }
        return true;
    }
}