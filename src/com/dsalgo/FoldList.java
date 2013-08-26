package com.dsalgo;

public class FoldList {

    public static void main(String[] args){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        printList(a);
        foldList(a);
        printList(a);

    }

    public static void foldList(Node a){
      Node f = a;
      Node s = a;

    while(f != null){
        s = s.next;
        f = f.next;
        if(f != null){
            f = f.next;
        }

    }
      Node m = s;
      Node revLastHalf = reverseList(s);

      while(revLastHalf != null && a != m ){
          Node th = a.next;
          Node tr = revLastHalf.next;
          revLastHalf.next = a.next;
          a.next = revLastHalf;
          a = th;
          revLastHalf = tr;

      }

        if(revLastHalf != null){
            revLastHalf.next = null;
        }else{
            a.next = null;
        }



    }

    private static Node reverseList(Node head) {
        if (head.next==null)
            return head;

        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void printList(Node n){
        if(n.next==null)
        {
            System.out.println(n.data);

            return;
        }
        System.out.print(n.data + "->");
        printList(n.next);
    }

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

}
