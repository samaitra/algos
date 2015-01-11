package com.dsalgo;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/9/13
 * Time: 10:12 PM
 * To change this template use File | Settings | File Templates.
 * Code a function that receives a string composed by words separated
 * by spaces and returns a string where words appear in the same order
 * but than the original string, but every word is inverted.
 * Example, for this input string
 *
 *
 * @"the boy ran"
 * the output would be


 * @"eht yob nar"
 * Tell the complexity of the solution.
 */
public class ReverseWord {

    public static void main(String[] args){
        String str = "the boy ran";
        String[] arr = str.split("\\s");

        for(String s : arr){
            System.out.print(new StringBuffer(s).reverse()+" ");
        }



    }

}
