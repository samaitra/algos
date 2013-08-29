package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/29/13
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortNegativePositiveIntegers {

    public static void main(String[] main){

        int[] a = {-1, 1, 3, -2, 2};

        a = sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] sort(int[] a){

        int start = 0;
        int end = a.length-1;


        while(start<end){

            if(a[start]<0){
            start++;
            }
            if(a[end]>0){
                end--;
            }
            if(a[start]>0 && a[end]<0){

               int temp = a[start];
               a[start] = a[end];
               a[end] = temp;

            }
        }

         return a;

    }

}
