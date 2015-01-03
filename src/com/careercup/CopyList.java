package com.careercup;

/**
 * Created by saikat on 02/01/15.
 * Given a linked list where apart from the next pointer,
 * every node also has a pointer named random which can
 * point to any other node in the linked list.
 * Make a copy of the linked list.
 */
public class CopyList {


    public Node copyList(Node head){

        CopyList.Node n = head;
        while(n.next!=null){

            CopyList.Node n1 = new CopyList.Node();
            n1.data = n.data;
            n1.next = n.next;
            n.next  = n1;
            n = n.next.next;
        }

        n = head;

        while (n.next != null){

            n.next.random = n.random.next;
            n = n.next.next;
        }

        n = head;
        Node head1 = n.next;

        while(n.next!=null){

            CopyList.Node temp = n.next.next;
            n.next.next = (temp.next!=null) ? temp:null;
            n.next = temp;
            n=temp;

        }

        return head1;
    }


    public class Node{

        int data;
        Node next;
        Node random;
    }

}
