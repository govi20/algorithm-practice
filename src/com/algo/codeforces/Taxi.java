package com.algo.codeforces;

import java.util.Scanner;

public class Taxi {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int[] groups = new int[n];
        for(int i=0; i < n;i++) {
            groups[i] = sc.nextInt ();
        }

        int count = 0;

        //send all the groups with count = 4 or greater than 4 and adjust the count
        for(int i = 0;i<groups.length;i++) {
            int group = groups[i];
            if(group == 4) {
                count++;
                groups[i] = 0;
            }
            else if(group > 4) {
                int howmany = group / 4;
                int rem = group % 4;
                groups[i] = rem;
                count = count + howmany;
            }
            i++;
        }

        int one = 0;
        int two = 0;
        int three = 0;

        //count groups with capacitys 1s 2s and 3s
        for(int j=0;j<groups.length;j++) {
            if(groups[j] == 1) {
                one++;
            }
            else if(groups[j] == 2) {
                two++;
            }
            else if(groups[j] == 3) {
                three++;
            }
        }

        // send all 1s and 3s together
        while(one >= 1 && three >= 1) {
            one--; three--; count++;
        }

        // send remaining 3s as they would not fit with 2
        if(three > 0) {
            count = count + three;
            three = 0;
        }

        // send 2s in pair
        while (two > 1) {
            two = two - 2;
            count++;
        }

        // send remaining group of 2 with 1s
        if(two >= 1) {
            count++;
            two = 0;
            one = one - 2;
        }

        // at last send all the groups with capacity 1 together
        while (one > 0) {
            one = one - 4;
            count++;
        }

        System.out.println (count);
    }
}
