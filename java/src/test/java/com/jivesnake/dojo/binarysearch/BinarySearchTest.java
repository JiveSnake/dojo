package com.jivesnake.dojo.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void givenEvenSortedArray_whenTargetInArray_thenReturnIndexOfTargetInArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 4;
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, target);

        assertEquals(3, result);
    }

    @Test
    void givenOddSortedArray_whenTargetInArray_thenReturnIndexOfTargetInArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, target);

        assertEquals(3, result);
    }

    @Test
    void givenEvenSortedArray_whenTargetAtStart_thenReturnIndexOfTargetInArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 1;
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, target);

        assertEquals(0, result);
    }

    @Test
    void givenOddSortedArray_whenTargetAtStart_thenReturnIndexOfTargetInArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int target = 1;
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, target);

        assertEquals(0, result);
    }

    @Test
    void givenEvenSortedArray_whenTargetAtEnd_thenReturnIndexOfTargetInArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 6;
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, target);

        assertEquals(5, result);
    }

    @Test
    void givenOddSortedArray_whenTargetAtEnd_thenReturnIndexOfTargetInArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int target = 7;
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, target);

        assertEquals(6, result);
    }

    @Test
    void givenEvenSortedArray_whenTargetNotInArray_thenReturnNegativeOne() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, target);

        assertEquals(-1, result);
    }

    @Test
    void givenOddSortedArray_whenTargetNotInArray_thenReturnNegativeOne() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int target = 8;
        int result = BinarySearch.binarySearch(array, 0, array.length - 1, target);

        assertEquals(-1, result);
    }
}
