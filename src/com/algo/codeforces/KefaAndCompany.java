package com.algo.codeforces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 28-Jul-2019
 */
public class KefaAndCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt ();
        int d = sc.nextInt ();
        List<Friend> friends = new ArrayList<> ();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt ();
            int factor = sc.nextInt ();
            friends.add (new Friend (money, factor));
        }

        //   System.out.println (friends);
        long factor = 0;
        long tempFactor = 0;
     //   if (friends.size () > 1) {
            Comparator<Friend> friendComparator = Comparator.comparing (Friend::getMoney)
                    .thenComparing (Friend::getFactor); //.reversed ();
            friends.sort (friendComparator);
            // System.out.println (friends);
            for (int i = 0; i < n; i++) {
                Friend friend1 = friends.get (i);
                tempFactor = friend1.getFactor ();
                int money1 = friend1.getMoney ();
                Friend friend2 = null;
                for (int j = i + 1; j < n; j++) {
                    friend2 = friends.get (j);
                    int money2 = friend2.getMoney ();
           //         System.out.println (i +" ** " + friend2.getFactor ());
                    if (Math.abs (money2 - money1) < d) {
                  //      System.out.println (friend1+" :: "+friend2);
                        tempFactor = tempFactor + friend2.getFactor ();
                    }
                //    money1 = money2;
                }
         //       System.out.println (i + " => " + tempFactor);
                if (tempFactor > factor) {
                    factor = tempFactor;
                }
            }

            System.out.println (factor);
       /* }
        else {
            System.out.println (friends.get (0).getFactor ());
        }*/
    }
    static class Friend {
        int money;
        int factor;

        public Friend(int money, int factor) {
            this.money = money;
            this.factor = factor;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public int getFactor() {
            return factor;
        }

        public void setFactor(int factor) {
            this.factor = factor;
        }

        @Override
        public String toString() {
            return "{ "+money+", "+factor+" }";
        }
    }
}
