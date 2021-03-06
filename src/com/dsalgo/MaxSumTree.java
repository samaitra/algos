package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/18/13
 * Time: 7:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxSumTree {

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
        int maxSum = findMaxSum(a);
        System.out.println(maxSum);
    }

    public static int findMaxSum(Node root){
        if(root==null)
            return 0;
        return (root.value + Math.max(findMaxSum(root.left),findMaxSum(root.right)));
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
