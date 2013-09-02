package com.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Sample{
	
	    public static void main(String[] args){

            Node a = new Node(1);
            Node b = new Node(1);
            Node c = new Node(1);
            Node d = new Node(3);
            Node e = new Node(4);
            Node f = new Node(5);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next = null;


            Node head = removeDuplicates(a);
            while(head!=null){
                System.out.print(head.data+" ");
                head = head.next;
            }

        }
    public static Node removeDuplicates(Node n){
        Node head = n;

        List<Node> dupList = new ArrayList<>();

        while(n!=null && n.next!=null){

            if(n.data==n.next.data){
                dupList.add(n);
                n.next = n.next.next;

            }
            else {
                n = n.next;
            }

        }

        for(Node i : dupList){
           n = head;

           if(i.data == head.data){
               head = head.next;
           }
           while(n.next!=null){
               if(n.next.data==i.data){
                   n.next = n.next.next;
               } else{
                   n = n.next;
               }
           }

        }


        return head;

    }

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }

    }

}


