package com.example.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        DynamicArray myDynamicArray = new DynamicArray();


        while (!quit) {
            System.out.println("Type 'y' to choose to add a number to the Dynamic array or type 'n' if you would like to quit ");

            int action = Character.toLowerCase(scanner.next().charAt(0));
            scanner.nextLine();

            if (action == 'y') {
                System.out.println("Add number:");
                int num = scanner.nextInt();
                scanner.nextLine();
                myDynamicArray.addNum(num);

            } else if (action == 'n') {
                quit = true;
            } else {
                System.out.println("Provide a valid option y/n: ");
            }
        }
        for (int lastIndex = myDynamicArray.size() - 1; lastIndex > 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (myDynamicArray.myDynamicClassArray.get(i) > myDynamicArray.myDynamicClassArray.get(i + 1)) {
                    swap(myDynamicArray, i, i+1);
                }
            }
        }

        for (int i = 0; i < myDynamicArray.size(); i++) {
            System.out.print(myDynamicArray.myDynamicClassArray.get(i) + " ");
        }
    }

    public static void swap(DynamicArray myDynamicArray, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = myDynamicArray.myDynamicClassArray.get(i);
        myDynamicArray.myDynamicClassArray.set(i, myDynamicArray.myDynamicClassArray.get(j));
        myDynamicArray.myDynamicClassArray.set(j, temp);
    }


}
