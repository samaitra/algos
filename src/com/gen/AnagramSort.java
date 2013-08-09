package com.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/10/13
 * Time: 2:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class AnagramSort {

    public static void main(String[] args)
    {
        String[]arr={"dog","listen","tip","enlist","pit","god","man","top","pot"};
        sort(arr);
        for(String str:arr)
        {
            System.out.println(str);
        }
    }

    static void sort(String[] arr){

        List<Anagram> list = new ArrayList<Anagram>();
        for(String s : arr){
            list.add(new Anagram(s));
        }

        Collections.sort(list);

        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i).str;
        }

    }
    public static class Anagram implements Comparable{

        String str;

        public Anagram(String str){
            this.str = str;
        }

        public String getSortedString(){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

        @Override
        public int compareTo(Object o) {
            Anagram oa = (Anagram)o;
            return getSortedString().compareTo(oa.getSortedString());
        }
    }

}
