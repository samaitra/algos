package com.hr;

import com.sun.deploy.util.ArrayUtil;

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

    static void partition(int[] ar) {
        int p = ar[0];
        int n = ar.length;
        int slen=1;
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
        smallArray[slen-1]=p;

        ar = concat(smallArray,largeArray);
        printArray(ar);


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
        partition(ar);
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