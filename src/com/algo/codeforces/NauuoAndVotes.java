package com.algo.codeforces;

import java.util.*;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 23-Jul-2019
 */
public class NauuoAndVotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String str = scanner.next ();

        char[] chars = str.toCharArray ();
        Arrays.stream (new char[][]{chars})
                .distinct ().forEach (System.out::println);


        Set<Character> characters = new HashSet<> ();
        for(int i = 0;i < str.length () ;i++) {
            characters.add (str.charAt (i));
        }
        int count = characters.size ();
        if(count % 2 == 0) {
            System.out.println ("CHAT WITH HER!");
        }
        else {
            System.out.println ("IGNORE HIM!");
        }
    }
}
