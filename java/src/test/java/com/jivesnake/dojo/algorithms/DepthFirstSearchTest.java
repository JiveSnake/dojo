package com.jivesnake.dojo.algorithms;

import com.jivesnake.dojo.datastructures.Graph;
import com.jivesnake.dojo.datastructures.Node;
import com.jivesnake.dojo.datastructures.Stack;
import com.jivesnake.dojo.datastructures.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class DepthFirstSearchTest {
    private Graph graph;
    private Vertex v0;
    private Node root;

    @BeforeEach
    void setUp() {
        root = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        root.addChild(n3);
        root.addChild(n2);
        root.addChild(n1);
        n1.addChild(n4);
        n3.addChild(n5);
    }

    @Test
    void givenAcyclicDirectedGraph_whenIterDFSAndVertexInGraph_thenReturnVertex() {
        buildAcyclicDirectedGraph();
        int target = 4;
        Vertex result = DepthFirstSearch.graphIter(graph, v0, target);

        assertNotNull(result);
        assertEquals(target, result.getValue());
    }

    @Test
    void givenAcyclicDirectedGraph_whenIterDFSAndVertexNotInGraph_thenReturnNull() {
        buildAcyclicDirectedGraph();
        int target = 8;
        Vertex result = DepthFirstSearch.graphIter(graph, v0, target);

        assertNull(result);
    }

    @Test
    void givenAcyclicDirectedGraph_whenRecursDFSAndVertexInGraph_thenReturnVertex() {
        buildAcyclicDirectedGraph();
        int target = 4;
        Vertex result = DepthFirstSearch.graphRecurs(graph, v0, new Stack<>(), new HashSet<>(), target);

        assertNotNull(result);
        assertEquals(target, result.getValue());
    }

    @Test
    void givenAcyclicDirectedGraph_whenRecursDFSAndVertexNotInGraph_thenReturnNull() {
        buildAcyclicDirectedGraph();
        int target = 8;
        Vertex result = DepthFirstSearch.graphRecurs(graph, v0, new Stack<>(), new HashSet<>(), target);

        assertNull(result);
    }

    @Test
    void givenCyclicUndirectedGraph_whenIterDFSAndVertexInGraph_thenReturnVertex() {
        buildCyclicUndirectedGraph();
        int target = 4;
        Vertex result = DepthFirstSearch.graphIter(graph, v0, target);

        assertNotNull(result);
        assertEquals(target, result.getValue());
    }

    @Test
    void givenCyclicUndirectedGraph_whenIterDFSAndVertexNotInGraph_thenReturnNull() {
        buildCyclicUndirectedGraph();
        int target = 8;
        Vertex result = DepthFirstSearch.graphIter(graph, v0, target);

        assertNull(result);
    }

    @Test
    void givenCyclicUndirectedGraph_whenRecursDFSAndVertexInGraph_thenReturnVertex() {
        buildCyclicUndirectedGraph();
        int target = 4;
        Vertex result = DepthFirstSearch.graphRecurs(graph, v0, new Stack<>(), new HashSet<>(), target);

        assertNotNull(result);
        assertEquals(target, result.getValue());
    }

    @Test
    void givenCyclicUndirectedGraph_whenRecursDFSAndVertexNotInGraph_thenReturnNull() {
        buildCyclicUndirectedGraph();
        int target = 8;
        Vertex result = DepthFirstSearch.graphRecurs(graph, v0, new Stack<>(), new HashSet<>(), target);

        assertNull(result);
    }

    @Test
    void givenNodeInTree_whenTreeIter_thenReturnNode() {
        int target = 4;
        Node result = DepthFirstSearch.treeIter(root, target);

        assertNotNull(result);
        assertEquals(target, result.getValue());
    }

    @Test
    void givenNodeNotInTree_whenTreeIter_thenReturnNull() {
        int target = 8;
        Node result = DepthFirstSearch.treeIter(root, target);

        assertNull(result);
    }

    @Test
    void givenNodeInTree_whenTreeRecurs_thenReturnsNode() {
        int target = 4;
        Node result = DepthFirstSearch.treeRecurs(root, new Stack<>(), target);

        assertNotNull(result);
        assertEquals(target, result.getValue());
    }

    @Test
    void givenNodeNotInTree_whenTreeRecurs_thenReturnNull() {
        int target = 8;
        Node result = DepthFirstSearch.treeRecurs(root, new Stack<>(), target);

        assertNull(result);
    }

    private void buildAcyclicDirectedGraph() {
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

    private void buildCyclicUndirectedGraph() {
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
        graph.addEdge(v1, v0);

        graph.addEdge(v0, v2);
        graph.addEdge(v2, v0);

        graph.addEdge(v1, v3);
        graph.addEdge(v3, v1);

        graph.addEdge(v1, v4);
        graph.addEdge(v4, v1);

        graph.addEdge(v2, v5);
        graph.addEdge(v5, v2);

        graph.addEdge(v3, v0);
        graph.addEdge(v0, v3);
    }
}
