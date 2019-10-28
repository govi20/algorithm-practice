package com.algo.codeforces;

import java.util.Scanner;

public class CF558Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();

        if(a==b)
            System.out.println (0);
        else if(b==0)
            System.out.println (1);
        else if( b > (a/2)) {
            System.out.println (a - b);
        }
        else if( a / b == 0 && a % b == 0)
            System.out.println (a / 2);
        else {
            int parts = 0;
            for (int i = 0; i <= b; i++) {
                  if(i >= 1 )
                      parts = parts + 1;
            }
            System.out.println (parts);
        }

    }
}
