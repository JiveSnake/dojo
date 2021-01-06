package com.jivesnake.dojo.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysInPlaceTest {

    @Test
    void giveAnArray_whenRevered_thenReveredInPLace() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] reveredArray = {7, 6, 5, 4, 3, 2, 1};

        ArraysInPlace.reverse(array);

        assertArrayEquals(reveredArray, array);
    }

    @Test
    void givenArrayWithTargetsInMiddle_whenMoveTargetsToFront_thenTargetsMovedAndOrderPreserved() {
        int[] array = {1, 2, 0, 4, 5, 0, 7};
        int[] reveredArray = {0, 0, 1, 2, 4, 5, 7};

        ArraysInPlace.moveTargetsToFront(array, 0);

        assertArrayEquals(reveredArray, array);
    }

    @Test
    void givenArrayWithTargetsAtEnd_whenMoveTargetsToFront_thenTargetsMovedAndOrderPreserved() {
        int[] array = {1, 2, 4, 5, 7, 0, 0};
        int[] reveredArray = {0, 0, 1, 2, 4, 5, 7};

        ArraysInPlace.moveTargetsToFront(array, 0);

        assertArrayEquals(reveredArray, array);
    }

    @Test
    void givenArrayWithNoTargets_whenMoveTargetsToFront_thenOrderPreserved() {
        int[] array = {1, 2, 4, 5, 7};
        int[] reveredArray = {1, 2, 4, 5, 7};

        ArraysInPlace.moveTargetsToFront(array, 0);

        assertArrayEquals(reveredArray, array);
    }
}
