package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 07/08/13
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class MinMax {

    static int[] arr = {1,2,4,7,5,10};
    public static void main(String[] args){

        Result r = findMinMax(arr,0,arr.length-1);
        System.out.println("Min "+r.min);
        System.out.println("Max "+r.max);

    }
    static Result findMinMax(int a[],int i,int j){

        if(i>j){
            return null;
        }
        if (i==j){
            return new Result(a[i],a[i]);
        }else{


     Result left = findMinMax(arr,i,(i+j)/2);
     Result right = findMinMax(arr,((i+j)/2+1),j);

        if(left == null)
            return right;
        else if(right == null)
            return left;
        else
            return new Result(Math.min(left.min,right.min),Math.max(left.max,right.max));
    }
   }
}
class Result{
    int min;
    int max;
    public Result(int min,int max)
    {
        this.min = min;
        this.max = max;
    }
}