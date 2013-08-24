package com.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/24/13
 * Time: 1:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubsetsArraySumToK {

    public static void main(String[] args){

        int[] a = {1,2,3,5,7};
        int k = 10;
        findSubsetsSum(a, k);

    }

    private static void findSubsetsSum(int[] arr, int k){
      System.out.println(isSubSetSum(arr, arr.length, k));
      System.out.println(isSubsetSumPossible(arr,arr.length,k));
    }

    private static boolean isSubSetSum(int[] arr, int n, int k) {

        if(k==0){
            return true;
        }
        if(n==0 && k !=0)
            return false;
        if(arr[n-1]>k)
            return isSubSetSum(arr, n-1, k);
        return isSubSetSum(arr,n-1,k) || isSubSetSum(arr,n-1,k-arr[n-1]);

    }
    // Returns true if there is a subset of set[] with sun equal to given sum
    private static boolean isSubsetSumPossible(int[] arr, int n, int sum){

        // The value of memo[i][j] will be true if there is a subset of set[0..j-1]
        //  with sum equal to i
        boolean[][] memo = new boolean[sum+1][n+1];

        // if sum is equal 0, then answer is true
        for(int j=0;j<=n;j++){
            memo[0][j] = true;
        }
        // If sum is not 0 and set is empty, then answer is false
        for(int i=1;i<=sum;i++){
            memo[i][0] = false;
        }
        // Fill the memo table in bottom up manner

        for(int i =1;i<=sum;i++){
            for(int j=1;j<=n;j++){

                memo[i][j] = memo[i][j-1];

                if(i>=arr[j-1]){

                    memo[i][j] = memo[i][j] || memo[i-arr[j-1]][j-1];
                }

            }
        }


        return memo[sum][n];
    }
}
