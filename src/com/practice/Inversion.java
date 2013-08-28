package com.practice;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 28/08/13
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Inversion {

    public static void main(String[] args){

        int[] a = {1, 20, 6, 4, 5};

        System.out.println(printSwaps(a));

    }
    public static int printSwaps(int[] a){

        int c = 0;
        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    c++;
                }
            }
        }
        return c;
    }

}
