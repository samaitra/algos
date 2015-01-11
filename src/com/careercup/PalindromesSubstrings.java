package com.careercup;

/**
 * Created by saikat on 1/11/2015.
 *
 * Write a function for retrieving the total number of substring palindromes.
 * For example the input is 'abba' then the possible palindromes= a, b, b, a, bb, abba
 * So the result is 6.
 *
 */
public class PalindromesSubstrings {

    public static int find(String s){
      int len = s.length();
      int n = len;


        for(int i=0;i<len-1;i++){
            for(int j=i-1,k=i+1;j>=0 && k < len;j--,k++){
                if(s.charAt(j)==s.charAt(k)){
                    n++;
                    //System.out.println(s.subSequence(j,k+1));
                }else{
                    break;
                }
            }

        }

        for(int i=0;i<len-1;i++){
            for(int j=i,k=i+1;j>=0 && k < len;j--,k++){
                if(s.charAt(j)==s.charAt(k)){
                    n++;
                    //System.out.println(s.subSequence(j,k+1));
                }else{
                    break;
                }
            }

        }

      return n;
    }

    public static void main(String[] args){
      System.out.print(new PalindromesSubstrings().find("abba"));
    }

}
