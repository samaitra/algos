package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/16/13
 * Time: 12:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class KthNodeFromEnd {

    public static void main(String[] args){

    Node head = new Node(1);
    head.add(2).add(3).add(4).add(5).add(6).add(7).add(8).add(9).add(10);

        Node res = findKthElement(head,3);
        System.out.println(res.data);
    }

    private static Node findKthElement(Node head, int k) {

        Node first = head;
        int c = 0;
        while(c<k){
            first = first.next;
            c++;
        }

        Node sec = head;
        while(first!=null){
            first=first.next;
            sec = sec.next;
        }
        return sec;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
        public Node add(int data){
            Node n = new Node(data);
            next = n;
            return n;
        }
    }
}
