package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 06/07/13
 * Time: 6:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameOfThrones1 {

    public static boolean isAnagramPalindrome(String s) {

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

        int oddCount = 0;
        int evenCount = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if(entry.getValue()%2==0){
               evenCount = evenCount + 1;
            }else{
                oddCount = oddCount + 1;
            }
        }
        if(oddCount>1){
            return false;
        }else
        {
            return true;
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String str = bufferedReader.readLine();

            if (isAnagramPalindrome(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

    }

}
