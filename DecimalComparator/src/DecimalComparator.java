public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        double result1 = num1 * 1000;
        double result2 = num2 * 1000;

        int resultCasted1 = (int) result1;
        int resultCasted2 = (int) result2;
        boolean comparisonOfNum1AndNum2 = true;

        if(resultCasted1 != resultCasted2) {
            comparisonOfNum1AndNum2 = false;
        }
        return comparisonOfNum1AndNum2;
    }
}
