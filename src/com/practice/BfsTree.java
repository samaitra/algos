package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 28/08/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class BfsTree {
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

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        d.left = g;
        d.right = h;
        c.right = f;
        f.left = i;
        f.right = j;

        bfs(a);

    }
    public static void bfs(Node root){

        LinkedList<Node> queue = new LinkedList<Node>();
        //Stack<Node> stack = new Stack<Node>();
        List<Node> numList = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            numList.add(node);

            if(node.left!=null)
                queue.add(node.left);
            if(node.right!=null)
                queue.add(node.right);

        }

        for(Node n : numList){
            System.out.print(n.data+" ");
        }
    }



    static class Node{
    int data;
    Node left;
    Node right;
    Node next;
    Node parent;

    public Node(int data){
        this.data = data;
    }
}


}
