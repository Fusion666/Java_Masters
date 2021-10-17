package com.example._145_onlyPackage;

import java.util.Scanner;

public class returningFibonacciNumber {
    int first = 0;
    int second = 1;

    public void printFibonacciSeries() {
        System.out.println("This program will show the first n elements of a Fibonacci series");
        System.out.println("Enter n-th end number of the series: ");
        int numEnd;
        int result;
        Scanner scanner = new Scanner(System.in);
        numEnd = scanner.nextInt();
        if (numEnd == 1) {
            System.out.println("Element 1: 0");
        } else if (numEnd == 2) {
            System.out.println("Element 1: 0");
            System.out.println("Element 2: 1");
        } else {
            System.out.println("Element 1: 0");
            System.out.println("Element 2: 1");
            for (int i = 2; i < numEnd; i++) {
                result = first + second;
                first= second;
                second = result;
                System.out.println("Element " + i + ": " + result);
            }
        }
    }
}
