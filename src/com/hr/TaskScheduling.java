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
        for(int i=0;i<n;i++){
            String line = bufferedReader.readLine();
            String a[] = line.split("\\s");
            d[i] = Integer.parseInt(a[0]);
            m[i] = Integer.parseInt(a[1]);
            System.out.println(d[i]+" "+m[i]);
        }
        System.out.println("num of elements "+n);
        for(int i=0;i<n;i++){
          int dx[] = new int[(i+1)];
          int mx[] = new int[(i+1)];



          System.arraycopy(d,0,dx,0,i+1);
          System.arraycopy(m,0,mx,0,i+1);
          // use hashmap to store mx and dx values, so that after sorting mx we can still get dx value
          HashMap<Integer,Integer> timeMap = new HashMap<Integer,Integer>();
          for(int k=0;k<(i+1);k++){
             timeMap.put(mx[k],dx[k]);
          }

          Arrays.sort(mx);

          int len = mx.length;
            System.out.println("len "+len);

            for(int j=0;j<(i+1);j++){

                System.out.println("mx[j] before reverse sort " + mx[j] + " ");

            }
            System.out.println("--------------");
            for(int j=0;j<len/2;j++){

                int temp = mx[j];
                mx[j]= mx[len-1-j];
                mx[len-1-j]=temp;

            }


            for(int j=0;j<(i+1);j++){

                System.out.println("mx[j] after reverse sort " + mx[j] + " ");

            }

            System.out.println("--------------");



            for(int j=0;j<(i+1);j++){
                int deadline = timeMap.get(mx[j]);
                System.out.println("taskSlot order "+deadline+" task execution time Mi "+mx[j]+"");
            }

            System.out.println("===============");
        }
    }
}
