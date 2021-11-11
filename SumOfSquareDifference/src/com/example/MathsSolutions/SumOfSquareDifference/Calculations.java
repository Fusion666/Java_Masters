package com.example.MathsSolutions.SumOfSquareDifference;

public class Calculations {

    public Calculations() {
        long endProduct = squareOfSum() - calcSumOfSquares();
        System.out.println("The total sum is: " + endProduct);
    }

    public long calcSumOfSquares() {
        long sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i*i;
        }
        System.out.println("The sum of the root of the first 10 natural numbers is: " + sum);
        return sum;
    }

    public long squareOfSum() {
        long sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println("The sum of the first ten natural number is: " + sum);
        System.out.println("The root is: " + sum*sum);
        return sum*sum;
    }

}
