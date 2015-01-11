package com.careercup;

/**
 * Created by saikat on 1/11/2015.
 * Given "n", generate all valid parenthesis strings of length "2n".

 * Example:
 * Given n=2

 * Output:
 * (())
 * ()()
 *
 *
 */
public class Parenthesis {
   void generateParenthesis(int left,int right,String s){
      if(left==0 && right==0){
          System.out.println(s);
      }
      if(left>right){
          return;
      }
      if(left>0){
          generateParenthesis(left-1,right,s+"(");
      }
      if(right>0){
          generateParenthesis(left,right-1,s+")");
      }
   }
   void parenthesis(int n){
       generateParenthesis(n/2,n/2,"");
   }
   public static void main(String[] args){
       new Parenthesis().parenthesis(4);
   }

}
