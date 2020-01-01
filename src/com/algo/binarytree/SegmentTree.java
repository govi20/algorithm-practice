package com.algo.binarytree;

import java.util.Arrays;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 30-Oct-2019
 */
public class SegmentTree {
    public static void main(String[] args) {
        SegmentTree segmentTree = new SegmentTree ();
        int[] input = {-1, 0, 3, 6};
        int[] segTree = new int[input.length * 2 - 1];
        segmentTree.constructSegmentTree (input, segTree, 0, input.length - 1, 0);
        Arrays.stream (segTree).forEach (System.out::println);


        System.out.println (segmentTree.rangeMinQuery (segTree, 1, 3, 0, input.length - 1, 0));
    }

    void constructSegmentTree(int[] input, int[] segTree, int low, int high, int pos) {
        if (low == high) {
            segTree[pos] = input[low];
            return;
        }

        int mid = (low + high) / 2;
        constructSegmentTree (input, segTree, low, mid, (2 * pos) + 1);
        constructSegmentTree (input, segTree, mid + 1, high, (2 * pos) + 2);
        segTree[pos] = Math.min (segTree[2 * pos + 1], segTree[2 * pos + 2]);
    }

    int rangeMinQuery(int[] segTree, int qlow, int qhigh, int low, int high, int pos) {

        if (qlow <= low && qhigh >= high) { // total overlap
            return segTree[pos];
        }

        if (qlow > high || qhigh < low) { // No overlap
            return Integer.MAX_VALUE;
        }

        // partial overlap
        int mid = (high + low) / 2;
        int minLeft = rangeMinQuery (segTree, qlow, qhigh, low, mid, (2 * pos + 1));
        int minRight = rangeMinQuery (segTree, qlow, qhigh, mid + 1, high, (2 * pos + 2));
        return Math.min (minLeft, minRight);
    }
}
