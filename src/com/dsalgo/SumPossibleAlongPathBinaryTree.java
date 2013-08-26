package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/18/13
 * Time: 6:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class SumPossibleAlongPathBinaryTree {

    public static void main(String[] args)
    {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;
        f.left = g;

        boolean result = isSumPossibleAlongAnyPath(a, 6);
        System.out.println(result);
    }

    private static boolean isSumPossibleAlongAnyPath(Node root, int k) {

        return isSumPossibleAlongAnyPath(root, k , k);
    }

    private static boolean isSumPossibleAlongAnyPath(Node root, int k, int originalK){
       if(root == null)
           return false;
        if(k == 0)
            return true;
        return isSumPossibleAlongAnyPath(root.left, k-root.value, originalK)
                || isSumPossibleAlongAnyPath(root.right, k-root.value, originalK)
                || isSumPossibleAlongAnyPath(root.left, originalK, originalK)
                || isSumPossibleAlongAnyPath(root.right, originalK, originalK);

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
