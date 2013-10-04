package com.hr;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 03/10/13
 * Time: 7:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClosestNumbers {

    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(new FileReader("in"));
        //Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int minDiff = Integer.MAX_VALUE;
        int diff = 0;
        for(int i=1;i<n;i++){

            diff = a[i]-a[i-1];
            if(diff<minDiff){
                minDiff = diff;
            }
        }

        for(int i=1;i<n;i++){
            if((a[i]-a[i-1])==minDiff){

              System.out.print(a[i-1]+" "+a[i]+" ");
            }
        }



    }


}
