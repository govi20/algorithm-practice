package com.algo.binarytree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = new Node ();
    }

    public static void main(String[] args) {
        Node root = new Node (14);
        root.left = new Node (6);
        root.right = new Node (21);
        root.left.left = new Node (3);
        root.left.right = new Node (7);
        root.left.right.right = new Node (81);

        System.out.println (isBST (root));
    }

    public static boolean isBST(Node root) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null)
            return true;

        if(root.left != null && root.left.data > root.data)
            return false;
        if(root.right != null && root.right.data <= root.data)
            return false;
        return isBST (root.left) && isBST (root.right);
    }
}

class Node {
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
