package com.hr;

import java.io.FileReader;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 6/8/13
 * Time: 4:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class EvenTree {

    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(new FileReader("eventree/in"));
        int N = in.nextInt();
        int M = in.nextInt();

        Node[] nodes = new Node[N+1];
        for(int i=1;i<=N;i++){
           nodes[i] = new Node(i);
        }

        Edge[] edges = new Edge[M];
        for(int i=0;i<M;i++){

          int nodeAId = in.nextInt();
          int nodeBId = in.nextInt();
            //System.out.println("nodeAId "+nodeAId);
            Node nodeA = nodes[nodeAId];

            //System.out.println("nodeBId "+nodeBId);
            Node nodeB = nodes[nodeBId];

            nodeA.neighbours.add(nodeB);
            nodeB.neighbours.add(nodeA);

            edges[i] = new Edge(nodeA,nodeB);

        }
        int removedCount = 0;
        for(Edge edge : edges){
            if(edge.canBeRemoved()){
                //System.out.println("edge left "+edge.left.id);
                //System.out.println("edge right "+edge.right.id);

                removedCount++;
                edge.remove();
            }
        }

        System.out.println(removedCount);

    }


}


class Node {

    int id;
    Set<Node> neighbours = new HashSet<>();
    Node(int i){
        id = i;
    }

    public int countNodes(Node parent){
        //System.out.println("parent Node "+parent.id);
        int count=1;

        for(Node neighbour : neighbours){

            if (neighbour != parent) {
                //System.out.println("neighbour "+neighbour.id);
                count = count + neighbour.countNodes(this);
            }
        }

        return count;
    }

    public void print(Node n){
        //System.out.println("node "+ id);
        for(Node neighbour : n.neighbours) {
            //System.out.println(neighbour.id);

        }

    }
}


class Edge {
    Node left;
    Node right;
    Edge(Node left,Node right){
        this.left = left;
        this.right = right;
    }

    public boolean canBeRemoved(){
        // System.out.println("=================");
        return (left.countNodes(right)%2 == 0 && right.countNodes(left)%2 == 0);
    }


    public void remove() {
        //To change body of created methods use File | Settings | File Templates.
        left.neighbours.remove(right);
        right.neighbours.remove(left);

    }
}
