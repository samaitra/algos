package com.hr;

import java.io.FileReader;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 6/16/13
 * Time: 7:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class CoinOnTheTable {
    static int count=0;
    public static void main(String[] args)throws Exception{

    Scanner in = new Scanner(new FileReader("coin/in2"));
    int n = in.nextInt();
    int m = in.nextInt();
    int k = in.nextInt();

    char[][] table = new char[n][m];

    for(int i=0;i<n;i++){
        String line = in.next();
        char[] chars = line.toCharArray();
        for(int j=0;j<m;j++){
            table[i][j] = chars[j];
        }
    }

    count = findStep(table, 0, 0, k);
    if(count==k){
        out.println(0);
    }else{
       int step = changeStep(table, 0, 0, k);
       out.println(step);
    }
    }

    public static int changeStep(char[][]table,int i,int j,int k){
        int step=0;







        return step;
    }




    public static int findStep(char[][]table,int i,int j,int k){

       char c = table[i][j];
       System.out.println("c = " + c);

       if(c=='*'){
           return 1;
       }
       else if(c=='U'){
          findStep(table,i-1,j,k);
          count++;
       }
       else if(c=='L'){
           findStep(table,i,j-1,k);
           count++;
       }
       else if(c=='D'){
           findStep(table,i+1,j,k);
           count++;
       }
       else if(c=='R'){
           findStep(table,i,j+1,k);
           count++;
       }
       return count;
    }

}
