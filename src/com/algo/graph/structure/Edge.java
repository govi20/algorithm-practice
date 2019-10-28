package com.algo.graph.structure;


/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 26-Jul-2019
 */
public class Edge {
    Vertex start;
    Vertex end;
    Integer weight;

    public Edge(Vertex start, Vertex end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}
