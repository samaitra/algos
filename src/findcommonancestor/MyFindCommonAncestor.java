package findcommonancestor;

import java.util.ArrayList;

/**
 * Created by saikat on 13/07/14.
 */
public class MyFindCommonAncestor implements FindCommonAncestor {

    public Node findNode(String s , ArrayList<Node> l){
        for(Node x : l){
           if(x.data.equals(s)){
               return x;
           }
           if(x.left.data.equals(s)){
               return x.left;
           }
           if(x.right!=null && x.right.data.equals(s)){
                return x.right;
           }
        }
        return null;
    }

    public String findCommmonAncestor(String[] commitHashes,
                                      String[][] parentHashes, String commitHash1, String commitHash2)
       {
        ArrayList<Node> ar = new ArrayList<>();
        for(int i=0;i<commitHashes.length;i++){


                Node a = findNode(commitHashes[i],ar);
                if(a==null) {
                    a = new Node(commitHashes[i]);
                }
                try{a.left = new Node(parentHashes[i][0]);}catch (Exception e){}
                //System.out.println("a "+a.data);
                try {a.right = new Node(parentHashes[i][1]);}catch (Exception e){}
                ar.add(a);

        }

        for(Node i : ar){
            try {
                System.out.println("Node " + i.data + " left " + i.left.data + " right " + i.right.data);
            }catch (Exception e){}
            }







        Node n1 = new Node(commitHash1);
        Node n2 = new Node(commitHash2);
        Node root = new Node((commitHashes[(commitHashes.length-1)]));
        Node snode = getLowestCommonAncestor(root,n1,n2);
        printTree(root);


        return snode.data;
    }
    private static void printTree(Node root) {
        if(root==null){
            return;
        }
        System.out.println("root data "+root.data);
        printTree(root.left);
        printTree(root.right);
    }

    private static Node getLowestCommonAncestor(Node root, Node n1, Node n2) {

        if(root == null)
            return null;
        if(root.data.equals(n1.data) || root.data.equals(n2.data))
            return root;

        boolean isn1Left = checkNode(root.left,n1);
        boolean isn2Left = checkNode(root.left,n2);

        if(isn1Left != isn2Left){
            return root;
        }

        Node childSide = isn1Left?root.left:root.right;
        return getLowestCommonAncestor(childSide,n1,n2);

    }

    public static boolean checkNode(Node root, Node n){

        if(root==n)
            return true;
        if(root==null)
            return false;
        return (checkNode(root.left,n) || checkNode(root.right,n));
    }


    static class Node{
        String data;
        Node left;
        Node right;

        public Node(String data){
            this.data = data;
        }

    }

    public static void main(String[] args){

        String[] commits = {"G", "F", "E", "D", "C", "B", "A"};
        String[][] parents ={{"F","D"},{"E"}, {"B"}, {"C"}, {"B"}, {"A"}, null};
        String commit1 = "D";
        String commit2 = "F";
            new MyFindCommonAncestor().findCommmonAncestor(commits, parents, commit1, commit2);
    }

}

