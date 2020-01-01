package com.algo.chl_500;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 01-Jan-2020
 * http://codeforces.com/problemset/problem/443/A
 */
public class Prb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.nextLine();
        letters = letters.substring(1, letters.length() - 1);
        String[] chars = letters.split(",");

        // java - 8 solution
        System.out.println(Arrays.stream(chars)
                .map(String::trim)
                .filter(str -> str.length() > 0)
                .distinct()
                .count());

        // Brute force solution
//        Arrays.sort(chars, Comparator.comparing(String::trim));
//        String temp = "";
//        int count = 0;
//        for( String aChar : chars ) {
//            if(!temp.trim().equals(aChar.trim())) {
//                count++;
//            }
//            temp = aChar;
//        }
//        System.out.println(count);
    }
}
