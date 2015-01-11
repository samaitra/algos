package com.careercup;

/**
 * Created by saikat on 31/12/14.
 * WAP to modify the array such that arr[I] = arr[arr[I]].
 * Do this in place i.e. with out using additional memory.

 * example : if a = {2,3,1,0}
 * o/p = a = {1,0,3,2}

 * Note : The array contains 0 to n-1 integers.
 */
public class RelocateArray {

    static int[] relocate(int arr[],int size) {
        for(int i=0;i<size;i++) {
            arr[i] += (arr[arr[i]])*size;
        }
        for(int i=0;i<size;i++) {
            arr[i] /= size;
        }
        return arr;
    }

    public static void main(String[] args){

        int[] a = {2,3,1,0};
        int[] res = relocate(a,4);
        for(int i : res){
            System.out.print(i+" ");
        }


    }
}
