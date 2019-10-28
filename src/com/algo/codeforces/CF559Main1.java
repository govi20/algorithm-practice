package com.algo.codeforces;

import java.util.Scanner;

public class CF559Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        String s = scanner.next ();
        Animal a = new Animal (1, "xyz");
        int t = 0;
        boolean flag = false;
        for(int i=0; i<s.length ();i++) {
            if(s.charAt (i)=='+') {
                flag = true;
            }

            if(flag) {
                if(s.charAt (i)=='+') {
                    t++;
                }
                else {
                    t--;
                }
            }
        }
        System.out.println (t);
    }
}


class Animal {


    int id;
    String name;

    public Animal(int id, String name) {
        this.id=id; this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        Animal animal = (Animal) o;

        if (id != animal.id) return false;
        return name != null ? name.equals (animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode () : 0);
        return result;
    }
}