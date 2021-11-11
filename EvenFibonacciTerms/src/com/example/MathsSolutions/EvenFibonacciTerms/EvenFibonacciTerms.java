package com.example.MathsSolutions.EvenFibonacciTerms;

public class EvenFibonacciTerms {

    public EvenFibonacciTerms(long endNumber) {
        long firstFibonacciNum = 1;
        long secondFibonacciNum = 2;
        long nextFibonacciNum = 0;
        long sumOfEvenFibNums = 2;
        while (nextFibonacciNum < endNumber) {
            nextFibonacciNum = firstFibonacciNum + secondFibonacciNum;
            if (nextFibonacciNum % 2 == 0) {
                sumOfEvenFibNums += nextFibonacciNum;
//                System.out.println("The sum is: " + sumOfEvenFibNums);
            }
            firstFibonacciNum = secondFibonacciNum;
            secondFibonacciNum = nextFibonacciNum;

//            System.out.println("nextFibNum fib num i: " + nextFibonacciNum);
//            System.out.println("fist fib num i: " + firstFibonacciNum);
//            System.out.println("second fib num i: " + secondFibonacciNum);
//            System.out.println("-------------------------");

        }
        System.out.println("The sum of even fibonacci numbers is: " + sumOfEvenFibNums);
    }
//    private int sumOfEvenNumbersFromFibonacciSequence
}
