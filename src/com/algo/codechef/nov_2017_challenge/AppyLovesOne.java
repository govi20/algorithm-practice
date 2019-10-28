package com.algo.codechef.nov_2017_challenge;

import java.util.Scanner;

public class AppyLovesOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int k = sc.nextInt();
        int[] elements = new int[n];
        boolean allOne = true;
        boolean allZero = true;
        boolean isLongestAtBegining = false;
        for(int i=0; i< n;i++) {
            elements[i] = sc.nextInt();
            if(elements[i]==0)
                allOne = false;
            else
                allZero = false;
        }

        String operations = sc.next();
        if(!allOne && !allZero) {
            for(int i=0; i<q;i++) {
            char operation = operations.charAt(i);
            if(operation == '!') {
                int temp = elements[n-1];
                //int first = elements[j];
                for(int j=0;j<n;j++) {
                    int curr = elements[j];
                    elements[j] = temp;
                    temp = curr;
                }
            }
            else {
                int longest = 0;
                int temp = 0;
                for(int j = 0; j < n;j++) {
                    if(elements[j] == 1) {
                        temp++;
                    }
                    else {
                        if(temp > longest) {
                            longest = temp;
                            
                        }
                        temp = 0;
                    }
                }
                if(temp > longest) longest = temp;
                if(longest > k) longest = k;
                System.out.println(longest);
            }
            }
        }
        else {
            if(allZero) {
                System.out.println(0);
            }
            else {
                System.out.println(k);
            }
        }
    }
    
}