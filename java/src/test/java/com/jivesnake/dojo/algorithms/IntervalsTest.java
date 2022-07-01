package com.jivesnake.dojo.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntervalsTest {

    @Test
    void givenMergeIntervals_whenAllOverlap_thenReturnOneInternal() {
        List<List<Integer>> intervals = List.of(List.of(1, 5), List.of(3, 7), List.of(4, 6), List.of(6, 8));
        List<List<Integer>> result = Intervals.mergeOverlappingIntervals(intervals);

        List<List<Integer>> expected = List.of(List.of(1, 8));
        assertEquals(expected, result);
    }

    @Test
    void givenMergeIntervals_whenSomeOverlap_thenReturnMergedInternals() {
        List<List<Integer>> intervals = List.of(List.of(1, 3), List.of(2, 4), List.of(5, 7), List.of(6, 8));

        List<List<Integer>> result = Intervals.mergeOverlappingIntervals(intervals);

        List<List<Integer>> expected = List.of(List.of(1, 4), List.of(5, 8));
        assertEquals(expected, result);
        }
}