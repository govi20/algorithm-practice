package com.algo.codeforces;

import java.util.*;

/*
 * @Author: Govinda Sakhare
 * Email: govindasakhare20@gmil.com
 * Date: 27-Jul-2019
 */
public class Party {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        Node[] nodes = new Node[n+1];
        nodes[0] = new Node (-1);
        for(int i=0; i <=n;i++) {
            nodes[i] = new Node(i);
        }

        for(int i=1; i <=n;i++) {
            int num = sc.nextInt ();
            if(num == -1)
                num = 0;
            nodes[num].directReports.add(nodes[i]);
        }
        int count = 0;
        for(int i=0; i < n;i++) {
            if(!nodes[i].exploredAll) {
                count = count + explore (nodes[i], 0);
            }
        }
        System.out.println (count);

    }

    private static int explore(Node node, int count) {
        System.out.println ("exploring => "+ node.data);
        node.exploredAll = true;
        for(Node tempNode: node.directReports) {
            if(!tempNode.exploredAll) {
                tempNode.exploredAll = true;

                count = count + explore (tempNode, count);
            }
            else {
                count++;
                return count;
            }

        }
    //    return count;
        return count;
    }

    static class Node {
        int data;
        public List<Node> directReports;
        boolean exploredAll;
        Node(int data) {
            this.data = data;
            directReports = new ArrayList<> ();
;        }
    }
}
