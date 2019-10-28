package com.algo.codeforces;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 22-Oct-2019
 */
public class NewYearTransportation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int t = scanner.nextInt ();
        long[] nums = new long[n - 1];
        HashSet<Long> destinations = new HashSet<> ();
        for (int i = 0; i < n - 2; i++) {
            nums[i] = scanner.nextLong ();
            destinations.add (nums[i] + i + 1L);
        }

       // destinations.forEach (System.out::println);
        if (destinations.contains (Long.valueOf (t))) {
            System.out.println ("YES");
        } else {
            System.out.println ("NO");
        }
    }
}
