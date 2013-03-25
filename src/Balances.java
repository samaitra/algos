import javax.swing.tree.TreeModel;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


class Balances{


public static void main(String[] argv) throws Exception{

	Scanner in = new Scanner(new FileReader(new File("balances/input01.txt")));

    int n = in.nextInt();
    System.out.println("n "+n);
    Tree tree = new Tree(0);

    for(int i=0;i<n;i++){
      Node x = new Node();
        System.out.println("node number "+i);

        for(int j=0;j<2;j++){

        if(j==0){
        String nodeValue = in.next();
        System.out.println("left weight "+nodeValue);
        tree.addLeftChild(x, Integer.parseInt(nodeValue));
        }
        else{

            String nodeValue = in.next();
            System.out.println("right weight "+nodeValue);
            tree.addRightChild(x,Integer.parseInt(nodeValue));
        }

     }
    }

}

public static class Tree<T> {
    private Node<T> root;

    public Tree(T rootData) {
        root = new Node<T>();
        root.data = rootData;
        root.left = new Node<T>();
        root.right = new Node<T>();
    }

    public void addLeftChild(Node n, int weight){

    }

    public void addRightChild(Node n, int weight){

    }



}  public static class Node<T> {
        private T data;
        private Node<T> parent;
        private Node<T> left;
        private Node<T> right;
    }
}