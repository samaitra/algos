package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/17/13
 * Time: 12:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class LowestCommonAncestor {

    public static void main(String[] args){

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
        c.left = e;
        c.right = f;
        f.left = g;
        f.right = h;
        //printTree(a);
        Node ancestor = getLowestCommonAncestor(a, d, c);
        System.out.println(ancestor.data);
    }

    private static void printTree(Node root) {
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    private static Node getLowestCommonAncestor(Node root, Node n1, Node n2) {

      if(root == null)
          return null;
      if(root == n1 || root == n2)
          return root;

      boolean isn1Left = checkNode(root.left,n1);
      boolean isn2Left = checkNode(root.left,n2);

      if(isn1Left != isn2Left){
          return root;
      }

      Node childSide = isn1Left?root.left:root.right;
      return getLowestCommonAncestor(childSide,n1,n2);

    }
    public static boolean checkNode(Node root, Node n){

        if(root==n)
            return true;
        if(root==null)
            return false;
        return (checkNode(root.left,n) || checkNode(root.right,n));
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
