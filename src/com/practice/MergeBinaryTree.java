package com.practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MergeBinaryTree{
	
	static LinkedList<Node> nodeList = new LinkedList<>();


    public static void main(String[] args){
       Node a = new Node(90);
       Node b = new Node(70);
       Node c = new Node(110);

       a.left = b;
       a.right = c;

       Node x = new Node(60);
       Node y = new Node(5);
       Node z = new Node(800);

       x.left = y;
       x.right = z;

      createLinkedList(a,x);
      Collections.sort(nodeList, new DataComparable());
      if((nodeList.size()%2==0)){
        nodeList.remove(nodeList.size()-1);
      }
       for(Node n : nodeList){
          System.out.print(n.data + " ");
       }
       System.out.println();
       Node root = createTree(nodeList);
       printTree(root);


    }

    private static void printTree(Node n){
        if(n==null){
            return;
        }
        System.out.println(n.data+" ");
        printTree(n.left);
        printTree(n.right);
    }

    public static Node createTree(LinkedList<Node> list){

      Node root = list.get(list.size()/2);
      System.out.println("root "+root.data);
      list.remove(root);

      addToTree(root,list);
      return root;
    }

    public static void addToTree(Node root, LinkedList<Node> linkedList){
        for(Node n : linkedList){
            addToTree(root, n.data);
        }
    }
    public static void addToTree(Node root,int n1){
        Node n = new Node(n1);
        if(n.data<root.data){
        if(root.left==null){
            root.left = n;
        }else{
            addToTree(root.left,n1);
        }

        }else{
            if(root.right==null){
                root.right = n;
            }else{
                addToTree(root.right,n1);
            }
        }


    }

    public static void createLinkedList(Node root1, Node root2){

        createList(root1, nodeList);
        createList(root2, nodeList);

    }

    public static void createList(Node root,LinkedList<Node> nodeList){

        if(root==null){
            return;
        }
        nodeList.add(root);
        createList(root.left,nodeList);
        createList(root.right,nodeList);

    }

    static class Node{

        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }

    }

    static class DataComparable implements Comparator<Node>{

        public int compare(Node o1, Node o2) {
            Node n1 = (Node) o1;
            Node n2 = (Node) o2;

            Integer d1 = n1.data;
            Integer d2 = n2.data;
            return d1.compareTo(d2);
        }
    }



}

