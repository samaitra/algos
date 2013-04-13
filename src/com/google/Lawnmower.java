package com.google;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 13/04/13
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Lawnmower {

    public static void main(String[] args) throws Exception{
        Scanner in  = new Scanner(new FileReader("Lawnmower/B-small-attempt3.in"));
        int n = in.nextInt();
        BufferedWriter bw = new BufferedWriter(new FileWriter("Lawnmower/a.out"));
        for(int k=0;k<n;k++){

            int N = in.nextInt();
            int M = in.nextInt();
            //System.out.println("N M "+N+" "+M);

            int a[][] = new int[N][M];

            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    a[i][j]=in.nextInt();
                }
            }


               boolean flag = false;
               OUTLOOP: for(int i=0;i<N;i++){
                    for(int j=0;j<M;j++){
                        if(N<4||M<4){
                            System.out.println("Case #" + (k + 1) + ": " + "YES");
                            bw.write("Case #"+(k+1)+": " + "YES" + "\n");
                            bw.flush();
                            break OUTLOOP;
                        }
                        if(i>=0 && j>=0 && i < (N-1) && j < (M-1)){

                            int innerVal = a[i][j];
                            int row = i;
                            int column = j;

                            if(checkRowLine(a,M,row,innerVal) || checkColumnLine(a,N,column,innerVal)){

                                 flag=true;

                            }else {
                                 System.out.println("Case #" + (k + 1) + ": " + "NO");
                                 bw.write("Case #"+(k+1)+": " + "NO" + "\n");
                                 bw.flush();
                                 flag = false;
                                 break OUTLOOP;


                            }


                        }

                    }
                }

                if(flag==true){
                    System.out.println("Case #" + (k + 1) + ": " + "YES");
                    bw.write("Case #"+(k+1)+": " + "YES" + "\n");
                    bw.flush();
                }




            }




        bw.close();


    }

    public static boolean checkRowLine(int a[][],int M,int row, int innerVal){

        for(int j=0;j<M;j++){
            if(a[row][j]!=innerVal){
                return false;

            }
        }

        return true;
    }

    public static boolean checkColumnLine(int a[][],int N,int column, int innerVal){

        for(int i=0;i<N;i++){
            if(a[i][column]!=innerVal){
                return false;

            }
        }

        return true;
    }


}
