package com.careercup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 09/10/13
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class CompareMirrorTree {
    static List<Integer> aList = new ArrayList<>();
    static List<Integer> a1List = new ArrayList<>();
    public static void main(String[] args){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.left = b;
        a.right = c;

        Node a1 = new Node(1);
        Node b1 = new Node(2);
        Node c1 = new Node(3);

        a1.left = c1;
        a1.right = b1;

        System.out.print(compareMirrorTree(a, a1));
    }
    public static boolean compareMirrorTree(Node a, Node a1)
    {

        createAList(a);
        createMirrorList(a1);
        if(aList.size()!=a1List.size()){
            return false;
        }

        for(int i=0;i<aList.size();i++)
        {

            if(aList.get(i)!=a1List.get(i)){
                return false;
            }


        }

        return true;
    }

    public static void createAList(Node root){

        if(root == null){
            return;
        }
        if(root.left!=null){
            createAList(root.left);
        }
        aList.add(root.data);
        if(root.right!=null){
            createAList(root.right);
        }
    }

    public static void createMirrorList(Node root){

        if(root == null){
            return;
        }
        if(root.right!=null){
            createMirrorList(root.right);
        }
        a1List.add(root.data);
        if(root.left!=null){
            createMirrorList(root.left);
        }
    }

    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }



}
