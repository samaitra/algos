package com.dsalgo;

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

       List<Node> list = new ArrayList<Node>();
       for(int i=0;i<10;i++){
           list.add(new Node((int)(30 * Math.random()),(int)(30 * Math.random())));
       }

       Node root;
       root = createHeapAndBST(list);
       printNice(root);
   }

    private static Node createHeapAndBST(List<Node> list) {

        if(list.size()==0){
            return null;
        }
        Node top = list.get(0);


        for(Node node:list){

            if (node.heapVal>top.heapVal){
                    top = node;
            }
        }

        list.remove(top);

        List<Node> leftList = new ArrayList<>();
        List<Node> rightList = new ArrayList<>();

        for(Node node : list){
            if(node.treeVal<=top.treeVal){
                leftList.add(node);
            }else{
                rightList.add(node);
            }
        }

        top.left = createHeapAndBST(leftList);
        top.right = createHeapAndBST(rightList);
        return top;


    }

    private static void printNice(Node root) {
        //To change body of created methods use File | Settings | File Templates.

        if(root==null){
            return;
        }else{
            System.out.print("("+root.heapVal+","+root.treeVal+")");
            if(root.left!=null){
                System.out.print("L->[");
                printNice(root.left);
                System.out.print("]");
            }
            if(root.right!=null){
                System.out.print("R->[");
                printNice(root.right);
                System.out.print("]");
            }


        }

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
