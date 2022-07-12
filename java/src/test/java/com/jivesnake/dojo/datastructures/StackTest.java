package com.jivesnake.dojo.datastructures;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {
    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testFILO() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void test_enqueueAll_FILO() {
        stack.pushAll(List.of(1, 2));
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void test_popReturnsNull_WhenStackIsEmpty() {
        stack.push(1);
        stack.pop();
        assertNull(stack.pop());
    }
}
