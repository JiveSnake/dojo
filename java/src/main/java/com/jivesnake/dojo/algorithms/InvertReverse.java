package com.jivesnake.dojo.algorithms;

import com.jivesnake.dojo.datastructures.Node;

public class InvertReverse {
    public static void invertBinaryTree(Node root) {
        if (root.getChildren().isEmpty()) {
            return;
        }
        Node leftChild = root.getChildren().get(0);
        Node rightChild = root.getChildren().get(1);

        root.getChildren().set(0, rightChild);
        root.getChildren().set(1, leftChild);

        invertBinaryTree(leftChild);
        invertBinaryTree(rightChild);
    }

    public static Node reverseLinkedList(Node head) {
        return head;
    }
}
