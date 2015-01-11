package com.careercup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saikat on 05/01/15.
 *
 * Given a function KNOWS(A,B), which returns 1 if A knows B
 * (and not necessarily the other way around) and 0 if A does not know B.

 * A Celebrity is one who does not know anyone,
 * and one who is known by everybody.

 * For a list of N people, find all celebrities in linear time.
 */
public class Knows {

   public List<Node> findCelebrities(List<Node> people){

       List<Node> celebList = new ArrayList<>();
       for(Node person : people){
           if(person.knows.size()==0){
               celebList.add(person);
           }
       }

      return celebList;
   }

public class Node{
    int id;
    List<Node> knows;

}

}
