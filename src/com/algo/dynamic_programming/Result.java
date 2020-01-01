package com.algo.dynamic_programming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 17-Nov-2019
 */
public class Result {

    public static int lastStoneWeight(List<Integer> weights) {

        weights.sort (Comparator.reverseOrder ());
        System.out.println (weights);
        int mainSum = 0;

        for(int i=0; i+1<weights.size ();i=i+2) {
            int sum = weights.get (i);
            int sum2 = weights.get (i+1);
            if(mainSum < sum2)
                mainSum = sum - sum2 -mainSum;
            else {
                mainSum = mainSum - sum - sum2;
            }
        }

        if(weights.size () % 2 != 0) {
            return Math.abs (mainSum- weights.get (weights.size ()-1));
        }

        return mainSum;
    }





    public static void main(String[] args) {
        System.out.println (lastStoneWeight (Arrays.asList (2,4,5)));
    }
}

