package com.algo.binarytree;

public class Node {
    int data;
    Node left;
    Node right;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node left, Node right) {
        this(data);
        this.left = left;
        this.right = right;
    }
}
