package com.algo.codechef.nov_2017_challenge;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] inputs = new int[t];

        for(int i=0;i<t;i++) {
            inputs[i] = sc.nextInt();
        }

        for(int i=0; i<t;i++) {
            int num = inputs[i];
            int answer =(int) Math.pow(2, num);
            System.out.print(""+1+" "+answer+" ");
        }

    }
}