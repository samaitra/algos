package com.is;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 9/23/13
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class PreOrderBinaryTree {

    public static void main(String[] args) throws Exception{
        //BufferedReader bufferedReader = new BufferedReader(new FileReader("in"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        ArrayList<Character> charsList = new ArrayList<>();
        while((line=bufferedReader.readLine())!=null){
          char[] chars = line.toCharArray();
          for(int i=0;i<chars.length;i++){
             charsList.add(chars[i]);
          }
        }
       Node n = null;
       BinarySearchTree binarySearchTree = new BinarySearchTree();
       for(int i=(charsList.size()-1);i>=0;i--){
           //System.out.println(charsList.get(i));
           n = binarySearchTree.add(charsList.get(i));

       }

       printTree(n);

    }

    private static void printTree(Node root){


            if(root==null){
                return;
            }
            System.out.print(root.value);
            printTree(root.left);
            printTree(root.right);



    }

    private static class Node{
        Character value;
        Node left;
        Node right;

        public Node(Character value){
            this.value = value;
        }

    }

    private static class BinarySearchTree{

        Node root;

        public Node add(Character num){
            if (root == null){
                root = new Node(num);
            }else{
                add(root,num);
            }
         return root;
        }

        public void add(Node root, Character num){
            Node node = new Node(num);
            if(node.value < root.value){
                if(root.left == null)
                    root.left = node;
                else
                    add(root.left, num);
            }else{
                if(root.right == null)
                    root.right = node;
                else
                    add(root.right,num);
            }
        }


    }


}
