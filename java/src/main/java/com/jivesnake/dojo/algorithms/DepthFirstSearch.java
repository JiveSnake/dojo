package com.jivesnake.dojo.algorithms;

import com.jivesnake.dojo.datastructures.Graph;
import com.jivesnake.dojo.datastructures.Node;
import com.jivesnake.dojo.datastructures.Stack;
import com.jivesnake.dojo.datastructures.Vertex;

import java.util.HashSet;
import java.util.Set;

public class DepthFirstSearch {
    public static Vertex graphIter(Graph graph, Vertex entry, int target) {
        return null;
    }

    public static Vertex graphRecurs(Graph graph, Vertex vertex, Stack<Vertex> toProcess, Set<Vertex> seen, int target) {
        if (vertex.getValue() == target) {
            return vertex;
        }
        seen.add(vertex);
        for (Vertex neighbor : graph.getAdjVertices(vertex)) {
            if (!seen.contains(neighbor)) {
                toProcess.push(vertex);
                seen.add(vertex);
            }
        }
        if (toProcess.isEmpty()) {
            return null;
        }

        return graphRecurs(graph, vertex, toProcess, seen, target);
    }

    public static Node treeIter(Node root, int target) {
        return null;
    }

    public static Node treeRecurs(Node node, Stack<Node> seen, int target) {
        if (node.getValue() == target) {
            return node;
        }
        seen.pushAll(node.getChildren());
        if (seen.isEmpty()) {
            return null;
        }
        return treeRecurs(seen.pop(), seen, target);
    }
}
