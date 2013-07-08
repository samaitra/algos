package com.hr;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 07/07/13
 * Time: 7:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameOfThrones2 {


    public static void checkPalindrome(String s) {

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

        for (int i = 0; i < chars.length; i++) {
            Character mychar = chars[i];
            if(charCount.get(mychar)!=null){
                Integer count = charCount.get(mychar)+1;
                charCount.put(mychar, count);
            }else{
                charCount.put(mychar,1);
            }
        }
        int num = chars.length/2;
        int palindromes = factorial(num)/factorial(charCount.size());
        System.out.println(palindromes%1000000007);

    }
    public static int factorial(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        checkPalindrome(str);

    }
}
