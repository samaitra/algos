package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/18/13
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintNodeOfSameLevel {
    public static void main(String[] args)
    {
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
        c.left = e;
        c.right = f;
        f.left = g;
        f.right = h;

        printLevelofDepth(a, 3);
    }

    private static void printLevelofDepth(Node root, int i) {
        if(root==null){
            return;
        }
        if(i==1){
            System.out.println(root.value);
            return;
        }
        printLevelofDepth(root.left,i-1);
        printLevelofDepth(root.right,i-1);

    }

    static class Node
    {
        Node left;
        Node right;
        int value;

        public Node(int value)
        {
            this.value = value;
        }
    }
}
