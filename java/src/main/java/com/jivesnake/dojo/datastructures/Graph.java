package com.jivesnake.dojo.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        adjVertices = new HashMap<>();
    }

    public List<Vertex> getAdjVertices(Vertex vertex) {
        return adjVertices.get(vertex);
    }

    void addVertex(Vertex vertex) {
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    void addEdge(Vertex v1, Vertex v2) {

    }
}
