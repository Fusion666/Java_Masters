package com.example.test;

import com.simeon.mylibrary.Series;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
