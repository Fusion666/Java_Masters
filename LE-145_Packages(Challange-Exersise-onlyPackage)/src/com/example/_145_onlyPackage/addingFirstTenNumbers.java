package com.example._145_onlyPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class addingFirstTenNumbers {
 private ArrayList<Double> myArraylistOfFirstTenNums = new ArrayList<>();
 int arrayCounter = 0;
 double newNumber;

    public void addingMyFirstTenNumbers() {
        System.out.println("This program will perform an addition of the first 10 entered numbers.");
        while (arrayCounter < 10) {
            Scanner arrayNumber = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            newNumber = arrayNumber.nextDouble();
            myArraylistOfFirstTenNums.add(newNumber);
            arrayCounter++;
        }
    }
    public void printingNumbers () {
        for (int i = 0; i < myArraylistOfFirstTenNums.size(); i++) {
            System.out.println("num_" + (i + 1) + ": " + myArraylistOfFirstTenNums.get(i));
        }
    }

    public void sumOfAllNums() {
        double currentSum = 0;
        for (Double myArraylistOfFirstTenNum : myArraylistOfFirstTenNums) {
            currentSum = currentSum + myArraylistOfFirstTenNum;
        }
        System.out.println("The sum of all numbers is: " + currentSum);
    }
}
