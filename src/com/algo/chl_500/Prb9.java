package com.algo.chl_500;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 18-Jan-2020
 */
public class Prb9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        char prevChar = ' ';
        int count = 1;
        for( int i = 0; i < str.length(); i++ ) {
            char temp = str.charAt(i);
            if( temp == prevChar ) {
                ++count;
                if( count >= 7 ) {
                    System.out.println("YES");
                    return;
                }
            } else {
                count = 1;
            }
            prevChar = temp;
        }

        System.out.println("NO");
    }
}
