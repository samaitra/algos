package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 21/08/13
 * Time: 3:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class TwoNumbersSumToK {

    public static void main(String[] args){

        int[] a = {1,2,3,4,5,6,7,8,9,12,13,14,16,32,44};
        printNumbers(a,16);
    }

    private static void printNumbers(int[] a, int k){

        int headPtr = 0;
        int tailPtr = a.length-1;

        int i=0;
        while(headPtr<tailPtr){

            if(a[headPtr]+a[tailPtr]==k){
               break;
            }
            if(a[headPtr]+a[tailPtr]>k){
                tailPtr--;
            }
            if(a[headPtr]+a[tailPtr]<k){
                headPtr++;
            }

        }
       System.out.println(a[headPtr]+ "  " +a[tailPtr]);



    }

}
