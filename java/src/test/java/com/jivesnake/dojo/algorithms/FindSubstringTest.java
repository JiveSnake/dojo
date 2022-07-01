package com.jivesnake.dojo.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindSubstringTest {
    @Test
    void givenSubstringEqualsString_when_thenReturn() {
        List<List<Integer>> result = FindSubstring.findAllSubstrings("aaaa", "aaaa");
        System.out.println(result.toString());
        //assertArrayEquals(new int[][]{0, 4}, result.toArray());
    }

    @Test
    void givenSubstringIsLonger_when_thenReturnEmptyArray() {
        List<List<Integer>> result = FindSubstring.findAllSubstrings("abaa", "aaaaa");
        assertTrue(result.isEmpty());
    }


}
