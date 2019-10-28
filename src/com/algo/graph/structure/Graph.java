package com.algo.graph.structure;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 26-Jul-2019
 */
public class Graph {
    List<Edge> edges;

    Graph(List<Edge> edges) {
        this.edges = edges;
    }

    Graph() {
        edges = new ArrayList<> ();
    }

    public void addEdge(Edge edge) {
        edges.add (edge);
    }
}
