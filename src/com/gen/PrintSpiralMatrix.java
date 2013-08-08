package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/8/13
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class PrintSpiralMatrix {

    public static void main(String[] args){

        int a[][] = {
                { 3, 4, 5, 6, 2, 5 },
                { 2, 4, 6, 2, 5, 7 },
                { 2, 5, 7, 8, 9, 3 },
                { 2, 4, 7, 3, 5, 8 },
                { 6, 4, 7, 3, 5, 7 } };

        printSpiral(a);
    }
    public static void printSpiral(int[][] a){
        printSpiral(a,0);
    }

    private static void printSpiral(int[][] a, int d) {

        if(a==null && a.length==0)
            return;
        int r = a.length;
        int c = a[0].length;
        if(2*d>Math.min(r,c))
            return;
        for(int i=d;i<c-d-1;i++)
            System.out.print(a[d][i]+",");
        for(int i=d;i<r-d-1;i++)
            System.out.print(a[i][c-d-1]+",");
        for(int i=r-d;i>d;i--)
            System.out.print(a[r-d-1][i]+",");
        for(int i=r-d-1;i>d;--i)
            System.out.println(a[i][d]+",");

        printSpiral(a,d++);

    }



    }


