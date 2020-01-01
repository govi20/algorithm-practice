package com.algo.chl_500;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 01-Jan-2020
 * Problem Link: http://codeforces.com/problemset/problem/148/A
 */
public class Prb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(IntStream.range(1, d + 1)
                .filter(num -> num % k == 0 || num % l == 0 || num % m == 0 || num % n == 0)
                .count());
    }
}
