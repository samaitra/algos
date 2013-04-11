package com.google;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 08/04/13
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class AlienLanguage {

    public static void main(String[] args) throws Exception{

        Scanner in  = new Scanner(new FileReader("AlienLang/input.txt"));
        int L = in.nextInt();
        int D = in.nextInt();
        int N = in.nextInt();
        BufferedWriter bw = new BufferedWriter(new FileWriter("AlienLang/a.out"));
        int result = 0;
        String[] dict = new String[D];

        for(int k=0;k<D;k++){
            dict[k]=in.next();
            System.out.println(dict[k]);
        }
        String[] patterns = new String[N];
        for(int i=0;i<N;i++){
            patterns[i]=in.next();
            System.out.println(patterns[i]);
        }


            //System.out.println("Case #" + (k + 1) + ": " + result);
            //bw.write("Case #"+(k+1)+": "+result+"\n");
            //bw.flush();
        }
        //bw.close();



    }


