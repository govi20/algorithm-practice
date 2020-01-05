package com.algo.chl_500;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 05-Jan-2020
 * https://www.codechef.com/JAN20B/problems/BRKBKS
 */
public class Prb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for( int i = 0; i < t; i++ ) {
            int count = 0;
            int s = scanner.nextInt();
            int w1 = scanner.nextInt();
            int w2 = scanner.nextInt();
            int w3 = scanner.nextInt();
            int sum1 = w1 + w2 + w3;

            while( sum1 > 0 ) {
                if( ( w1 + w2 ) > s && ( w2 + w3 ) > s ) {
                    count = 3;
                    break;
                } else {
                    sum1 = sum1 - s;
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
