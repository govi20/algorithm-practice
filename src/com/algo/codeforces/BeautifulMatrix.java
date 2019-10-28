package com.algo.codeforces;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int row=5, col=5;
        int[][] arr = new int[row][col];
        int foundRow=0, fountCol=0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<row;j++) {
                arr[i][j] = sc.nextInt ();
                if(arr[i][j]==1) {
                    foundRow = i+1;
                    fountCol = j+1;
                }
            }
        }

        int transfers = Math.abs (3-foundRow) + Math.abs (3-fountCol);
        System.out.println (transfers);
    }
}
