package com.algo.codeforces;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 28-Jul-2019
 */
public class QueueAtTheSchool {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt ();
        int sec = sc.nextInt ();
        String seq = sc.next ();
        boolean isPending = verify(seq);
        if(!isPending) {
            System.out.println (seq);
        }
        else {
            StringBuilder str = new StringBuilder (seq);
            while(sec > 0) {
                for (int i = 0; i < seq.length ()-1; i++) {
                    if(str.charAt (i) == 'B' && str.charAt (i+1) == 'G') {
                        str.setCharAt (i, 'G');
                        str.setCharAt (i+1, 'B');
                        i = i + 1;
                    }
                }
                isPending = verify (str.toString ());
                if(!isPending){
                    System.out.println (str.toString ());
                    return;
                }
                sec--;
            }
            System.out.println (str.toString ());
        }
    }

    private static boolean verify(String seq) {
        for (int i = 0; i < seq.length ()-1; i++) {
            if(seq.charAt (i) == 'B' && seq.charAt (i+1) == 'G')
                return true;
        }
        return false;
    }
}
