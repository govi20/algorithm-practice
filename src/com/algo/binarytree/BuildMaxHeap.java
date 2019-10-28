package com.algo.binarytree;


import java.util.Arrays;

public class BuildMaxHeap<T> {

    static int[] arr = {9, 6, 5, 0, 8, 2, 7, 1, 3};

    public BuildMaxHeap(int[] arr) {
        this.arr = arr;
    }

    public BuildMaxHeap() {
        this.arr = new int[]{9, 6, 5, 0, 8, 2, 7, 1, 3};
    }

    public static void main(String[] args) {

        int last_non_leaf_index = Math.floorDiv (arr.length, 2);
        for(int i=last_non_leaf_index; i>=0; i--) {
            heapify(arr, i);
        }

        System.out.println (Arrays.toString (arr));
        System.out.println ("Extract max => "+extract ());
        System.out.println ("Extract max => "+extract ());
        insertKey (32);
        System.out.println (Arrays.toString (arr));
    }

    private static void heapify(int[] arr, int i) {
        int left = (2*i)+1;
        int right = (2*i)+2;
        int largetst;
        if(left < arr.length && arr[left] > arr[i])
            largetst = left;
        else
            largetst = i;

        if(right < arr.length && arr[right] > arr[largetst])
            largetst = right;

        if(largetst != i) {
            int temp = arr[i];
            arr[i] = arr[largetst];
            arr[largetst] = temp;
            heapify (arr, largetst);
        }
    }

    public static void buildHeap() {
        int non_leaf_index = Math.floorDiv (arr.length, 2);

        for(int i=non_leaf_index; i>=0; i--) {
            heapify(arr, i);
        }
    }

    public static void insertKey(int value) {
        int[] temp_array = new int[BuildMaxHeap.arr.length+1];
        for(int i=0;i<BuildMaxHeap.arr.length;i++)
            temp_array[i] = BuildMaxHeap.arr[i];

        temp_array[BuildMaxHeap.arr.length] = value;
        BuildMaxHeap.arr = new int[temp_array.length];
        BuildMaxHeap.arr = temp_array;
        buildHeap ();
    }

    public static int extract() {
        if(arr.length <= 0) {
            System.out.println ("Heap is empty!");
            System.exit (0);
        }
        int root = BuildMaxHeap.arr[0];
        int[] temp_arr = new int[BuildMaxHeap.arr.length-1];
        arr[0] = BuildMaxHeap.arr[BuildMaxHeap.arr.length-1];

        for(int i=0; i<temp_arr.length;i++)
            temp_arr[i] = BuildMaxHeap.arr[i];

        BuildMaxHeap.arr = new int[temp_arr.length];
        BuildMaxHeap.arr = temp_arr;
        buildHeap ();
        return root;
    }
   // pub
}

/*
class Vertex {
    String name;
    List<Edge> adjacentEdges;
}

class Edge {
    Vertex start;
    Vertex end;
    Integer weight;
}

class Graph {
    List<Edge> edges;
}

*/