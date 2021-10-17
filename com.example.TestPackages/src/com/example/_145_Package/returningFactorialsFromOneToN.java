package com.example._145_Package;

public class returningFactorialsFromOneToN {
    int endRangeOfFact;

    public returningFactorialsFromOneToN(int endRangeOfFact) {
        this.endRangeOfFact = endRangeOfFact;
        calculatingFactorialsTo_N(endRangeOfFact);
    }

    private void calculatingFactorials(int endRangeOfFact) {
        int result = endRangeOfFact;
        if (endRangeOfFact == 0) {
            System.out.println("The result is: 1");
        } else if (endRangeOfFact < 0) {
            System.out.println("Invalid input");
        } else {
            for (int i = endRangeOfFact; i > 1; i--) {
                result = result * (i - 1);
            }
        }
        System.out.println("The result of the factorialization of " + endRangeOfFact + " is: " + result);
    }

    public void calculatingFactorialsTo_N(int endRangeOfFact) {
        for (int i = endRangeOfFact; i > 0; i--) {
            calculatingFactorials(i);
        }
    }
}
