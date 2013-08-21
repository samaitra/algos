package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/21/13
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxSumToK {

    public static void main(String[] args)
    {
        int[]arr={4,6,9};
        System.out.println(getMaxSum(arr, 14));
    }
    public static int getMaxSum(int[]arr,int k)
    {
        Integer[][]memo=new Integer[arr.length+1][k+1];
        return getMaxSum(memo,arr,0,k);
    }
    private static int getMaxSum(Integer[][]memo,int[]arr,int i,int k)
    {
        if(i==arr.length)
        {
            return 0;
        }
        if(memo[i][k]!=null)
        {
            return memo[i][k];
        }
        if(arr[i]>k)
        {
            memo[i][k]=getMaxSum(memo,arr, i+1, k);
            return memo[i][k];
        }
        System.out.println("arr[i] " + arr[i]);
        //System.out.println("[i] " + i);
        //System.out.println("[k] " + k);

        memo[i][k]=Math.max(getMaxSum(memo,arr,i+1,k), getMaxSum(memo,arr,i+1,k-arr[i])+arr[i]);
        System.out.println("memo[i][k] " + memo[i][k]);
        System.out.println("====================");
        return memo[i][k];


    }

}
