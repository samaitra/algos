package com.careercup;

/**
 * Created by saikat on 01/01/15.
 * Given n, output the numbers from 0 to 2^n-1 (inclusive)
 * in n-bit binary form, in such an order that adjacent numbers
 * in the list differ by exactly 1 bit.
 */
public class NBitBinary {


     void printNBitBinaryNumbers(int n){
        double total = Math.pow(2,n)-1;

        for(Integer i=0;i<=total;i++){

           System.out.println(Integer.toBinaryString(getValue(i)));
        }
    }

    public static int getValue(int n){
        return (n>>1)^n;
    }


    public static void main(String[] args){
    new NBitBinary().printNBitBinaryNumbers(4);

    }



}
