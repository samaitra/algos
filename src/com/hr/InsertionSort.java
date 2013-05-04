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
    static void insertionSort(int a[]) {
        int n = a.length;
        int count=0;
        if (n == 1) {
            printArray(a);
        } else if (n == 2) {

            int temp = a[0];
            a[0] = a[1];
            a[1] = temp;
            printArray(a);
        } else {

                for (int i = 1; i < n ; i++) {
                    int j = i;
                    int x=a[i];
                    while (j>0 && a[j-1]>x){

                        a[j] = a[j-1];
                        j--;
                        count++;
                    }

                    a[j]=x;


                }

            }
        System.out.println(count);
    }



    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new FileReader("is/in"));
            int n = in.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }
            insertionSort(ar);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


