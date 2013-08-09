package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/9/13
 * Time: 10:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseWord {

    public static void main(String[] args){
        String str = "This is a cold day";
        String[] arr = str.split("\\s");

//        for(String s : arr){
//            System.out.print(new StringBuffer(s).reverse()+" ");
//        }

          for(int i=arr.length-1;i>=0;i--){
              System.out.print(arr[i]+" ");
          }

    }

}
