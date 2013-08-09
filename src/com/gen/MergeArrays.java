package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/9/13
 * Time: 11:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeArrays {

    public static void main(String[] args){
    int a[] = {1, 2, 3, 5, 6};
    int b[] = {9 , 15, 17};

    int c[] = merge(a,b);

        for(int i:c){
            System.out.print(i+", ");
        }

    }

    static int[] merge(int a[],int b[]){

        int[] helperArray = new int[a.length+b.length];
        int index = a.length+b.length-1;
        int i = a.length-1;
        int j = b.length-1;
        while(true){

            if(a[i]>b[j]){
                helperArray[index]=a[i];
                i--;
                index--;
            }else{
                helperArray[index]=b[j];
                j--;
                index--;
            }

            if(j<0||i<0){
                break;
            }

        }

          while(index>=0){
            if(a.length>b.length){
                helperArray[index]=a[index];
            }else{
                helperArray[index]=b[index];
            }
            index--;

          }



      return helperArray;
    }

}
