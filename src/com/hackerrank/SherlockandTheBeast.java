package com.hackerrank;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 11/09/13
 * Time: 12:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class SherlockandTheBeast {

    public static void main(String[] args) throws Exception{
       //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new FileReader("sherlockandthebeast/in"));

       int n = in.nextInt();
       for(int i=0;i<n;i++){
       int num = in.nextInt();
       int[] s  = getDescentNumber(num);

           for(int j=0;j<s.length;j++){
               System.out.print(s[j]);
           }
           System.out.println();

       }
    }

    private static int[] getDescentNumber(int num) {

        if(num<3){
            int a[] = new int[1];
            a[0] = -1;
            return a;
        }
        else{
             if(num%3==0) {
                 int[] a = new int[num];
                 for(int i=0;i<num;i++){
                     a[i] = 5;
                 }

                 return a;
             }
             else{
                 int count5 = num;
                 int count3 = 0;
                 int arr[] = new int[num];
                 while (count5%3!=0){

                     count5 = count5-5;
                     count3 = count3+5;

                     if(count3%5==0 && count5%3==0){

                         for(int i=0;i<count5;i++){
                           arr[i] = 5;
                         }
                         for(int i=count5;i<arr.length;i++){
                             arr[i] = 3;
                         }
                         return arr;
                     }
                 }
                 int a[] = new int[1];
                 a[0] = -1;
                 return a;
             }


           }
        }




}
