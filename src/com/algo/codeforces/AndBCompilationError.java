package com.algo.codeforces;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 28-Jul-2019
 */
public class AndBCompilationError {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int sum1 = 0;
        int t = 0;
        int[] output = new int[2];
        while(t<3) {
            int num = 0;
            for (int i = 0; i < a; i++) {
                num = num + sc.nextInt ();
            }
            if(sum1 == 0 ) {
                sum1 = num;
            }
            else {
                output[t-1] = (sum1 - num);
                sum1 = num;
            }
            t++;
            a--;
        }

        for(int ou: output)
            System.out.println (ou);
    }
}
