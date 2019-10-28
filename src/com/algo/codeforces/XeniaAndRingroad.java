package com.algo.codeforces;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 21-Oct-2019
 */
public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int m = scanner.nextInt ();

        long prev = 1;
        long sum = 0;
        for (int i = 0; i < m; i++) {
            int t = scanner.nextInt ();
            if(t > prev) {
                sum = sum + (t - prev);
                prev = t;
            }

            else if(t < prev) {
                sum = sum + ( n - prev ) + t;
                prev = t;
            }
        }
        System.out.println (sum);
    }
}
