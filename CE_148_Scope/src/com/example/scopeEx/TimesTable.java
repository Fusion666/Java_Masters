package com.example.scopeEx;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

import java.util.Scanner;

public class TimesTable {
    private int x;

    public TimesTable(int x) {
        this.x = x;
    }

    public void setX() {
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " x " + this.x + " = " + x * this.x);
        }
    }
}
