package com.jivesnake.dojo.algorithms;

import com.jivesnake.dojo.datastructures.Graph;
import com.jivesnake.dojo.datastructures.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchTest {
    private Graph graph;
    private Vertex v0;

    @BeforeEach
    void setUp() {
        graph = new Graph();
        v0 = new Vertex(0);
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        graph.addVertex(v0);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        graph.addEdge(v0, v1);
        graph.addEdge(v0, v2);
        graph.addEdge(v1, v3);
        graph.addEdge(v1, v4);
        graph.addEdge(v2, v5);
    }

    @Test
    void givenVertexInDirectedAcyclicGraph_whenDepthFirstSearch_thenReturnVertex() {
        int target = 4;
        Vertex result = DepthFirstSearch.graphRecurs(graph, v0, new ArrayList<>(), new HashSet<>(), target);

        assertEquals(target, result.getValue());
    }

    @Test
    void givenVertexNotInGraph_whenDepthFirstSearch_thenReturnNull() {
        int target = 8;
        Vertex result = DepthFirstSearch.graphRecurs(graph, v0, new ArrayList<>(), new HashSet<>(), target);

        assertNull(result);
    }
}
