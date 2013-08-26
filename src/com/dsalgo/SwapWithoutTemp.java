package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/10/13
 * Time: 3:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class SwapWithoutTemp {

    public static void main(String[] args){

        //using XOR operation;
        int a = 2;
        int b = 4;
        a = a^b;
        b=a^b;
        a=a^b;
        System.out.println("a "+a);
        System.out.println("b "+b);

        //using arithmatic operation
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
