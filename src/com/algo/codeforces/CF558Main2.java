package com.algo.codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CF558Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        List<Integer> lastContains = new ArrayList<Integer> ();
        int[] arr = new int[n];

        for(int i = 0; i<n;i++) {
            arr[i] = sc.nextInt ();
        }
        int arr2[] = new int[n];
        for(int i = 0; i<n;i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort (arr2);
        boolean dup = false;

        for(int i=0;i<n-1;i++) {
            if(arr2[i] == arr2[i+1]) {
                dup = true;
                break;
            }
        }
        if(!dup) {
            System.out.println (n);
        }
        else {
            int t = 1;
            int longest = 0;
            int part = 1;
            boolean prev = false, first = false;
            for(int i = 0; i< arr.length-t;i++) {
                 if(arr[i] == arr[i+1] && !prev) {
                     prev = true;
                     longest++;
                     part = 1;
                     continue;
                 }
                 else {
                     part = i+1;
                 }
                if(arr[i] == arr[i+1]) {
                    if(prev) {
                        t++;
                    }
                    else {
                        t = 2;
                        prev = false;
                    }
                    part = 1;
                    continue;
                }
              /*  else {
                    prev = false;
                    if(t == longest)
                }*/
            }
        }


    }
}
