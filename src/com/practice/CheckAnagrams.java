package com.practice;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 30/08/13
 * Time: 11:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class CheckAnagrams {

    public static void main(String[] args){
        boolean result = isAnagram("conifers","fir cones");
        System.out.println(result);
    }
    static boolean isAnagram(String s1, String s2){
        s1 = s1.replaceAll("\\s","");
        s2 = s2.replaceAll("\\s","");

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        s1 = new String(chars1);
        s2 = new String(chars2);
        return s1.equals(s2);


    }
}
