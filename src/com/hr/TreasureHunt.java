package com.hr;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/6/13
 * Time: 12:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class TreasureHunt {
    static int a[][] = new int[6][6];
    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(new FileReader("treasurehunt/in"));
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                a[i][j] = in.nextInt();
            }
        }
       String num = String.valueOf(a[1][1]);
       String i = num.substring(0,1);
       String j = num.substring(1,2);
       if(num.equals("11")){
           System.out.println("1 1");
       }else{
           checkArray(i,j);
       }
    }

    private static void checkArray(String iIndex, String jIndex) {

       int i = Integer.parseInt(iIndex);
       int j = Integer.parseInt(jIndex);
        String num = String.valueOf(a[i][j]);
        System.out.println(num);
        String ith = num.substring(0,1);
        String jth = num.substring(1,2);
        if(num.equals(iIndex+jIndex)){
            System.out.println(iIndex+" "+jIndex);
        }else{
            checkArray(ith,jth);
        }
    }
}
