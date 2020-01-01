package com.algo.codechef;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 11-Nov-2019
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9,11,15,17,18,23};
        System.out.println (binarySearch (arr, 0, arr.length - 1, 15));
        System.out.println (binarySearch (arr, 0, arr.length - 1, 17));
        System.out.println (binarySearch (arr, 0, arr.length - 1, 18));
        System.out.println (binarySearch (arr, 0, arr.length - 1, 23));
        System.out.println (binarySearch (arr, 0, arr.length - 1, 10));
        System.out.println (binarySearch (arr, 0, arr.length - 1, 0));
        System.out.println (binarySearch (arr, 0, arr.length - 1, 8));
        System.out.println (binarySearch (arr, 0, arr.length - 1, 25));

    }

    private static boolean binarySearch(int[] arr, int low, int high, int element) {
        while(true) {
            int mid = (low + high) / 2;
            if (arr[mid] == element)
                return true;

            else if (high == low)
                return false;

            else if(arr[mid] < element){
                low = mid + 1;
            }
            else if(arr[mid] > element) {
                high = mid;
            }

        }

    }

}
