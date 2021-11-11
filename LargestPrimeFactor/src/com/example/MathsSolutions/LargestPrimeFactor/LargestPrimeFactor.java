package com.example.MathsSolutions.LargestPrimeFactor;

import java.util.ArrayList;

public class LargestPrimeFactor {

    public LargestPrimeFactor(long maxNum) {
        ArrayList<Long> listOfPrimes = new ArrayList<>();
        listOfPrimes.add(2L);
        for (long i = 3; i < maxNum/2; i++) {
            if (i % 2 == 1 && isPrime(i)) {
                listOfPrimes.add(i);
            }
        }
//        for (long i = 0; i < listOfPrimes.size(); i++) {
//            System.out.println(listOfPrimes.get((int) i));
//        }
        for (int i = listOfPrimes.size() -1; i > -1; i--) {
            if (maxNum % listOfPrimes.get(i) == 0) {
                System.out.println("Max Prime Factor is: " + listOfPrimes.get(i));
                break;
            }
//            System.out.println(listOfPrimes.get((int) i));
        }

    }

    private boolean isPrime(long num) {
        for (long i = 2; i < num; i++ ) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
