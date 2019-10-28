package com.algo.codechef.nov_2017_challenge;

import java.util.*;

public class ChefAndHappiness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for(int i=0; i< t;i++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for(int j=0;j < n;j++) 
                list.add(scanner.nextInt());
            map.put(i, list);
        }
        int i=0;
        HashMap<Integer, List<Integer>> temp = null;
        while(i < t) {
            List<Integer> list = map.get(i);
            temp = new LinkedHashMap<Integer, List<Integer>>();
            int j = 0; 
            for(int item: list) {
                if(temp.containsKey(item)) {
                    temp.get(item).add(j+1);
                }
                else {
                    List<Integer> indexes = new ArrayList<Integer>();
                    indexes.add(j+1);
                    temp.put(item, indexes);
                }
                j++;
            }
            Set<Integer> set = temp.keySet();
            boolean found = false;
            for(int item: set) {
                if(temp.get(item).size() > 1) {
                    List<Integer> indexes = temp.get(item);
                    int count = 0;
                    for(int index: indexes) {
                        if(set.contains(index)) {
                            count++;
                        }
                    }
                    if(count >= 2) {
                        System.out.println("Truly Happy");
                        found = true;
                        break;
                    }
                }
            }
            if(!found) {
                System.out.println("Poor Chef");
            }
            found = false;
            i++;
        }
    }

}
