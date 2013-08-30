package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 30/08/13
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Interpretations {

    public static void main(String[] args){

      String num = "aaaaa";
      int count = countInterpretations(num);
      System.out.print(count);
    }
    public static int countInterpretations(String num){

        Integer n = num.length();
        return countInterpretations(n);
    }
    public static int countInterpretations(int n){

        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;

        return countInterpretations(n-2)+countInterpretations(n-1);
    }


}
