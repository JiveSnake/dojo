package com.jivesnake.dojo.datastructures;

import com.jivesnake.dojo.datastructures.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;
    public Graph() {
        adjVertices = new HashMap<>();
    }

    public 	List<Vertex> getAdjVertices(Vertex vertex) {
        return adjVertices.get(vertex);
    }

    void addVertex(Vertex vertex) {
        adjVertices.putIfAbsent(vertex, new ArrayList<>());
    }

    void addEdge(Vertex v1, Vertex v2) {
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

}
