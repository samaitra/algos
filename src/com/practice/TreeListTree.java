package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 26/08/13
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeListTree {
    static NodeContainer head = new NodeContainer();
    static NodeContainer link = new NodeContainer();
    static Node h,l;
    public static void main(String[] args){


         Node a = new Node(50);
         Node b = new Node(40);
         Node c = new Node(60);
         Node d = new Node(35);
         Node e = new Node(45);
         Node f = new Node(55);
         Node g = new Node(65);

         a.left = b;
         a.right = c;
         b.left = d;
         b.right = e;
         c.left = f;
         c.right = g;

        //printTree(a);
        //convertToLinkedList(a, head, link);
        convertToLinkedList(a);
        printList(a);
        convertToTree(a);

       }
        public static void printTree(Node root){
            // pre-order traversal
            if(root==null){
                return;
            }
            printTree(root.left);
            printTree(root.right);
            System.out.println(root.data);


        }

        public static void convertToLinkedList(Node root,NodeContainer head,NodeContainer link){


            if(root==null){
                return;
            }
            if(head.node == null && root!=null){
                head.node = root;
            }
            if(link.node!=null){
                link.node.next = root;
            }
            link.node = root;
            convertToLinkedList(root.left,head,link);
            convertToLinkedList(root.right,head,link);

        }
        public static void convertToLinkedList(Node root){

            if(root==null)
                return;
            if(h==null){
                h=root;
            }
            if(l!=null){
                l.next=root;

            }
            l = root;
            convertToLinkedList(root.left);
            convertToLinkedList(root.right);

        }
        public static void printList(Node head){
            while(head !=null){
            System.out.println(head.data);
            head = head.next;
            }
        }

        static class Node{
            int data;
            Node left;
            Node right;
            Node next;
            Node parent;

            public Node(int data){
                this.data = data;
            }
        }

        static class NodeContainer{
            Node node;
        }

}
