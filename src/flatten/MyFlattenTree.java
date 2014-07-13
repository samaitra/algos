package flatten;

import java.util.LinkedList;
import java.util.List;

public class MyFlattenTree<T> implements FlattenTree<T> {

    public List<T> flattenInOrder(Tree<T> tree) {

        if(tree==null){
            throw new IllegalArgumentException();
        }

        List<T> myList = new LinkedList<>();
        CreateLinkList(tree.get(),myList);
        return myList;
    }

    public Tree CreateLinkList(Either e,List<T> myList){

        if(e == null){
            return null;
        }

        if(e.isLeft()){

            Tree.Leaf l = new Tree.Leaf(e);
            myList.add((T)l);
        }else{
            Tree.Node n = new Tree.Node(CreateLinkList(e,myList),CreateLinkList(e,myList),CreateLinkList(e,myList));

        }

       return null;
    }


}
