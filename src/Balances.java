import javax.swing.tree.TreeModel;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


class Balances{


public static void main(String[] argv) throws Exception{

	Scanner in = new Scanner(new FileReader(new File("../balances/input00.txt")));

    int n = in.nextInt();
    System.out.println("n "+n);
    Tree tree = new Tree(0);

    for(int i=0;i<n;i++){
      Node x = new Node();

     for(int j=0;j<2;j++){
        if(j=0){
        String nodeValue = in.next();
        String a[]= nodeValue.split(" ");
        int weight = Integer.parseInt(a[0]);
        int balance = Integer.parseInt(a[1]);

        }
        else{

            String nodeValue = in.next();
            String a[]= nodeValue.split(" ");
            int weight = Integer.parseInt(a[0]);
            int balance = Integer.parseInt(a[1]);
            tree.root.left = balance


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




}  public static class Node<T> {
        private T data;
        private Node<T> parent;
        private Node<T> left;
        private Node<T> right;
    }
}