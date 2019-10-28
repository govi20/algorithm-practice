package com.algo.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 27-Jul-2019
 */
public class TeamOlympiad {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int[] st = new int[a];
        for(int i = 0; i<st.length;i++)
            st[i] = sc.nextInt ();

        int one = 0, two = 0, three = 0;
        List<Integer> ones = new ArrayList<> ();
        List<Integer> twos = new ArrayList<> ();
        List<Integer> threes = new ArrayList<> ();
        int index  = 1;
        for(int num : st) {
            if(num == 1) {
                ones.add (index);
                one++;
            }
            if(num == 2) {
                twos.add (index);
                two++;
            }
            if(num == 3) {
                threes.add (index);
                three++;
            }
            index++;
        }

        int count = Math.min (one, Math.min (two, three));
        System.out.println (count);
        for(int i=0; i < count;i++) {
            System.out.println (""+ones.remove (0) + " "+ twos.remove (0)+" "+ threes.remove (0));
        }
    }
}
