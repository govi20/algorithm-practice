package com.algo.chl_500;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 05-Jan-2020
 * Postfix conversion
 */
public class Prb5 {
    public static void main(String[] args) {
        Stack< Character > stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();


        for( int i = 0; i < expression.length(); i++ ) {
            char c = expression.charAt(i);
            if(Character.isAlphabetic(c)) {
                System.out.print(c);
            } else {
                if( c == '*' || c == '(') {
                    stack.push(c);
                } else if( c == ')' ) {
                    while( !stack.empty() && stack.peek() != '(' ) {
                        System.out.print(stack.pop());
                    }
                    stack.pop();
                } else {
                    if(!stack.empty() && stack.peek() != '(')
                        System.out.print(stack.pop());
                    stack.push(c);
                }
            }
        }
        while( !stack.empty() )
            System.out.print(stack.pop());
    }
}
