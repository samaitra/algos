package com.careercup;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 15/09/13
 * Time: 9:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class BSTTwoNodesSumUptoK {
    static String str = null;
    public static void main(String[] args){

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] arr = { 12, 4, 5, 6, 2, 7, 8, 11, 2, 3,15,17,20,25 };
        Node root=null;
        for (int num : arr){
          Node n = binarySearchTree.add(num);
          if(n!=null){
               root = n;
          }
        }
        findSumNodeToK(root,10,root);
        System.out.println(str);
    }
    private static void findSumNodeToK(Node root,int x, Node mainRoot){

        if(root==null){
            return;
        }

        int y = x-root.value;
        if(findSecondNode(mainRoot,y)){
            str = root.value+" , " +y;
        }

        if(root.value>x){
            findSumNodeToK(root.left,x,mainRoot);
        }else {
            findSumNodeToK(root.right,x,mainRoot);
        }

    }
    static boolean findSecondNode(Node root, int y){

        if(root==null)
            return false;
        if(root.value==y){
            return true;
        }

        return (findSecondNode(root.left,y)||findSecondNode(root.right,y));

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
          }

    }
    private static class BinarySearchTree{

        Node root;

        public Node add(int num){
            Node mainRoot = null;
            if (root == null){
                root = new Node(num);
                mainRoot = root;
            }else{
                add(root,num);
            }
            return mainRoot;
        }

        public void add(Node root, int num){
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

