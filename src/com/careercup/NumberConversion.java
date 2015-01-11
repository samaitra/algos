package com.careercup;

/**
 * Created by saikat on 30/12/14.
 * Microsoft Excel numbers cells as 1...26 and after that AA, AB.... AAA, AAB...ZZZ and so on.
 * Given a number, convert it to that format and vice versa.
 */
public class NumberConversion {

    public String convertToLetters(int n){
       String o = "";
       if(n<=26)
           return String.valueOf(n);

       while(n>0){
           int val = (n-1)%26;
           o = (char)(val+65) + o;
           n = (n-val)/26;
       }

       return o;
    }

    public int convertToNumbers(String s){

      int sum = 0;

        for(int i=s.length()-1;i>=0;i--)
            sum = sum + (int)(s.charAt(i) - 64) * (int)Math.pow(26,s.length()-i-1);

        return sum;
    }

    public static void main(String args[]){

        System.out.println(new NumberConversion().convertToLetters(53));
        System.out.println(new NumberConversion().convertToNumbers("AZ"));

    }


}
