package com.algo.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 17-Nov-2019
 */
public class AlphaNumericCombination {
    public static void main(String[] args) {
        System.out.println (calculatePossibleCombinations ("2112"));
    }

    public static long calculatePossibleCombinations(String inputStr) {
        List<Integer> zeroIndex = new ArrayList<> ();
        List<Integer> nextIndex = new ArrayList<> ();
        for (int i = 0; i < inputStr.length (); i++) {
            if(Character.getNumericValue (inputStr.charAt (i))==0) {
                zeroIndex.add (i);
            }
            else if(Integer.valueOf (""+inputStr.charAt (i)) > 6) {
                nextIndex.add (i+1);
            }
        }
        long count = 0;
        for (int i = 0; i < inputStr.length (); i++) {
            if(zeroIndex.contains (i) || zeroIndex.contains (i+1)) {
                continue;
            }
            else {
                // count++;

                if(Integer.valueOf (inputStr.charAt (i)) <=2 && !nextIndex.contains (i)) {
                   // System.out.println (""+inputStr.charAt (i));
                    count++;
                }
            }
         }

         return count+1;
    }
}
