package com.jivesnake.dojo.algorithms;

import com.jivesnake.dojo.datastructures.Graph;
import com.jivesnake.dojo.datastructures.Node;
import com.jivesnake.dojo.datastructures.Stack;
import com.jivesnake.dojo.datastructures.Vertex;

import java.util.HashSet;
import java.util.Set;

public class DepthFirstSearch {
    public static Vertex graphIter(Graph graph, Vertex entry, int target) {
        if (entry == null || entry.getValue() == target) return entry;
        Stack<Vertex> toProcess = new Stack<>();
        Set<Vertex> seen = new HashSet<>(graph.getAdjVertices(entry));
        Set<Vertex> visited = new HashSet<>();

        visited.add(entry);
        toProcess.push(graph.getAdjVertices(entry));

        while (!toProcess.isEmpty()) {
            Vertex vertex = toProcess.pop();
            if (vertex.getValue() == target) return vertex;
            visited.add(vertex);
            for (Vertex adjVertex : graph.getAdjVertices(vertex)) {
                if (!visited.contains(adjVertex) && !seen.contains(adjVertex)) {
                    seen.add(adjVertex);
                    toProcess.push(adjVertex);
                }
            }
        }
        return null;
    }

    public static Vertex graphRecurs(Graph graph, Vertex vertex, Stack<Vertex> toProcess, Set<Vertex> seen, Set<Vertex> visited, int target) {
        if (vertex == null || vertex.getValue() == target) return vertex;
        visited.add(vertex);
        for (Vertex adjVertex : graph.getAdjVertices(vertex)) {
            if (!visited.contains(adjVertex) && !seen.contains(adjVertex)) {
                seen.add(adjVertex);
                toProcess.push(adjVertex);
            }
        }
        Vertex nextVertex = toProcess.pop();
        return graphRecurs(graph, nextVertex, toProcess, seen, visited, target);
    }

    public static Node treeIter(Node root, int target) {
        if (root == null) return null;
        Stack<Node> seen = new Stack<>();
        Set<Node> visited = new HashSet<>();
        seen.push(root.getChildren());
        seen.push(root);

        while (!seen.isEmpty()) {
            Node node = seen.pop();
            if (node.getValue() == target) return node;
            visited.add(node);
            for (Node child : node.getChildren()) {
                if (!visited.contains(child)) seen.push(child);
            }
        }
        return null;
    }

    public static Node treeRecurs(Node node, Stack<Node> seen, Set<Node> visited, int target) {
        if (node == null || node.getValue() == target) return node;
        visited.add(node);
        for (Node child : node.getChildren()) {
            if (!visited.contains(child)) seen.push(child);
        }
        return treeRecurs(seen.pop(), seen, visited, target);
    }
}
