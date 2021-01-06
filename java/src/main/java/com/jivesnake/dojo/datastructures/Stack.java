package com.jivesnake.dojo.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Stack<T> {
    private final List<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T obj) {
        stack.add(obj);
    }

    public void push(Collection<T> collection) {
        stack.addAll(collection);
    }

    public T pop() {
        if (isEmpty()) return null;
        return stack.remove(stack.size() - 1);
    }
}
