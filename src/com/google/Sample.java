package com.google;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 13/04/13
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sample {

    public static void main(String[] args) throws Exception{
        Scanner in  = new Scanner(new FileReader("sample/in"));
        int n = in.nextInt();
        BufferedWriter bw = new BufferedWriter(new FileWriter("sample/a.out"));
        for(int k=0;k<n;k++){



        System.out.println("Case #" + (k + 1) + ": " + "OUTPUT GOES HERE");
        bw.write("Case #"+(k+1)+": " + "OUTPUT GOES HERE" + "\n");
        bw.flush();
        }
        bw.close();


    }
}