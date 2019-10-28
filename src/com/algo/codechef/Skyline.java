package com.algo.codechef;

import java.util.Arrays;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 11-Jul-2019
 */
public class Skyline {

    public static void main(String[] args) {
        int[][] arr = {{3,0,8,4},{2,6,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println (new Skyline ().maxIncreaseKeepingSkyline (arr));
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int max = 0;
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];

        for(int i=0; i<grid.length;i++) {
            rowMax[i] = Arrays.stream (grid[i]).max ().getAsInt ();
        }

        for(int i=0; i<grid[0].length;i++) {
            int maxCol = grid[0][i];
            for(int j=0; j<grid.length;j++) {
                if(maxCol < grid[j][i]) {
                    maxCol = grid[j][i];
                }
            }
            colMax[i] = maxCol;
        }

        for(int i=0;i<grid.length;i++) {
            int maxI = rowMax[i];
            for(int j=0; j< grid[i].length;j++) {
                int maxJ = colMax[j];
                int minOfBoth = Math.min (maxI, maxJ);
                max = max + (minOfBoth - grid[i][j]);
            }
        }

        return max;
    }
}
