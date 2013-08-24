package com.hr;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/24/13
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class TwoArrays {

    public static void main(String[] args) throws Exception{

        //Scanner in = new Scanner(new InputStreamReader(System.in));
        Scanner in = new Scanner(new FileReader("twoarrays/in"));

        int t = in.nextInt();
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int m=0;m<t;m++){

            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i] = in.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);

            String msg = "YES";

            for(int i=0;i<n;i++){
                if((a[i]+b[i]) < k){
                    msg="NO";
                }
            }
            System.out.println(msg);
        }

   }
}