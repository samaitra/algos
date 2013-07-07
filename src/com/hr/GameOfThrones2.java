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


    static boolean flag=false;
    static HashSet<String> hs = new HashSet<String>();

    public  static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            if(isAnagramPalindrome(prefix)){
            hs.add(prefix);
            }
        }
        else {
            for (int i = 0; i < n; i++){
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
            }
        }
    }

    public static boolean isAnagramPalindrome(String s) {
        int n = s.length();
        for (int i=0;i<(n / 2) + 1;++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;


    }


    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        permutation(str);

        System.out.println(hs.size());
        int val = (int)Math.pow(10, 9);
        System.out.println(hs.size()%(val)+7);

    }
}
