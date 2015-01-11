package com.careercup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 16/09/13
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class LongestSubsetConsecutiveNumbers {

    static int[] a = { 5, 1, 9, 3, 8, 20, 4, 10, 2, 11, 3};

    public static void main(String[] args){


      HashMap<Integer, ArrayList> map = createSubsetMap(a);
      ArrayList<Integer> list = getLongestSubset(map);
      for(Integer i : list){
          System.out.print(i+" ");
      }




    }
    public static HashMap<Integer,ArrayList> createSubsetMap(int[] a){
        Arrays.sort(a);
        HashMap<Integer,ArrayList> subsetMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        subsetMap.put(a[0],list);
        int key = a[0];
        for(int i=1;i<a.length;i++){

            if((subsetMap.containsKey(key) && (a[i]-a[i-1])==1) || (subsetMap.containsKey(key) && a[i]==a[i-1])){
                ArrayList<Integer> list1  = subsetMap.get(key);
                list1.add(a[i]);
                subsetMap.put(key,list1);
            }else{
                ArrayList<Integer> list2 = new ArrayList<>();
                list2.add(a[i]);
                key = a[i];
                subsetMap.put(a[i],list2);
            }

        }
        return subsetMap;

    }
    public static ArrayList<Integer> getLongestSubset(HashMap<Integer,ArrayList> subsetMap){
        int maxKey = Integer.MIN_VALUE;
        int maxlistSize = Integer.MIN_VALUE;

        for(Map.Entry<Integer,ArrayList> entry: subsetMap.entrySet()){
            //System.out.println("key "+entry.getKey());
            int keyx = entry.getKey();
            int listSize = entry.getValue().size();
            if(listSize>maxlistSize){
                maxKey = keyx;
                maxlistSize = listSize;
            }
        }

        return subsetMap.get(maxKey);

    }

 }

