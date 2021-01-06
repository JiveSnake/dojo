package com.jivesnake.dojo.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations {
    public static List<List<Integer>> generatePermutations(List<Integer> remaining, List<Integer> permutation, List<List<Integer>> permutations) {
        if (remaining.isEmpty()) {
            permutations.add(permutation);
        } else {
            for (int i = 0; i < remaining.size(); i++) {
                List<Integer> newRemaining = new ArrayList<>(remaining);
                List<Integer> newPermutation = new ArrayList<>(permutation);
                Integer element = newRemaining.remove(i);
                newPermutation.add(element);
                generatePermutations(newRemaining, newPermutation, permutations);
            }
        }

        return permutations;
    }
}
