package com.jivesnake.dojo.algorithms;

import com.jivesnake.dojo.datastructures.Graph;
import com.jivesnake.dojo.datastructures.Node;
import com.jivesnake.dojo.datastructures.Vertex;

import java.util.List;
import java.util.Set;

public class DepthFirstSearch {
    public static Vertex graphRecurs(Graph graph, Vertex vertex, List<Vertex> seen, Set<Vertex> visited, int target) {
        if (vertex.getValue() == target) return vertex;
        visited.add(vertex);
        List<Vertex> adjVertices = graph.getAdjVertices(vertex);
        for (Vertex adjVertex : adjVertices) {
            if (!seen.contains(adjVertex) && !visited.contains(adjVertex)) seen.add(adjVertex);
        }
        if (seen.isEmpty()) return null;
        Vertex nextVertex = seen.remove(seen.size() - 1);
        return graphRecurs(graph, nextVertex, seen, visited, target);
    }

    public static Node treeRecurs(Node node, int target) {
        if (node.getValue() == target) return node;
        return null;
    }
}
