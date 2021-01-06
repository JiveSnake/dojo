package com.jivesnake.dojo.algorithms;

public class ArraysInPlace {
    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            i++;
            j--;
        }
    }

    public static void moveTargetsToFront(int[] array, int target) {
        int targetPointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                int temp = array[targetPointer];
                array[targetPointer] = array[i];
                for (int j = targetPointer + 1; j <= i; j++) {
                    int temp2 = array[j];
                    array[j] = temp;
                    temp = temp2;
                }
            }
        }
    }
}
