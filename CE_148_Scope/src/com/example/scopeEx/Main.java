package com.example.scopeEx;

import java.sql.Time;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        TimesTable timesTable = new TimesTable(scanner.nextInt());
        timesTable.setX();
    }
}
