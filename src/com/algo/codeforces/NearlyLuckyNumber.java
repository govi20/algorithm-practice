package com.algo.codeforces;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 04-Sep-2019
 */
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        long n = scanner.nextLong ();
        String str = String.valueOf (n);
        int count = 0; // boolean found = false;
        for (int i = 0; i < str.length (); i++) {
            if (str.charAt (i) == '4' || str.charAt (i) == '7') {
                count++;
                continue;
            }
        }

        if (count < 4) {
            System.out.println ("NO");
            return;
        }

        while (count != 0) {
            int rem = count % 10;
            if (rem != 4 && rem != 7) {
                System.out.println ("NO");
                return;
            }
            count = count / 10;
        }
        System.out.println ("YES");
    }
}
