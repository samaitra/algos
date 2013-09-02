package com.practice;

import java.util.BitSet;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 02/09/13
 * Time: 10:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class Bits {

    public static void main(String[] args){
        int x = Integer.parseInt("10000000000",2);
        int y = Integer.parseInt("10101",2);
        int i = 2, j = 6;
        Integer num = F(x,y,i,j);
        System.out.print(Integer.toBinaryString(num));

    }
    public static int F(int x, int y, int i, int j){
        int mask = (-1<<(j+1)) | (-1>>>(32-i));
        return (mask & x ) | (y<<i);
    }
}
