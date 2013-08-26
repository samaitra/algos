package com.dsalgo;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 8/16/13
 * Time: 8:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class StackSort {

    public static void main(String[] args){
        Stack st = new Stack();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        sort(st);
        while(!st.empty()){
            System.out.println(st.pop());
        }
    }
    public static void sort(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }
        Integer t = st.pop();
        sort(st);
        insertSorted(t,st);
        return;
    }
    public static void insertSorted(Integer t, Stack<Integer> st){
       if(st.isEmpty() || st.peek() > t){
          st.push(t);
          return;
       }
       Integer smaller = st.pop();
       insertSorted(t,st);
       st.push(smaller);
    }
}
