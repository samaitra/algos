package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/23/13
 * Time: 9:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class LCS {

    public static void main(String[] args){

        String a = "alfkjalfjlkj";
        String b = "ajflaklfjlaj";

        String res = findLCS(a,b);
        System.out.print(res);

    }

    public static String findLCS(String a, String b){
        int[][] memo = new int[a.length()+1][b.length()+1];

        for(int i=a.length()-1;i>=0;--i){
            for(int j=b.length()-1;j>=0;--j){
                if(a.charAt(i) == b.charAt(j)){
                    memo[i][j] = memo[i+1][j+1]+1;
                    System.out.print(memo[i][j]);
                }else{
                    memo[i][j] = Math.max(memo[i+1][j],memo[i][j+1]);
                    System.out.print(memo[i][j]);
                }
            }
            System.out.println();
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



