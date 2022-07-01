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
        Set<Vertex> alreadyVisited = new HashSet<>();
        Queue<Vertex> seen = new Queue<>();
        seen.enqueue(start);
        while (!seen.isEmpty()) {
            Vertex currentVertex = seen.dequeue();
            if (!alreadyVisited.contains(currentVertex)) {
                if (currentVertex.getValue() == target) {
                    return currentVertex;
                }
                alreadyVisited.add(currentVertex);
                List<Vertex> neighbors = graph.getAdjVertices(currentVertex);
                seen.enqueueAll(neighbors);
            }
        }
        return null;
    }

    public static Vertex graphRecurs(Graph graph, Vertex start, Queue<Vertex> toProcess, Set<Vertex> seen, int target) {
        if (start.getValue() == target) {
            return start;
        }
        seen.add(start);
        for (Vertex neighbor : graph.getAdjVertices(start)) {
            if (!seen.contains(neighbor)) {
                seen.add(start);
                toProcess.enqueue(neighbor);
            }
        }
        if (toProcess.isEmpty()) {
            return null;
        }
        return graphRecurs(graph, toProcess.dequeue(), toProcess, seen, target);
    }

    public static Node treeIter(Node root, int target) {
       Queue<Node> next = new Queue<>();
       next.enqueue(root);
       while (!next.isEmpty()) {
           Node current = next.dequeue();
           if (current.getValue() == target) {
               return current;
           }
           next.enqueueAll(current.getChildren());
       }

       return null;
    }

    public static Node treeRecurs(Node root, Queue<Node> toProcess, int target) {
        if (root.getValue() == target) {
            return root;
        }
        toProcess.enqueueAll(root.getChildren());
        if (toProcess.isEmpty()) {
            return null;
        }
        return treeRecurs(toProcess.dequeue(), toProcess, target);
    }
}
