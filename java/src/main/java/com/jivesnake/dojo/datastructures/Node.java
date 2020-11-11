package com.jivesnake.dojo.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private List<Node> children;

    public Node(int value) {
        this.value = value;
        children = new ArrayList<>();
    }

    public Node(int value, List<Node> children) {
        this.value = value;
        this.children = children;
    }

    public int getValue() {
        return value;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        children.add(child);
    }
}
