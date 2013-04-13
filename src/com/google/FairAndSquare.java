package com.google;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 13/04/13
 * Time: 12:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class FairAndSquare {

    public static void main(String[] args) throws Exception{
    Scanner in  = new Scanner(new FileReader("FairAndSquare/C-large-1.in"));
    int n = in.nextInt();
    BufferedWriter bw = new BufferedWriter(new FileWriter("FairAndSquare/a.out"));
    for(int k=0;k<n;k++){

        long start=in.nextLong();
        long end = in.nextLong();
        //System.out.println("start "+start);
        //System.out.println("end "+end);

        int count = 0;
        for(long i=start;i<=end;i++){
             if(isFairSquare(i)){
                 count++;
             }
        }


        System.out.println("Case #" + (k + 1) + ": " + count);
        bw.write("Case #"+(k+1)+": "+count+"\n");
        bw.flush();
        }
        bw.close();




    }

    public static boolean isFairSquare(long x){
        //System.out.println("isFairSquare "+x);
        if(isPalindrome(x)){

             if(isSqrtPalindrome(x)){

                 return true;
             }



        }
       return false;

    }

    public static boolean isPalindrome(long x){
        //System.out.println("isPalindrome "+x);
        char[] word = ("" + x).toCharArray();

        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }


        return true;


    }

    public static boolean isSqrtPalindrome(long x){
        //System.out.println("isSqrtPalindrome "+x);

        if(isPerfectSquare(x)){
           long i = new Double(Math.sqrt(x)).longValue();
            if(isPalindrome(i)){
                return true;
            }

        }

        return false;

    }

    public static boolean isPerfectSquare(long n){
        if (n < 0)
            return false;

        long tst = (long)(Math.sqrt(n) + 0.5);
        return tst*tst == n;
    }

}