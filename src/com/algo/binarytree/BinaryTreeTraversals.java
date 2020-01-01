package com.algo.binarytree;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class BinaryTreeTraversals {

    public static void main(String[] args) {
        Node root = new Node (10);
        root.left = new Node (23);
        root.right = new Node (12);
        root.left.left = new Node (1);
        root.left.right = new Node (1);
        BinaryTreeTraversals binaryTreeTraversals = new BinaryTreeTraversals ();
        System.out.println ("preorder traversal: ");
        binaryTreeTraversals.preorderTraversal (root);

        System.out.println ("\n\nInorder traversal: ");
        binaryTreeTraversals.inorderTraversal (root);

        System.out.println ("\n\npostorder traversal: ");
        binaryTreeTraversals.postorderTraversal (root);

    }

    public void inorderTraversal(Node root) {
        if(root != null && root.left !=null )
            inorderTraversal (root.left);

        if(root != null)
            System.out.print (root.data + " -> ");

        if(root != null && root.right !=null )
            inorderTraversal (root.right);
    }

    public void postorderTraversal(Node root) {
        if(root != null && root.left !=null )
            postorderTraversal (root.left);

        if(root != null && root.right !=null )
            postorderTraversal (root.right);

        if(root != null)
            System.out.print (root.data + " -> ");
    }

    public void preorderTraversal(Node root) {
        if(root != null)
            System.out.print (root.data + " -> ");

        if(root != null && root.left != null)
            preorderTraversal (root.left);

        if(root != null && root.right !=null )
            preorderTraversal (root.right);

    }
}
