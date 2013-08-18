package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/18/13
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeToLinkedList {
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
      a.left=b;
      a.right=c;
      b.right=d;
      c.left=e;
      c.right=f;
      d.left=g;
      d.right=h;
      g.right=i;

      Node head = CreateLinkList(a);

      while(head!=null){
          System.out.println(head.data);
          head=head.next;
      }
  }

    public static Node CreateLinkList(Node root) {

        NodePointer head = new NodePointer();
        NodePointer link = new NodePointer();
        CreateLinkList(root,link,head);
        return head.node;
    }
    public static void CreateLinkList(Node root, NodePointer link, NodePointer head){

        if(root == null){
            return;
        }
        CreateLinkList(root.left,link,head);

        if(head.node == null && root != null){
            head.node = root;
        }
        if(link.node != null){
            link.node.next = root;
        }
        link.node = root;


        CreateLinkList(root.right,link,head);
    }




    public static class Node{

        public Node left;
        public Node right;
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
        }

    }
    public static class NodePointer{
        public Node node;
    }


}
