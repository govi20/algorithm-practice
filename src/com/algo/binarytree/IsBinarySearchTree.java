package com.algo.binarytree;

import java.util.Scanner;

public class IsBinarySearchTree {
    Node root;


    public IsBinarySearchTree() {
        this.root = new Node ();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
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
