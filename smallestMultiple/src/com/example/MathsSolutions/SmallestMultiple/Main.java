package com.example.MathsSolutions.SmallestMultiple;

public class Main {

    public static void main(String[] args) {
        long result = 19*20;
        while (result % 10 != 0 || result % 11 != 0 || result % 12 != 0 || result % 13 != 0 || result % 14 != 0 ||
                result % 15 != 0 || result % 16 != 0 || result % 17 !=0 || result % 18 != 0 || result % 19 != 0) {
            result += 10;
        }
        System.out.println("Result is: " + result);
    }
}
