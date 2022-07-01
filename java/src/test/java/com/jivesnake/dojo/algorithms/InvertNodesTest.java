package com.jivesnake.dojo.algorithms;

import com.jivesnake.dojo.datastructures.Node;
import org.junit.jupiter.api.Test;

class InvertNodesTest {

    @Test
    void invertBinaryTree() {
        Node root = generateBinaryTree();

        InvertReverse.invertBinaryTree(root);
    }

    @Test
    void reverseLinkedList() {
    }

    private static Node generateBinaryTree() {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n0.addChild(n1);
        n0.addChild(n2);
        n1.addChild(n3);
        n1.addChild(n4);
        n2.addChild(n5);
        n2.addChild(n6);

        return n0;
    }
}