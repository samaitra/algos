package com.hackerrank;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 04/08/13
 * Time: 8:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class MarkNToys {

    public static void main(String[] args) throws Exception{

        //Scanner in = new Scanner(new FileReader("markntoys/in"));
        Scanner in = new Scanner(new InputStreamReader(System.in));

        int N = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[N];
        for(int i=0;i<N;i++){

            a[i] = in.nextInt();

        }

        Arrays.sort(a);

        int c=0;
        int tempPrice = 0;
        for(int i=0;i<N;i++){
           if(tempPrice+a[i]<k){
           tempPrice=tempPrice+a[i];
           c++;
           }

        }
        System.out.println(c);
    }

}
