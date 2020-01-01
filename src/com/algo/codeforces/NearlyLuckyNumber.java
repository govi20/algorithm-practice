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
        // int count = 0; // boolean found = false;
        boolean b = containsLuckyDigitOnly (str);
        if (b) {
            System.out.println ("YES");
        }
        else {
            int divLimit = (int) (n / 2);
            for (int i = 4; i <= divLimit + 5; i++) {
                if (n % i == 0) {
                    b = containsLuckyDigitOnly (i + "");
                    if (b) {
                        System.out.println ("YES");
                        break;
                    }
                }
            }

            if (!b) {
                System.out.println ("NO");
            }
        }
    }

    public static boolean containsLuckyDigitOnly(String str) {
        for (int i = 0; i < str.length (); i++) {
            if (str.charAt (i) == '4' || str.charAt (i) == '7') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
