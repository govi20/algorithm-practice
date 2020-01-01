package com.algo.codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 12-Nov-2019
 */
public class ListMax {

    public static void main(String[] args) {
        List< List< Integer > > list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, 10));
        list.add(Arrays.asList(2, 4, 5));
        list.add(Arrays.asList(3, 5, 12));
        System.out.println(listMax(5, list));
    }

    public static long listMax(int n, List< List< Integer > > operations) {
        long[] arr = new long[n];

        for( List< Integer > operation : operations ) {
            int startIndex = operation.get(0) - 1;
            int endIndex = operation.get(1);
            int value = operation.get(2);

            IntStream.range(startIndex, endIndex)
                    .boxed()
                    .forEach(index -> arr[index] = arr[index] + value);

        }

        long maxValue = Arrays.stream(arr)
                .max()
                .getAsLong();

        return maxValue;
    }
}
