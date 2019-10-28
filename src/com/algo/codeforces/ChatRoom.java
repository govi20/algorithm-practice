package com.algo.codeforces;

import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 23-Jul-2019
 */
public class ChatRoom {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String str = sc.next ();

        String finalStr = "hello";

        // xqjqmenkodmlhzyzmmvofdngktygbbxbzpluzcohohmalkoeuwfikblltaaigv
        int j = 0;
        for (int i = 0; i < str.length (); i++) {
            if(finalStr.charAt (j) == str.charAt (i)) {
                j++;
            }

            if(j == finalStr.length ())
                break;
        }
      //  System.out.println ();
        if(j == finalStr.length ())
            System.out.println ("YES");
        else
            System.out.println ("NO");
    }
}
