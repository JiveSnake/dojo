package com.jivesnake.dojo.algorithms;

public class ArraysInPlace {
    public static void reverse(int[] array) {
        int frontPointer = 0;
        int backPointer = array.length - 1;

        while (frontPointer < backPointer) {
            int temp = array[frontPointer];
            array[frontPointer] = array[backPointer];
            array[backPointer] = temp;
            frontPointer++;
            backPointer--;
        }
    }

    public static void moveTargetsToFront(int[] array, int target) {

    }
}
