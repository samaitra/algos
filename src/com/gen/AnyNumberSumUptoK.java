package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 21/08/13
 * Time: 5:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class AnyNumberSumUptoK {
    public static void main(String[] args)
    {
        int[]arr={4,6,2,8};
        System.out.println(isSumPossible(arr,10));
    }
    public static boolean isSumPossible(int[] arr, int k)
    {
        boolean[][] memo=new boolean[arr.length+1][k+1];
        for(int i=1;i<=arr.length;++i)
        {
            for(int w=1;w<=k;++w)
            {
                if(w==arr[i-1])
                    memo[i][w]=true;
                else if(w>arr[i-1])
                    memo[i][w]=memo[i-1][w]||memo[i-1][w-arr[i-1]];
                else
                    memo[i][w]=memo[i-1][w];
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<k;j++){
                System.out.print(memo[i][j]+" ");
            }
            System.out.println();
        }


        return memo[arr.length][k];
    }
}


