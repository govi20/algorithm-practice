package com.algo.graph.structure;

import java.util.List;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 26-Jul-2019
 */
public class Vertex {

    String name;
    List<Edge> adjacentEdges;

    public Vertex(String name, List<Edge> adjacentEdges) {
        this.name = name;
        this.adjacentEdges = adjacentEdges;
    }
}
