package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/24/13
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class DiameterOfBInaryTree {

    public static void main(String[] args){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);
        Node k = new Node(11);
        Node l = new Node(12);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        g.left = h;
        g.right = i;
        d.left = j;
        d.right = k;
        h.left = l;

        int dia = getDiameter(a);
        System.out.println(dia);
    }



    public static int getDiameter(Node root){

        if(root==null)
            return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        int leftDiameter = getDiameter(root.left);
        int rightDiameter = getDiameter(root.right);

        return Math.max(Math.max(leftDiameter,rightDiameter),leftHeight+rightHeight+1);
    }

    public static int getHeight(Node root){

        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;


    }




    static class Node{

        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;

        }

    }



}
