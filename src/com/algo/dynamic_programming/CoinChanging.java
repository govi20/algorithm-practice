package com.algo.dynamic_programming;

import java.util.Arrays;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 13-Nov-2019
 */
public class CoinChanging {
    public static void main(String[] args) {
        System.out.println (getMinCoinCHanges (new int[]{1, 5, 6, 8}, 19));
    }

    public static int getMinCoinCHanges(int[] coins, int sum) {
        int[][] coinsSum = new int[coins.length][sum+1];

        for(int i=0;i<coinsSum.length;i++) {
            int selectedCoin = coins[i];
            for (int j = 0; j < coinsSum[i].length; j++) {
                if(j >= selectedCoin) {
                    int minFromAbove = Integer.MAX_VALUE;
                    if(i>0) {
                        minFromAbove = coinsSum[i-1][j];
                    }
                    coinsSum[i][j] = Math.min(minFromAbove, 1 + coinsSum[i][j-coins[i]]);
                }
                else {
                    if(i > 0) {
                        coinsSum[i][j] = coinsSum[i-1][j];
                    }
                }
            }
        }

        for (int[] ints : coinsSum) {
            System.out.println (Arrays.toString (ints));
        }
        return coinsSum[coinsSum.length-1][coinsSum[0].length-1];
    }
}
