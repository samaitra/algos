package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 23/08/13
 * Time: 5:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class LargestPalindromeRecursive {

    public static void main(String[] args)
    {
        String str = "aaacbcaaa";
        String result = findLargestPalindrome(str);
        System.out.println(result);
    }

    public static String findLargestPalindrome(String str){

        if(str==null || str.length()==0){
            return "";
        }
        boolean[][] memo = new boolean[str.length()][str.length()];
        int maxStart = 0;
        int maxLength = 1;

        for(int i=0;i<str.length();i++){
            memo[i][i] = true;
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                memo[i][i+1] = true;
                maxStart = i;
                maxLength = 2;

            }
        }
        for(int len=3;len<=str.length();len++){
            for(int i=0;i<str.length()-len+1;i++){

                int j = i+len-1;

                if(str.charAt(i)==str.charAt(j) && memo[i+1][j-1]==true){
                    memo[i][j] = true;
                    maxStart = i;
                    maxLength = len;
                }

            }
        }

        return str.substring(maxStart,maxLength);
    }

}
