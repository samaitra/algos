package com.gen;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/11/13
 * Time: 12:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class StackMin {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public Integer push(Integer item){

        if(stack.empty()){
            stack.push(item);
            minStack.push(item);
            return item;
        }
        Integer curMin = minStack.peek();
        if(curMin<item){
            minStack.push(curMin);
        }else{
            minStack.push(item);
        }
        stack.push(item);
        return item;
    }

    public Integer pop(){
        if(stack.size()==0){
            return null;
        }
        minStack.pop();
        return stack.pop();
    }

    public Integer getMinimum(){
        if(minStack.empty()){
            return null;
        }
        return minStack.peek();
    }

    public int size(){
        return stack.size();
    }
}
