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

    Scanner in = new Scanner(new FileReader("coin/in"));
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

    count = findStep(table, 0, 0, k, n,m);
    if(count==k){
        out.println(0);
    }else{
       int step = changeStep(table, 0, 0, k, n, m);
        if(step<=k)
            out.println(step);
        else
            out.println(-1);
    }
    }

    public static int changeStep(char[][]table,int i,int j,int k, int n, int m){
        int step=0;
        if(i<0||i>(n-1)||j<0||j>(m-1)){
            return 0;
        }
        char c = table[i][j];
        if(c=='x'){
            return 0;
        }
        table[i][j] = 'x';
        //System.out.println("c = " + c);
        if(c=='*'){
            return 1;
        }
        step = step+changeStep(table,i-1,j,k,n,m);
        step = step+changeStep(table,i,j-1,k,n,m);
        step = step+changeStep(table,i+1,j,k,n,m);
        step = step+changeStep(table,i,j+1,k,n,m);

        return step;
    }

    public static int findStep(char[][]table,int i,int j,int k,int n, int m){

        if(i<0||i>(n-1)||j<0||j>(m-1)){
            return 0;
        }

        char c = table[i][j];
       //System.out.println("c = " + c);

       if(c=='*'){
           return 1;
       }
       else if(c=='U'){
          findStep(table,i-1,j,k, n, m);
          count++;
       }
       else if(c=='L'){
           findStep(table,i,j-1,k, n, m);
           count++;
       }
       else if(c=='D'){
           findStep(table,i+1,j,k, n, m);
           count++;
       }
       else if(c=='R'){
           findStep(table,i,j+1,k, n, m);
           count++;
       }
       return count;
    }

}
