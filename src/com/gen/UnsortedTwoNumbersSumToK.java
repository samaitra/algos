package com.gen;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 21/08/13
 * Time: 3:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class UnsortedTwoNumbersSumToK {

    public static void main(String[] args){

        int[] a = {6,7,8,9,1,16,2,3,14,13,4,5,12,32,44};
        printNumbersSumToK(a,16);

    }

    private static void printNumbersSumToK(int[] a, int k){
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i : a){
            if(hashSet.contains(k-i)){
                System.out.println(i + " " + (k-i));
            }
            hashSet.add(i);
        }
    }


}
