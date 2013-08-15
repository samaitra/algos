package com.gen;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/16/13
 * Time: 3:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class NextSmallInteger {

    public static void main(String[] args)
    {
        int[] input={3,4,5,2,7,5,7,3,8,2,5,7,9,1,3};
        int[]output=new int[input.length];
        LinkedList<Integer> stack=new LinkedList<Integer>();
        for(int i=input.length-1;i>=0;i--){

            int cur = input[i];
            if(stack.peek() == null){
                output[i] = 0;
                stack.push(cur);
                continue;
            }

            while(stack.size() != 0 && stack.peek()>=cur){
                stack.pop();
            }
            output[i]=stack.peek()==null?0:stack.peek();
            stack.push(cur);



        }
        for(int i=0;i < output.length;++i)
        {
            System.out.print(output[i]+",");
        }
    }

}
