package com.google;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 05/04/13
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class MinScalerProd {

    public static void main(String[] args) throws Exception{

        Scanner in  = new Scanner(new FileReader("MinScalerProduct/A-large-practice.in.txt"));
        int n = in.nextInt();
        BufferedWriter bw = new BufferedWriter(new FileWriter("MinScalerProduct/a.out"));
        for(int k=0;k<n;k++){
            int len = in.nextInt();
            long arr[] = new long[len];
            long barr[] = new long[len];
            for(int i=0;i<len;i++){
                arr[i]=in.nextInt();
            }
            for(int i=0;i<len;i++){
               barr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(barr);
            long sp=0;
            for(int i=0;i<len;i++){
              sp = sp + arr[i]*barr[(len-1)-i];
            }

            System.out.println("Case #" + (k + 1) + ": " + sp);
            bw.write("Case #"+(k+1)+": "+sp+"\n");
            bw.flush();
        }
        bw.close();



        }
}