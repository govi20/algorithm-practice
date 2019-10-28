package com.algo.codeforces;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HelfulMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<> ();
        for(int i=0;i<s1.length ();i++) {
            if(s1.charAt (i)=='+')
                continue;
            else {
                priorityQueue.add (Integer.valueOf (""+s1.charAt (i)));
            }
        }

        StringBuilder sb = new StringBuilder ();
        while (!priorityQueue.isEmpty ()) {
            if(priorityQueue.size ()==1)
                sb.append (priorityQueue.poll ());
            else
                sb.append (priorityQueue.poll ()+"+");
        }
        System.out.println (sb.toString ());
    }
}
