package com.hr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 07/10/13
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonChild {

    public static void main(String[] args) throws Exception{

        //BufferedReader bufferedReader = new BufferedReader(new FileReader("in"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        String res = findLCS(a,b);
        System.out.print(res.length());

    }

    public static String findLCS(String a, String b){
        int[][] memo = new int[a.length()+1][b.length()+1];

        for(int i=a.length()-1;i>=0;--i){
            for(int j=b.length()-1;j>=0;--j){
                if(a.charAt(i) == b.charAt(j)){
                    memo[i][j] = memo[i+1][j+1]+1;
                   // System.out.print(memo[i][j]);
                }else{
                    memo[i][j] = Math.max(memo[i+1][j],memo[i][j+1]);
                   // System.out.print(memo[i][j]);
                }
            }
            //System.out.println();
        }
        int i = 0;
        int j = 0;

        StringBuffer result = new StringBuffer();
        while (i < a.length() && j < b.length())
        {
            if (a.charAt(i)==b.charAt(j))
            {
                result.append(a.charAt(i));
                i++;
                j++;
            } else if (memo[i+1][j] > memo[i][j+1])
                i++;
            else
                j++;
        }
        return result.toString();
    }
}
