package com.company;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperation {

    private static final int N = 10;
    private final int size;
    private final int[] array;
    private final int[] sortedArray;
    private long insertionSortDuration;

    public ArrayOperation(int size){
        this.size=size;
        this.array = this.fillArrayWithRandom();
        this.sortedArray = this.insertionSort();

    }
    private int[] fillArrayWithRandom(){
      Random rng = new Random();
       return rng.ints(size, 0, size+N*10000).toArray();
    }
    public int amountOfNumbersInRange(){
        int amount=0;
        for(int i : array){
            if(i >= N && i<=2*N)
                amount++;
        }
        return amount;
    }
    public int indexOfLastNElement(){
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1000+N){
                index = i;
                break;
            }

        }
        return index;
    }

    private int[] insertionSort() {
        int[] arr = Arrays.copyOf(array, array.length);
        long start = System.currentTimeMillis();
        for (int j = 1; j < size; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        long finish = System.currentTimeMillis();
        insertionSortDuration = finish-start;
        return arr;
    }

    public long findBinarySteps(int num, int[] array) {
        int lo = 0;
        int hi = array.length-1;
        long steps = 0;
        while (true) {
            steps+=1;
            int mid = (lo + hi) / 2;
            if (array[mid] == num) {
                return steps;
            }
            if (lo>hi) {
                return -1; // not found
            }
            if (array[mid] < num) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
    }

    public int[] getArray() {
        return array;
    }

    public int[] getSortedArray() {
        return sortedArray;
    }

    public long getInsertionSortDuration() {
        return insertionSortDuration;
    }

    public int getSize() {
        return size;
    }



}
