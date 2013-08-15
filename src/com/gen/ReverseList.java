package com.gen;

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
        printReverseListRecursive(a);
        printReverseListIterative(a);
    }

    private static void printReverseListIterative(Node a) {


    }

    public static void printReverseListRecursive(Node n){
        if(n.next==null)
        {
            System.out.println(n.data);
            return;
        }
        printReverseListRecursive(n.next);
        System.out.println(n.data);


    }


    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
}
