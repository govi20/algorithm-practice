package com.algo.codeforces;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 05-Dec-2019
 */
public class Expression479A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt ();
        int b = scanner.nextInt ();
        int c = scanner.nextInt ();

        if (a == 1 && b == 1 && c == 1) {
            System.out.println (a + b + c);
        } else if (a == 1 || b == 1 || c == 1) {
            int addAns = a + b + c;
            if (a == 1) {
                int add  = a + b;
                int finalAns = (add * c) > addAns ?(add * c) : addAns;
                System.out.println (finalAns);
            }
            else if(c == 1){
                int add = b + c;
                int finalAns = (add * a) > addAns ?(add * a) : addAns;
                System.out.println (finalAns);
            }
            else {
                int min = Math.min (a, c) + 1;
                int max = Math.max (a, c);
                int finalAns = (min * max) > addAns ?(min * max) : addAns;
                System.out.println (finalAns);
            }
        } else {
            System.out.println (a * b * c);
        }


    }
}
