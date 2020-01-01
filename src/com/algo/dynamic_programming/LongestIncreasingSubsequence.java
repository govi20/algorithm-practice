package com.algo.dynamic_programming;

import java.util.Arrays;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 13-Nov-2019
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println (getLongestSubsequence (new int[]{3, 4, -1, 0, 6, 2, 3}));
    }

    public static int getLongestSubsequence(int[] input) {
        int[] temp = new int[input.length];
        Arrays.fill (temp, 1);
        for(int i=1;i < temp.length;i++) {
            for(int j=0;j<i;j++) {
                if(input[j] < input[i] ) {
                    temp[i] = Math.max (temp[i], temp[j]+1);
                }
            }
        }
        System.out.println (Arrays.toString (temp));
        int max = Arrays.stream (temp).max ().getAsInt ();

        return max;

    }
}
