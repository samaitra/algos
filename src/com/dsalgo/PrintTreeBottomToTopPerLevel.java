package com.dsalgo;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/18/13
 * Time: 12:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintTreeBottomToTopPerLevel {

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

        printLevelFromBottomToTop(a);
    }

    private static void printLevelFromBottomToTop(Node root) {

        LinkedList<Node> queue = new LinkedList<>();
        Node levelMarker = new Node(-1);
        Stack<Node> stack = new Stack();
        queue.add(root);
        queue.add(levelMarker);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            stack.push(node);
            if(node == levelMarker){
            if(queue.isEmpty()){
                break;
            }
            queue.add(levelMarker);
            continue;
            }

            if (node.right != null){
                queue.add(node.right);
            }
            if(node.left != null){
                queue.add(node.left);
            }
        }

        while (!stack.isEmpty()){
            Node node = stack.pop();
            if(node == levelMarker){
                System.out.println();
                continue;
            }
            System.out.print(node.value + "\t");
        }
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
