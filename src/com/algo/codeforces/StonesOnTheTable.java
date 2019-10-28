package com.algo.codeforces;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 23-Jul-2019
 */
public class StonesOnTheTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt ();
        String str = scanner.next ();
        int result = 0;
        char temp=' ';
        boolean flag = true;
        int tempCount = 0;
        for (int i = 0; i < n; i++) {
            if (flag) {
                temp = str.charAt (i);
                flag = false;
                continue;
            }
            char ch = str.charAt (i);
            if(temp == ch) {
                tempCount++;
                continue;
            }
            else {
                if(tempCount > 0) {
                    result = result + tempCount;
                }
                tempCount = 0;
                temp = ch;
            }
        }
        if(tempCount > 0)
            result = result + tempCount;

        System.out.println (result);

    }
}
