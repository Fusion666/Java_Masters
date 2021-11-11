package com.example.DataStructures;

import java.util.ArrayList;


public class DynamicArray {
    public ArrayList<Integer> myDynamicClassArray = new ArrayList<>();

    public DynamicArray() {

        System.out.println("This program creates a dynamic array of integer numbers and then by using the Bubble Sort Method " +
                "sorts the array.");
        System.out.println();
    }

    protected void addNum(int nextNum) {

        myDynamicClassArray.add(nextNum);
    }

    public int size() {
        return myDynamicClassArray.size();
    }

}
