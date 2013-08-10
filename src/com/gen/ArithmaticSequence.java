package com.gen;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/10/13
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArithmaticSequence {

    public static void main(String[] args){

        int[] a = {2,5,3,6,9,12,15,34,23};
        findMaxArithmaticSequence(a);

    }

    static void findMaxArithmaticSequence(int[] a){

        int maxSeq=0;
        int diff = 0;
        int curDiff = 0;
        int curSeq = 0;
        for(int i=1;i<a.length;i++){

            curDiff = a[i]-a[i-1];
            if(diff==curDiff){
                curSeq++;
                maxSeq = curSeq;
            }else{
                curSeq=0;
                diff=curDiff;
            }


        }
        System.out.print(maxSeq+1);


    }

}
