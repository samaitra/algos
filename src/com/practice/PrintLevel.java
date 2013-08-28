package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 28/08/13
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintLevel {

    public static void main(String[] args){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        f.left = h;

        printTree(a,2);
    }

    public static void printTree(Node root, int depth){

        if(root==null){
            return;
        }
        if(depth==1){
            System.out.println(root.data);
        }
        printTree(root.left,depth-1);
        printTree(root.right,depth-1);

    }


    static class Node{
        int data;
        public Node(int data){
            this.data = data;
        }

        Node left;
        Node right;
    }

}
