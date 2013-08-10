package com.gen;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/11/13
 * Time: 12:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class QueueUsingStack {
    Stack spush = new Stack();
    Stack spop = new Stack();

    public void enqueue(Object o){
        spush.push(o);
    }
    public Object dequeue(Object o){

        if(spop.empty()){
            while (!spush.empty()){
                spop.push(spush.pop());
            }
        }
        return spop.pop();
    }


}
