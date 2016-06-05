package com.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Saikat on 02-06-2016.
 */
public class MaximumElement {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new FileReader("in"));
        Stack<Integer> s = new Stack();
        while(in.hasNext()){
            String line = in.nextLine();
            String[] arr = line.split("\\s");
            int op = Integer.parseInt(arr[0]);

            if(op==1){
                int numToPush = Integer.parseInt(arr[1]);
                s = push(s, numToPush);
            }
            else if(op==2){
                s = delete(s);
            }
            else if(op==3){
                s = printMax(s);
            }
        }
    }
    static Stack push(Stack s , int n){
        s.push(n);
        return s;
    }
    static Stack delete(Stack s){
        s.pop();
        return s;
    }
    static Stack printMax(Stack<Integer> s){
        int max = Integer.MIN_VALUE;
        Stack<Integer> t = new Stack<>();
        int x = Integer.MIN_VALUE;
        while(!s.isEmpty()){
            x = s.pop();
            if(x>max){
                max = x;
            }
            t.push(x);
        }
        while(!t.isEmpty()){
            s.push(t.pop());
        }

        System.out.println(max);
        return s;
    }
}
