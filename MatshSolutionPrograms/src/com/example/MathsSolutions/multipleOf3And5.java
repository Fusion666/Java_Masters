package com.example.MathsSolutions;

import javax.swing.*;

public class multipleOf3And5 {
    long p = 3;
    long q = 5;

    public multipleOf3And5(int f, int s) {
        this.p = f;
        this.q = s;
        long sumMultipleOf3 = 0;
        long sumMultipleOf5 = 0;
        for (long i = 1; i < 1000; i ++ ) {
            if (i % 3 == 0 && i % 5 !=0) {
                sumMultipleOf3 = sumMultipleOf3 + i;
                System.out.println(i);
            }
//            System.out.println("=============");
        }
        for (long j = 1; j < 1000; j ++ ) {
            if (j % 5 == 0) {
                sumMultipleOf5 = sumMultipleOf5 + j;
//                System.out.println(j);
            }
        }
        System.out.println("The result is: " + (sumMultipleOf3 + sumMultipleOf5));
    }

}
