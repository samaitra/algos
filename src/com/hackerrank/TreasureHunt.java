package com.hackerrank;

import java.io.InputStreamReader;
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
    static boolean noTreasureFlag = true;
    static int count = 1;
    public static void main(String[] args) throws Exception{

        //Scanner in = new Scanner(new FileReader("treasurehunt/in"));
        Scanner in = new Scanner(new InputStreamReader(System.in));

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
           System.out.println("1 1");
           count = count+1;
           checkArray(i,j);
       }

        if(noTreasureFlag){
            System.out.println("NO TREASURE");
        }

    }

    private static void checkArray(String iIndex, String jIndex) {

       int i = Integer.parseInt(iIndex);
       int j = Integer.parseInt(jIndex);
        String num = String.valueOf(a[i][j]);
        //System.out.println(num);
        String ith = num.substring(0,1);
        String jth = num.substring(1,2);

        if(num.equals(iIndex+jIndex)){
            System.out.println(iIndex+" "+jIndex);
            noTreasureFlag = false;
            return;
        }else if (count==25){
            return;
        }
        else{
            System.out.println(iIndex+" "+jIndex);
            count=count+1;
            checkArray(ith,jth);
        }
    }
}
