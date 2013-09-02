package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/15/13
 * Time: 2:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseList {
    public static void main(String[] args){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;
        c.next = null;
        Node head = reverseList(a);
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;

        }
    }

    public static Node reverseList(Node n){
        Node cur = n;
        Node prv = null;
        Node nxt = null;

        while(cur!=null){

          nxt = cur.next;
          cur.next = prv;
          prv = cur;
          cur=nxt;
        }
        return prv;
    }


    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
}
