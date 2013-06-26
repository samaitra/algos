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
                for(int x=0;x<n;x++){

                    a[x] = in.nextInt();
                    System.out.print(a[x]);

                }
                System.out.println();


                int profit = 0;
                int buyValue=a[0];
                for(int i=1;i<n;i++){

                    if(a[i]>buyValue){
                        profit = (a[i]-buyValue);
                    }

                    profit = Math.max(profit,a[i]-cheapest);

                }
                System.out.println(profit);
            }
    }

}