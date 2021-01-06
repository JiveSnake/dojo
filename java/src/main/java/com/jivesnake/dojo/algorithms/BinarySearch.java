package com.jivesnake.dojo.algorithms;

public class BinarySearch {
    // If target is in array, return index, else return -1
    public static int binarySearch(int[] array, int start, int end, int target) {
        if (end < start) return -1;
        int mid = start + ((end - start) / 2);
        if (array[mid] > target) return binarySearch(array, start, mid - 1, target);
        if (array[mid] < target) return binarySearch(array, mid + 1, end, target);
        return mid;
    }
}
