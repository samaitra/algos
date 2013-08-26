package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/18/13
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeKthSmallest {

    public static void main(String[] args){

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] arr = { 12, 4, 5, 6, 2, 7, 8, 11, 2, 3 };
        for (int num : arr)
        binarySearchTree.add(num);
        System.out.println(binarySearchTree.getOrdered(1));
    }

    private static class BinarySearchTree{

       Node root;

       public void add(int num){
           if (root == null)
               root = new Node(num);
           else
               add(root,num);
       }

        public void add(Node root, int num){
            Node node = new Node(num);
            if(node.value < root.value){
                root.leftWeight++;
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

        public int getOrdered(int k){
            return getOrdered(root,k);
        }

        public Integer getOrdered(Node root,int k){
            if(root == null)
                return null;
            if(root.leftWeight > k)
                return getOrdered(root.left,k);
            else if(root.leftWeight < k)
                return getOrdered(root.right,k-root.leftWeight);
            else
                return root.value;
        }


    }

    private static class Node{
        int value;
        int leftWeight;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            this.leftWeight = 1;
        }

    }

}
