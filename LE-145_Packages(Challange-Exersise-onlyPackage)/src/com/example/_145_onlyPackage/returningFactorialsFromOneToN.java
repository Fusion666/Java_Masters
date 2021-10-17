package com.example._145_onlyPackage;

public class returningFactorialsFromOneToN {
    int endRangeOfFact;

    public returningFactorialsFromOneToN(int endRangeOfFact) {
        this.endRangeOfFact = endRangeOfFact;
    }

    private void calculatingFactorials(int givenNumber) {
        int result = givenNumber;
        if (givenNumber == 0) {
            System.out.println("The result is: 1");
        } else if (givenNumber < 0) {
            System.out.println("Invalid input");
        } else {
            for (int i = givenNumber; i > 1; i--) {
                result = result * (i - 1);
            }
        }
        System.out.println("The result of the factorialization of " + givenNumber + " is: " + result);
    }

    public void calculatingFactorialsTo_N(int endRangeOfFact) {
        for (int i = endRangeOfFact; i > 0; i--) {
            calculatingFactorials(i);
        }
    }
}
