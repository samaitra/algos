package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/9/13
 * Time: 12:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchSortedMatrix {

    public static void main(String[] args){
        int [][] a =
                {
                { 5, 7, 8, 9 },
                { 6, 9, 11, 13 },
                { 7, 11, 12, 14 },
                { 8, 13, 16, 17 }
                };

        boolean res = search(a, 13);
        System.out.println(res);

    }

    private static boolean search(int[][] a, int i) {

        int rowLength = a.length;
        int columnLength = a[0].length;

        int currentRow = 0;
        int currentColumn = columnLength - 1;

        while(currentRow!=rowLength && currentColumn!=-1){

            if(a[currentRow][currentColumn]==i)
                return true;

            else if(a[currentRow][currentColumn]>i)
                currentColumn--;
            else
                currentRow++;

        }

        return false;
    }


}
