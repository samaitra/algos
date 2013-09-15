package com.cc;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 15/09/13
 * Time: 7:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class SmallestRangeInKList {

    public static void main(String[] args){
       Integer[] a = {4,10,15,24,26};
       Integer[] b = {0,9,12,20};
       Integer[] c = {5,18,22,30};
       List<Integer> list1 = Arrays.asList(a);
       List<Integer> list2 = Arrays.asList(b);
       List<Integer> list3 = Arrays.asList(c);

       System.out.println(findSmallestRange(list1, list2, list3));

    }

    public static String findSmallestRange(List<Integer> list1, List<Integer> list2, List<Integer> list3){
      String str = "";
      int range = 0;
      int smallestRange = Integer.MAX_VALUE;
      int p1 = 0;
      int p2 = 0;
      int p3 = 0;
      int start = 0;
      int end = list1.size()+list2.size()+list3.size();
      int len = list1.size()+list2.size()+list3.size();

      while(p1<list1.size() && p2<list2.size() && p3<list3.size()){

      int min = Math.min(list1.get(p1),Math.min(list2.get(p2),list3.get(p3)));
      int max = Math.max(list1.get(p1),Math.max(list2.get(p2),list3.get(p3)));
      range = max-min;

      if(range<smallestRange){

          smallestRange = range;
          str = String.valueOf(min)+", "+String.valueOf(max);

      }

          if(min == list1.get(p1)){
              p1++;
          }else if(min == list2.get(p2)){
              p2++;
          }else{
              p3++;
          }

          start++;
      }
      return str;
    }

}
