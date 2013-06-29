package com.hr;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 24/06/13
 * Time: 9:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class StockMaximize {


    public static void main(String[] args) throws Exception{


            Scanner in = new Scanner(new FileReader("stockmaximize/in"));
            int T = in.nextInt();
            for (int k=0;k<T;k++){
                int n = in.nextInt();
                int[] a = new int[n];
                for(int x=0;x<n;x++)
                    a[x] = in.nextInt();

                getMaxProfit(a,n);

            }
    }

    private static void getMaxProfit(int[] a , int n) {

        int[] right = new int[n];
        right[n-1] = a[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],a[i]);
            System.out.println(right[i]);
        }

        long result = 0;
        for(int i=0;i<n;++i){
            result+=Math.max(0,right[i]-a[i]);
        }
        System.out.println(result);
    }

}