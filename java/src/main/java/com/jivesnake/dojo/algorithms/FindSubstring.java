package com.jivesnake.dojo.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSubstring {
    public static List<List<Integer>> findAllSubstrings(String string, String substring) {
        if (substring.length() > string.length()) return Collections.emptyList();
        List<List<Integer>> substringIndexes = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < substring.length(); j++) {
                if (i + j >= string.length() || string.charAt(i + j) != substring.charAt(j)) break;
                if (j == substring.length() - 1) substringIndexes.add(Arrays.asList(i, i + j + 1));
            }
        }
        return substringIndexes;
    }
}
