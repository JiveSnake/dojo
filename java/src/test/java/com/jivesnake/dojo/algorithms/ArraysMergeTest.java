package com.jivesnake.dojo.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArraysMergeTest {

    @Test
    void given_when_then() {
        int[][] intervals = {{1, 5}, {3, 7}, {4, 6}, {6, 8}};
        List<int[]> result = ArraysMerge.mergeOverlappingIntervals(intervals);

        assertArrayEquals();
    }

}