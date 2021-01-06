package com.jivesnake.dojo.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GeneratePermutationsTest {

    @Test
    void give_when_then() {
       List<List<Integer>> permutations = GeneratePermutations.generatePermutations(Arrays.asList(1, 2, 3), new ArrayList<>(), new ArrayList<>());
        System.out.println(permutations.toString());
    }
}
