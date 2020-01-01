package com.algo.codechef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 10-Nov-2019
 */
public class NumberToRoman {



/*
    public static String romanizer(int number) {
        setup();
        String romanString = "";
        if (map.containsKey (number)) {
            return map.get (number);
        }
        else {
            int fact = 1;
            while(number !=0) {
                int dig = number % 10;
                String fnlString = map.containsKey (dig*fact) ? map.get (dig*fact) : map.get (dig) + map.get (fact);
                romanString = fnlString + romanString;
                number = number / 10;
                fact = fact * 10;
            }
        }
        return romanString;
    }
*/

    static HashMap<Integer, String> map = new HashMap ();

    public static String romanizer(int number) {
        setup ();
        List<String> list = new ArrayList<String> ();
      //  for(int number: numbers) {
            String romanString = "";
            if (map.containsKey (number)) {
                return map.get (number);
            }
            else {
                int fact = 1;
                while(number !=0) {
                    int dig = number % 10;

                    String fnlString = map.containsKey (dig*fact) ? map.get (dig*fact) : map.get (dig) + map.get (fact);
                    romanString = fnlString + romanString;
                    number = number / 10;
                    fact = fact * 10;
                }

            }

        return romanString;
    }

    private static void setup() {
        map.put (0, "");
        map.put (1, "I");
        map.put (2, "II");
        map.put (3, "III");
        map.put (4, "IV");
        map.put (5, "V");
        map.put (6, "VI");
        map.put (7, "VII");
        map.put (8, "VIII");
        map.put (9, "IX");
        map.put (10, "X");
        map.put (20, "XX");
        map.put (30, "XXX");
        map.put (40, "XL");
        map.put (50, "L");
        map.put (60, "LX");
        map.put (70, "LXX");
        map.put (80, "LXXX");
        map.put (90, "XC");
        map.put (100, "C");
        map.put (100, "CC");
        map.put (100, "CCC");
        map.put (400, "CD");
        map.put (500, "D");
        map.put (600, "DC");
        map.put (700, "DCC");
        map.put (800, "DCCC");
        map.put (900, "CM");
        map.put (1000, "M");;
    }
    public static void main(String[] args) {
        //List<Integer>
        System.out.println (romanizer (600));
    }

}


