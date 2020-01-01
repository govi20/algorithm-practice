package com.algo.dynamic_programming;

import java.util.Arrays;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 17-Nov-2019
 */
public class GameOfBook {

    public static void main(String[] args) {
        System.out.println (noOfWaysToDrawTheGame (10));
    }


    static int noOfWaysToDrawTheGame(int totalScore) {

        int[] page = {2,4,6};

        int[][]  pageSum= new int[page.length][totalScore + 1];

        for (int i = 0; i < pageSum.length; i++) {
            int selectedCoin = page[i];
            for (int j = 0; j < pageSum[i].length; j++) {
                if (j >= selectedCoin) {
                    int minFromAbove = Integer.MAX_VALUE;
                    if (i > 0) {
                        minFromAbove = pageSum[i - 1][j];
                    }
                    pageSum[i][j] = Math.min (minFromAbove, 1 + pageSum[i][j - page[i]]);
                } else {
                    if (i > 0) {
                        pageSum[i][j] = pageSum[i - 1][j];
                    }
                }
            }
        }

        for (int[] ints : pageSum) {
            System.out.println (Arrays.toString (ints));
        }

/*
        int row = 2, col = pageSum[0].length-1;
        int count = 0;

        while(row != 0) {
            if(pageSum[row][col]*page[row] == totalScore) {
                count = count + pageSum[row][col];
            }
            else {
                int numberOfWaysTogetRemaining = pageSum[row+1][];

            }
        }*/


        return 0;
    }

}
