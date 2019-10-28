package com.algo.codeforces;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 21-Oct-2019
 */
public class Drinks_200B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt ();
            sum = sum + t;
        }

        double answer = sum / n;
        System.out.println (answer);
    }
}
