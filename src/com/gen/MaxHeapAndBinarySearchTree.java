package com.gen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/13/13
 * Time: 8:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxHeapAndBinarySearchTree {

   public static void main(String[] args){

       List list = new ArrayList<>();
       for(int i=0;i<list.size();i++){
           list.add(new Node((int)(30 * Math.random()),(int)(30 * Math.random())));
       }

       Node root;
       root = createHeapAndBST(list);
       printNice(root);
   }

    private static Node createHeapAndBST(List list) {



        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private static void printNice(Node root) {
        //To change body of created methods use File | Settings | File Templates.
    }

    static class Node{

    public Node left;
    public Node right;
    public int heapVal;
    public int treeVal;

    public Node(int heapVal, int treeVal){
        this.heapVal = heapVal;
        this.treeVal = treeVal;
    }
   }


}
