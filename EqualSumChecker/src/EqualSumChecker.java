public class EqualSumChecker {
    public static boolean hasEqualSum (int num1, int num2, int num3) {
        double sumOfNum1AndNum2 = num1 + num2;
        boolean sumAndNum3Comparison = true;

        if(sumOfNum1AndNum2 != num3){
            sumAndNum3Comparison = false;
        }
        return sumAndNum3Comparison;
    }
}
