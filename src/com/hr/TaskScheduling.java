package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 7/15/13
 * Time: 10:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaskScheduling {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("taskscheduling/in"));
        int n = Integer.parseInt(bufferedReader.readLine());
        int d[] = new int[n];
        int m[] = new int[n];
        for(int i=0;i<n;++i){
            String line = bufferedReader.readLine();
            String a[] = line.split("\\s");
            d[i] = Integer.parseInt(a[0]);
            m[i] = Integer.parseInt(a[1]);
        }
        System.out.println("num of elements "+n);
        for(int i=0;i<n;i++){
          int dx[] = new int[i];
          int mx[] = new int[i];



          System.arraycopy(d,0,dx,0,i);
          System.arraycopy(m,0,mx,0,i);
          // use hashmap to store mx and dx values, so that after sorting mx we can still get dx value
          HashMap<Integer,Integer> timeMap = new HashMap<>();
          for(int k=0;k<i;k++){
             timeMap.put(mx[k],dx[k]);
          }

          Arrays.sort(mx);

          int len = dx.length;

            for(int j=0;j<len/2;j++){

                int temp = mx[j];
                mx[j]= mx[len-1-j];
                mx[len-1-j]=temp;

            }


            for(int j=0;j<i;j++){

                System.out.print("mx[j] " + mx[j] + " ");
                System.out.println();

            }

            System.out.println("--------------");



        }
    }
}
