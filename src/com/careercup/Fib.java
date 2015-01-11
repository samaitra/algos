package com.careercup;

/**
 * Created by saikat on 01/09/14.
 */
public class Fib {

    static int fib(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2) {
            return 2;
        }
        return fib(n-1)+fib(n-2);

    }

     public static void main(String[] args){

         System.out.print(fib(7));


     }

}
