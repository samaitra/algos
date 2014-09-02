package com.cc;

import java.util.Stack;

/**
 * Created by saikat on 01/09/14.
 */
public class StackSort {

     public void mysort(int[] a){

         Stack as = new Stack();
         Stack bs = new Stack();

         for(int i=0;i<a.length;i++){

             if(as.empty()){
                 as.push(a[i]);
             }

             else if((Integer)as.peek()<a[i]){
                while(!as.empty() && (Integer)as.peek()<a[i]) {
                    bs.push(as.pop());
                }

                 as.push(a[i]);

                while(!bs.empty()){
                    as.push(bs.pop());
                 }

             }
             else if((Integer)as.peek()>a[i]){
                 as.push(a[i]);
             }


         }

         while(!as.empty()){
             System.out.print(as.pop()+ " ");
         }

     }

    public static void main(String[] args){

        int[] a = {10, 4, 8, 1};
        new StackSort().mysort(a);

    }



}
