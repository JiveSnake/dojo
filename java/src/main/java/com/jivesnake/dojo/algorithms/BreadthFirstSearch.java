package com.jivesnake.dojo.algorithms;

import com.jivesnake.dojo.datastructures.Graph;
import com.jivesnake.dojo.datastructures.Node;
import com.jivesnake.dojo.datastructures.Queue;
import com.jivesnake.dojo.datastructures.Vertex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BreadthFirstSearch {
    public static Vertex graphIter(Graph graph, Vertex start, int target) {
        if (start == null || start.getValue() == target) return start;
        Queue<Vertex> toProcess = new Queue<>();
        Set<Vertex> seen = new HashSet<>(graph.getAdjVertices(start));
        Set<Vertex> visited = new HashSet<>();
        toProcess.enqueue(graph.getAdjVertices(start));
        visited.add(start);

        while (!toProcess.isEmpty()) {
            Vertex nextVertex = toProcess.dequeue();
            if (nextVertex.getValue() == target) return nextVertex;
            visited.add(nextVertex);
            for (Vertex adjVertex : graph.getAdjVertices(nextVertex)) {
                if (!visited.contains(adjVertex) && !seen.contains(adjVertex)) {
                    seen.add(adjVertex);
                    toProcess.enqueue(adjVertex);
                }
            }
        }

        return null;
    }

    public static Vertex graphRecurs(Graph graph, Vertex start, Queue<Vertex> toProcess, Set<Vertex> seen, Set<Vertex> visited, int target) {

        return null;
    }

    public static Node treeIter(Node root, int target) {
        return null;
    }

    public static Node treeRecurs(Node root, Queue<Node> toProcess, Set<Vertex> seen, Set<Vertex> visited, int target) {
        return null;
    }
}
