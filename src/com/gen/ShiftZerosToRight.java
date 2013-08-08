package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/8/13
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShiftZerosToRight {

    public static void main(String[] args){

        int[] a = {1,0,5,9,0,7,6,0,4};
        a = shiftZeros(a);
        for(int i : a){
            System.out.print(i+", ");
        }
    }

    public static int[] shiftZeros(int[] a){
        int left=0;
        int right=a.length-1;

        while(left<right){

            if(a[left]==0 && a[right]!=0){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
            if(a[left]!=0)
                left++;
            if(a[right]==0)
                right--;

        }




        return a;
    }


}
