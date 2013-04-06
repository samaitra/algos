package com.hr;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 05/04/13
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort {
      static void insertionSort(int a[]){
         int n = a.length;
         int last = a[(n-1)];

         for(int i=(n-1);i>0;i--){
             if(last>a[i-1]){
                 a[i]=last;
                 printArray(a);
                 break;
             }else{
             a[i]=a[i-1];
                 printArray(a);
             }
         }
     }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new FileReader("is/in"));
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i]=in.nextInt();
            }
            insertionSort(ar);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}


