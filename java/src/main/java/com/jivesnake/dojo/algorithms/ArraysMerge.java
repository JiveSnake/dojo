package com.jivesnake.dojo.algorithms;

public class ArraysMerge {
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        int[][] mergedIntervals = new int[intervals.length][2];

        mergedIntervals[0] = intervals[0];
        for (int[] interval : intervals) {
            int[] mergedInterval = mergedIntervals[mergedIntervals.size() - 1];
            if (interval[0] > mergedInterval[0] && interval[1] < mergedInterval[1]) continue;
            if (interval[0] > mergedInterval[0] && interval[0] < mergedInterval[1] && interval[1] > mergedInterval[1]) {
                mergedInterval[1] = interval[1];
            } else mergedIntervals.add(interval);
        }
        return mergedIntervals;
    }
}
