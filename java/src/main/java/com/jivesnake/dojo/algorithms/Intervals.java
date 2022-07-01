package com.jivesnake.dojo.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Intervals {
    public static List<List<Integer>> mergeSortedOverlappingIntervals(List<List<Integer>> intervals) {
        Stack<List<Integer>> answer = new Stack<>();
        for (List<Integer> currentInterval : intervals) {
            if (answer.isEmpty()) {
                answer.push(currentInterval);
                continue;
            }
            List<Integer> previousInterval = answer.pop();
            if (currentInterval.get(0) >= previousInterval.get(0) && currentInterval.get(1) <= previousInterval.get(1)) {
                answer.push(previousInterval);
            } else if (currentInterval.get(0) <= previousInterval.get(1)) {
                answer.push(Arrays.asList(previousInterval.get(0), Math.max(currentInterval.get(1), previousInterval.get(1))));
            } else {
                answer.push(previousInterval);
                answer.push(currentInterval);
            }
        }

        return new ArrayList<>(answer);
    }

    public static  List<List<Integer>> mergeOverlappingIntervals(List<List<Integer>> intervals) {
       return mergeSortedOverlappingIntervals(intervals.stream()
           .sorted(Comparator.comparingInt(i -> i.get(0)))
           .collect(Collectors.toList()));
    }

    public static List<List<Integer>> insertAndMergeOverlappingIntervals(List<List<Integer>> intervals, List<Integer> interval) {
        return intervals;
    }
}
