package com.algo.codechef.nov_2017_challenge;

import java.util.*;

class Metro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n = scanner.nextInt();
        int s = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        boolean allYes = true;
        boolean allNo = true;
        for(int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
            if(a[i]==0)
                allYes = false;
            if(a[i]==1)
                allNo = false;
        }
        for(int i=0;i<n;i++) {
            b[i] = scanner.nextInt();
            if(b[i]==0)
                allYes = false;
            if(b[i]==1)
                allNo = false;
        }
        if(allYes)
            System.out.println("YES");
        else if(allNo || a[0]==0)
            System.out.println("NO");
        else {
            for(int i=0;i<s;i++) {
                if(a[i]==0 && b[i]==0) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }


    }
}