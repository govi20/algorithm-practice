package com.algo.codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 08-Dec-2019
 */
public class TwinsR111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] coins = new Integer[n];
        int totolsum = 0;
        for( int i = 0; i < n; i++ ) {
            coins[i] = scanner.nextInt();
            totolsum += coins[i];
        }

        System.out.println(getMinCoinsNeeded(n, coins, totolsum));

    }

    private static int getMinCoinsNeeded(int n, Integer[] coins, int totolsum) {
        Arrays.sort(coins, Collections.reverseOrder());
        int coinsSelected = 0, sumCoin = 0, minExpected = totolsum / 2;
        for(int i = 0; i < n;i++) {
            sumCoin += coins[i];
            coinsSelected++;
            if(sumCoin > minExpected) {
                return coinsSelected;
            }
        }
        return n;
    }
}
