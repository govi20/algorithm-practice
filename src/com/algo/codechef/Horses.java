package com.algo.codechef;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 23-Sep-2019
 */
public class Horses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt ();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt ();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt ();
            }
            int count = 1;
            int small = a[0];
            for (int j = 1; j < n; j++) {
                if (j < 5 && a[j] < small) {
                    small = a[j];
                    count++;
                }
                if ( j > 4 && a[j] < a[j - 1] && a[j] < a[j - 2] && a[j] < a[j - 3] && a[j] < a[j - 4] && a[j] < a[j - 5]) {
                    count++;
                }
            }
            System.out.println (count);
        }
    }
}
