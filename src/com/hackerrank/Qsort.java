package com.hackerrank;



import java.io.FileReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 04/05/13
 * Time: 11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Qsort {

    static int[] quickSort(int[] ar) {

        if(ar.length<=1){

           return ar;
        }
        else
        {
        int p = ar[0];
        int n = ar.length;
        int slen=0;
        int llen=0;

        for(int i=0;i<n;i++){
            if(ar[i]<p){
                slen++;
            }else if(ar[i]>p){
                llen++;
            }
        }

        int smallArray[] = new int[slen];
        int largeArray[] = new int[llen];
        int x=0;
        int y=0;


        for(int i=0;i<n;i++){

            if(ar[i]<p){
                smallArray[x]=ar[i];
                x++;
            }else if(ar[i]>p){
                largeArray[y]=ar[i];
                y++;
            }

        }




        //System.out.print("smallArray ");
        //printArray(smallArray);
        //System.out.print("largeArray ");
        //printArray(largeArray);
        int[] pivotArray = new int[1];
        pivotArray[0]=p;
        //System.out.print("pivotArray ");
        //printArray(pivotArray);


        smallArray = quickSort(smallArray);
        smallArray = concat(smallArray,pivotArray);
        largeArray = quickSort(largeArray);
        ar = concat(smallArray,largeArray);

        //System.out.print("ar ");
        printArray(ar);
        return ar;
        }
    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new FileReader("qsort/in"));
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar);
    }

    public static int[] concat(int [] A, int[] B) {
        int aLen = A.length;
        int bLen = B.length;
        int [] C= new int[aLen+bLen];
        System.arraycopy(A, 0, C, 0, aLen);
        System.arraycopy(B, 0, C, aLen, bLen);
        return C;
    }
}