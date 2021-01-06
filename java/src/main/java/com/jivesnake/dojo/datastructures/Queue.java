package com.jivesnake.dojo.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Queue<T> {
    private final List<T> queue;

    public Queue() {
        queue = new ArrayList<>();
    }

    public boolean isEmpty() {
       return queue.isEmpty();
    }

    public void enqueue(T obj) {
        queue.add(obj);
    }

    public void enqueue(Collection<T> collection) {
        queue.addAll(collection);
    }

    public T dequeue() {
       return queue.remove(0);
    }
}
