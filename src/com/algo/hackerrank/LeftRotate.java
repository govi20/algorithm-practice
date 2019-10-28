package com.algo.hackerrank;

import java.util.Scanner;
import java.util.Arrays;
class LeftRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] ip = new int[n];
        for(int i=0;i<n;i++) {
            ip[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(rotLeft(ip, d)));
    }

        static int[] rotLeft(int[] a, int d) {
            int arraylen = a.length;
            int rotation = d % arraylen;
            int[] output =  new int[a.length];
            int[] rt = new int[rotation];
            int t = 0;
            for(int i=0;i<rotation;i++) {
                rt[i] = a[i];
                t = i;
            }
            t++;
        
            int itemp = 0;
            for(int i=0;t<a.length;i++,t++) {
                output[i] = a[t];
                itemp = i;
            }
            itemp++;
        
            for(int i=itemp, j = 0;itemp<a.length && j < rt.length;itemp++,j++) {
                output[itemp] = rt[j];
            }
            return output;
        }

}