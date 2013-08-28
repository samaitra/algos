package com.practice;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 28/08/13
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Iterators {

    public static void main(String[] args){
        List<Integer> itr1 = new ArrayList<>();
        List<Integer> itr2 = new ArrayList<>();
        List<Integer> itr3 = new ArrayList<>();

        itr1.add(1);
        itr1.add(2);
        itr1.add(3);
        itr1.add(4);

        itr2.add(10);
        itr2.add(20);
        itr2.add(30);
        itr2.add(40);

        itr3.add(100);
        itr3.add(200);
        itr3.add(300);
        itr3.add(400);

        TreeMap<Integer,List> containerMap = new TreeMap<Integer,List>();
        containerMap.put(0,itr1);
        containerMap.put(1,itr2);
        containerMap.put(2,itr3);

        HashMap<Integer,Integer> lookupMap = new HashMap<>();
        lookupMap.put(0,0);
        lookupMap.put(1,0);
        lookupMap.put(2,0);

        iterate(containerMap,lookupMap);

    }

    public static void iterate(TreeMap<Integer,List> containerMap, HashMap<Integer,Integer> lookupMap){

          while(true){
            for(Map.Entry<Integer,List> entry : containerMap.entrySet()){
             //get the iterator id , which is a list
             Integer itr = entry.getKey();
             // get the head Pointer which is pointing to list element that need to be printed
             Integer headPtr = lookupMap.get(itr);
             System.out.println(entry.getValue().get(headPtr));
             headPtr++;
             //setting headPtr to begining if reached end of list
             if(headPtr==entry.getValue().size()){
                 headPtr=0;
             }
             lookupMap.put(itr,headPtr);

            }

          }


    }

}
