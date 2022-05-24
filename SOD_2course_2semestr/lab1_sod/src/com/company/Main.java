package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.run();


    }

    private void run() {
        int size = 100000;
        ArrayOperation array1 = new ArrayOperation(size);
        System.out.println("Amount of numbers in Range: " + array1.amountOfNumbersInRange());
        System.out.println("The min value of index: " + array1.indexOfLastNElement());
        System.out.println("Insertion sort duration: " + array1.getInsertionSortDuration());
        ArrayOperation array2 = new ArrayOperation(size*2);
        System.out.println("Difference between arrays in time: "
                + (array2.getInsertionSortDuration()-array1.getInsertionSortDuration()));
        System.out.println("Steps in array = " + array1.findBinarySteps(1000, array1.getArray()));
        System.out.println("Steps in sorted array = " + array1.findBinarySteps(1000, array1.getSortedArray()));


    }
}
