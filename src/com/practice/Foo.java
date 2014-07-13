package com.practice;

/**
 * Created by saikat on 7/13/2014.
 */
public class Foo
{
    public static synchronized void bar()
    {
        //do something
        System.out.print("bar!");
    }

    public static void main(String[] args){

        new Foo().bar();
    }
}
