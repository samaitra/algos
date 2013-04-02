package com.google;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 02/04/13
 * Time: 12:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseWords {
    public static void main(String[] args) throws Exception{

        BufferedReader b = new BufferedReader(new FileReader("ReverseWords/B-large-practice.in"));
        int n = Integer.parseInt(b.readLine());
        for(int i=0;i<n;i++){
            String line = b.readLine();
            //System.out.println(line);
            String[] a = line.split(" ");
            StringBuilder s = new StringBuilder();
            for(int j=a.length-1;j>=0;j--){
                if(j==0)
                s.append(a[j]);
                else
                    s.append(a[j]+" ");
            }
            System.out.println("Case #"+(i+1)+": "+s.toString());
        }

    }

}