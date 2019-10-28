package com.algo.codechef;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 06-Oct-2019
 */
public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int t = scanner.nextInt ();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt ();
            int m = scanner.nextInt ();
            int[][] matrx = new int[n][m];
            int q = scanner.nextInt ();
            for (int j = 0; j < q; j++) {
                int row = scanner.nextInt ();
                int column = scanner.nextInt ();
                for (int rowI = 0; rowI < m; rowI++) {
                    matrx[row-1][rowI] = matrx[row-1][rowI] + 1;
                }
                for (int colI = 0; colI < n; colI++) {
                    matrx[colI][column-1] = matrx[colI][column-1] + 1;
                }
            }
            int count = 0;
            for (int[] ints : matrx) {
            //    System.out.println (Arrays.toString (ints));
                for (int anInt : ints) {
                    if (anInt % 2 != 0) count++;
                }
            }
            System.out.println (count);
        }
    }
}
