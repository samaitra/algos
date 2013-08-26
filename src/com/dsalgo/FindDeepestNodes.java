package com.dsalgo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/18/13
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindDeepestNodes {
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

        List<Node> nodes = findDeepestNodes(a);
        for (Node node : nodes)
        {
            System.out.print(node.value + ", ");
        }

    }

    public static List<Node> findDeepestNodes(Node root){
        int level = 1;
        Object[] levelNodes = new Object[2];
        levelNodes[0] = 0;
        levelNodes[1] = new ArrayList<Node>();
        findDeepestNodes(root, level, levelNodes);
        return (List)levelNodes[1];

    }

    public static void findDeepestNodes(Node root, int level, Object[] levelNodes){

        if(root==null){
            return;
        }

        if((Integer)levelNodes[0]<=level){

            if((Integer) levelNodes[0]<level){
                ((List)levelNodes[1]).clear();
            }

            levelNodes[0] = level;
            ((List)levelNodes[1]).add(root);

        }
        findDeepestNodes(root.left, level+1, levelNodes);
        findDeepestNodes(root.right, level+1,levelNodes);
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
