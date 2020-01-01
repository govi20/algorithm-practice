package com.algo.binarytree;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 29-Oct-2019
 */
public class CountLeafNodes {
    public static void main(String[] args) {
        Node root = new Node (10);
        root.left = new Node (23);
        root.right = new Node (12);
        root.left.left = new Node (1);
        root.left.right = new Node (1);
        root.right.left = new Node (100);
        root.right.right = new Node (101);
        CountLeafNodes countLeafNodes = new CountLeafNodes ();
        System.out.println (countLeafNodes.countLeafNodes (root));
        System.out.println (countLeafNodes.countNonLeafNodes (root));
    }

    public int countLeafNodes(Node root) {
        int leftCount = 0, rightCount = 0;

        if (root.left == null && root.right == null)
            return 1 + leftCount + rightCount;

        if (root.left != null)
            leftCount = countLeafNodes (root.left);
        if (root.right != null)
            rightCount = countLeafNodes (root.right);

        return leftCount + rightCount;

    }

    public int countNonLeafNodes(Node root) {
        int leftCount = 0, rightCount = 0;


        if (root.left != null)
            leftCount = countLeafNodes (root.left);

        if (root.left != null || root.right != null)
            return 1 + leftCount + rightCount;

        if (root.right != null)
            rightCount = countLeafNodes (root.right);

        return leftCount + rightCount;

    }
}
