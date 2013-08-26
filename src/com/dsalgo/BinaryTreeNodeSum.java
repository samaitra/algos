package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/17/13
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
    public class BinaryTreeNodeSum {

    public static void main(String[] args)
    {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(8);
        Node g = new Node(6);
        Node h = new Node(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        f.left = g;
        f.right = h;
        printNice(a);
        System.out.println();
        makeSum(a);
        printNice(a);
    }

    public static int makeSum(Node root){

        if(root == null){
            return 0;
        }
        int nodeVal = root.data;
        int sum = makeSum(root.left) + makeSum(root.right);
        root.data = sum;
        return nodeVal+sum;


    }
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }

    }

    public static void printNice(Node root)
    {
        if (root == null)
            return;
        else
        {
            System.out.print(root.data);
            if (root.left != null)
            {
                System.out.print("L->[");
                printNice(root.left);
                System.out.print("]");
            }
            if (root.right != null)
            {
                System.out.print("R->[");
                printNice(root.right);
                System.out.print("]");
            }
        }
    }
    }
