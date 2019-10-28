package com.algo.codeforces;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 23-Sep-2019
 */
public class Bananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int k = sc.nextInt ();
        int n = sc.nextInt ();
        int w = sc.nextInt ();

        int sum2  = IntStream.rangeClosed (1, w)
                .map(i -> i * k)
                .sum ();

        if (sum2 <= n)
            System.out.println (0);
        else
            System.out.println (sum2 - n);
/*
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum = sum + (i * k);
        }

        if (sum <= n)
            System.out.println (0);
        else
            System.out.println (sum - n);
*/



    }
}
