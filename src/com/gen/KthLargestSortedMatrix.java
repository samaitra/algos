package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/9/13
 * Time: 6:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class KthLargestSortedMatrix {

    public static void main(String args[]){

        int a[][] =
                {
                { 5, 7, 8, 9 },
                { 6, 9, 10, 13 },
                { 7, 11, 12, 15 },
                { 8, 13, 16, 17 }
                };

        int result = findKthLargest(a,8);
        System.out.println(result);
    }

    static int findKthLargest(int[][] a, int k){

        for(int i=0;i<a.length;i++)
            rearrange(a,a.length-1,a[0].length-1);
        return a[a.length-1][a[0].length-1];
    }

    static void rearrange(int[][] a ,int row, int col){

        int newRow = 0;
        int newCol = 0;

        if(row==0 && col==0){
            a[row][col] = Integer.MIN_VALUE;
            return;
        }
        else if(row==0){
           newRow = row;
           newCol = col-1;
        }
        else if(col==0){
            newRow = row-1;
            newCol = col;
        }
        else if(a[row][col-1]>a[row-1][col]){
            newRow = row;
            newCol = col-1;
        }
        else{
            newRow = row-1;
            newCol = col;
        }
        a[row][col] = a[newRow][newCol];
        rearrange(a,newRow,newCol);
    }

}
