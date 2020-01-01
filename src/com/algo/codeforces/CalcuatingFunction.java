package com.algo.codeforces;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.LongStream;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 10-Nov-2019
 */
public class CalcuatingFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("9223267951799795282".length ());
        long n = scanner.nextLong ();

        long totalSum = (n * (n+1)) /2;
        long evenSum = ((n/2) * ((n/2)+1));
        long oddSum = -(totalSum - evenSum);
        System.out.println (evenSum + oddSum);

        System.out.println (LongStream.range (1, 208170109961052L)
                .map (CalcuatingFunction::convert)
                .sum ());

        BigInteger bigInt = new BigInteger ("208170109961052");
        BigInteger add1Main = bigInt.add (new BigInteger ("1"));

        BigInteger divideBy2 = bigInt.divide (new BigInteger ("2"));
        BigInteger add1 = divideBy2.add (new BigInteger ("1"));
        BigInteger evenSumBg = divideBy2.multiply (add1);
        BigInteger mainSum = bigInt.multiply (add1).divide (new BigInteger ("2"));

        BigInteger oddSumMinus = mainSum.subtract (evenSumBg).multiply (new BigInteger ("-1"));

        System.out.println (evenSumBg.add (oddSumMinus).toString ());

    }

    private static long convert(long i) {
        return i % 2 == 0 ? i : -i;
    }
}
