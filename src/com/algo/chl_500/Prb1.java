package com.algo.chl_500;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 01-Jan-2020
 * Description: Rotate and Delete https://practice.geeksforgeeks.org/problems/rotate-and-delete/0
 */
public class Prb1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for( int i = 0; i < t; i++ ) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for( int j = 0; j < arr.length; j++ ) {
                arr[j] = scanner.nextInt();
            }

            int k = 0;
            while( arr.length > 1 ) {
                System.out.println("Doing");
                arr = rotate(arr, arr.length - ( ++k ));
            }
            System.out.println(arr[0]);
        }
    }

    private static int[] rotate(int[] arr, int k) {
        int temp = arr[arr.length - 1];
        for( int i = 0; i < arr.length; i++ ) {
            int curr = arr[i];
            arr[i] = temp;
            temp = curr;
        }

        if( k < 0 )
            k = arr.length - 1;

        int[] tempArr = new int[arr.length - 1];
        System.out.println(Arrays.toString(arr) + " k = " + k);
        for( int i = 0, j = 0; i < arr.length; i++ ) {
            if( i == k ) {
                continue;
            } else {
                tempArr[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
        System.out.println(" -------------------- ");
        return tempArr;
    }
}
