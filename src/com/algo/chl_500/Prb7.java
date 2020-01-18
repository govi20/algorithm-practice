    package com.algo.chl_500;

    import java.util.Arrays;
    import java.util.Scanner;

    /*
     * @Author: Govinda Sakhare
     * Email: govindasakhare20@gmil.com
     * Date: 11-Jan-2020
     */
    public class Prb7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while(t > 0) {
                t--;
                int n = scanner.nextInt();
                int[] arr = new int[n];
                boolean negativeFound = false, positiveFound = false;
                for( int i = 0; i < n; i++ ) {
                    arr[i] = scanner.nextInt();
                    if(arr[i] < 0)
                        negativeFound = true;

                    if(arr[i] > 0)
                        positiveFound = true;
                }
                if(!negativeFound) {
                    System.out.println("YES");
                    continue;
                }
                if(!positiveFound) {
                    System.out.println("NO");
                    continue;
                }
                boolean foundStrict = false;
                int sumOfAll = Arrays.stream(arr).sum();

                int[][] sums = new int[n][n];

                for( int i = 0; i < n; i++ ) {
                    for( int j = i; j < n; j++ ) {
                        sums[i][j] = Arrays.stream(arr, i, j+1).sum();
                        if(sumOfAll <= sums[i][j] && (i!=0 || j != n-1)) {
                            foundStrict = true;
                            break;
                        }
                    }
                    if(foundStrict) {
                        break;
                    }
                }

                if(foundStrict)
                    System.out.println("NO");
                else
                    System.out.println("YES");

            }
        }
    }
