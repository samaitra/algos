package com.gen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/24/13
 * Time: 8:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeDistanceBetweenNodes {

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

       int dist = findDistance(a,8,10);
       System.out.print(dist);
    }

    public static  int findDistance(Node root,int val1,int val2){

        List<Node> path1 = new ArrayList<>();
        List<Node> path2 = new ArrayList<>();

        findPath(root,val1,path1);
        findPath(root, val2, path2);
        System.out.println(path1.size());
        System.out.println(path2.size());
        if(path1.size()==0 || path2.size()==0)
            return -1;
        int i=0;
        for(;i<path1.size();i++){
           if(path1.get(i)!=path2.get(i)){
               break;
           }
        }
        return path1.size()+path2.size()-2*i;
    }

    public static boolean findPath(Node root,int val, List<Node> path){

        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }

        path.add(root);
        if(findPath(root.left,val,path) || findPath(root.right,val,path))
            return true;
        path.remove(root);
        return false;

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
