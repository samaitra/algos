package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/18/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckBST {
    public static void main(String[] args)
    {
        Node a=new Node(12);
        Node b=new Node(3);
        Node c=new Node(15);
        Node d=new Node(10);
        Node e=new Node(14);
        Node f=new Node(17);
        Node g=new Node(4);
        Node h=new Node(11);
        Node i=new Node(5);
        a.left=b;
        a.right=c;
        b.right=d;
        c.left=e;
        c.right=f;
        d.left=g;
        d.right=h;
        g.right=i;
        System.out.println(isBST(a));

    }

    public static boolean isBST(Node root){
        return checkBooleanAndReturn(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public static boolean checkBooleanAndReturn(Node root, int max, int min){
        if (root == null)
            return true;
        boolean leftOk = true;
        boolean rightOk = true;
        boolean centerOk = true;


        if(root.left!=null)
            leftOk = checkBooleanAndReturn(root.left,root.value,min);
        if(root.value>=min && root.value<=max)
            centerOk=true;
        else
            centerOk=false;
        if(root.right!=null)
            rightOk = checkBooleanAndReturn(root.right,max,root.value);

        return (leftOk && rightOk && centerOk);

    }

    static class Node
    {
        public Node left;
        public Node right;
        public int value;
        public Node(int value)
        {
            this.value=value;
        }
    }
}
