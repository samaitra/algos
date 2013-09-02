package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 02/09/13
 * Time: 6:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeToDoublyLinkedList {

    public static void main(String[] args){

    BiNode a = new BiNode(0);
    BiNode b = new BiNode(1);
    BiNode c = new BiNode(2);
    BiNode d = new BiNode(3);
    BiNode e = new BiNode(4);
    BiNode f = new BiNode(5);
    BiNode g = new BiNode(6);

    e.node1 = c;
    e.node2 = f;
    f.node2 = g;
    c.node1 = b;
    c.node2 = d;
    b.node1 = a;

    BiNode n = convert(e);
     while (n!=null){
         System.out.println(n.data);
         n=n.node2;
     }
    }

    public static BiNode convert(BiNode root){

      if(root == null)
          return null;

      BiNode part1 = convert(root.node1);
      BiNode part2 = convert(root.node2);

     if(part1!=null){
         concat(gettail(part1),root);
     }
     if(part2!=null){
         concat(root,part2);
     }


        return part1 == null?root:part1;
    }

    public static BiNode gettail(BiNode node){
        if(node==null)
            return null;

        while(node.node2!=null){
            node = node.node2;
        }
        return node;
    }

    public static void concat(BiNode x,BiNode y){
        x.node2 = y;
        y.node1 = x;
    }

    static class BiNode{
        public BiNode node1,node2;
        public int data;

        public BiNode(int data){
            this.data = data;
        }


    }


}
